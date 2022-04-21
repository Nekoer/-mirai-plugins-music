package com.hcyacg.netease

import com.alibaba.fastjson.JSON
import com.hcyacg.config.Setting
import com.hcyacg.entity.NetEasePlayListDetailResponse
import com.hcyacg.entity.NetEaseTopListResponse
import com.hcyacg.utils.RequestUtil
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.message.data.At
import net.mamoe.mirai.utils.MiraiLogger
import okhttp3.Headers
import okhttp3.RequestBody

object Rank {
    private val headers = Headers.Builder()
    private val requestBody: RequestBody? = null
    private val logger = MiraiLogger.Factory.create(this::class.java)

    /**
     * 获取榜单id
     */
    suspend fun topList(event: GroupMessageEvent) {
        val page = event.message.contentToString().split(" ")
        var message = At(event.sender).plus("\n")
        try {
            val data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/toplist",
                requestBody,
                headers.build(),
                logger
            )
            val netEaseTopListResponse = JSON.parseObject(data.toString(), NetEaseTopListResponse::class.java)


            if (null == netEaseTopListResponse.list) {
                event.subject.sendMessage(message.plus("榜单无数据"))
                return
            }


            val n = page[page.size - 1].toInt() * 10 - 10
            for (i in n..n + 9) {
                if (i <= netEaseTopListResponse.list.size - 1){
                    message = message.plus("${i+1}.${netEaseTopListResponse.list[i].name}(${netEaseTopListResponse.list[i].id}) ${netEaseTopListResponse.list[i].updateFrequency}")
                        .plus("\n")
                }

            }

            val num = if(netEaseTopListResponse.list.size / 10 == 0){
                netEaseTopListResponse.list.size / 10
            }else{
                (netEaseTopListResponse.list.size / 10) + 1
            }

            event.subject.sendMessage(message.plus("当前处在${page[page.size - 1]}页,共${num}页"))
        } catch (e: Exception) {
            e.printStackTrace()
            event.subject.sendMessage(message.plus("查看榜单失败"))
        }
    }

    /**
     * 获取榜单歌曲
     */
    suspend fun playList(event: GroupMessageEvent){
        var message = At(event.sender).plus("\n")
        try{
            val key = event.message.contentToString().split(" ")

            if (key.size != 3){
                event.subject.sendMessage(message.plus("请输入正确的命令格式,${Setting.netease.command.rank} 榜单id 页码"))
                return
            }
            val data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/playlist/detail?id=${key[1]}",
                requestBody,
                headers.build(),
                logger
            )
            val netEasePlayListDetailResponse = JSON.parseObject(data.toString(), NetEasePlayListDetailResponse::class.java)

            if (netEasePlayListDetailResponse.playlist?.tracks == null){
                event.subject.sendMessage(message.plus("该榜单内容为空"))
                return
            }

            val n = key[key.size - 1].toInt() * 10 - 10
            for (i in n..n + 9) {
                if (i <= netEasePlayListDetailResponse.playlist.tracks.size - 1){
                    message = message.plus("${i+1}.${netEasePlayListDetailResponse.playlist.tracks[i].name} ${netEasePlayListDetailResponse.playlist.tracks[i].ar?.get(0)?.name} ${netEasePlayListDetailResponse.playlist.tracks[i].id}")
                        .plus("\n")
                }
            }

            val num = if(netEasePlayListDetailResponse.playlist.tracks.size / 10 == 0){
                netEasePlayListDetailResponse.playlist.tracks.size / 10
            }else{
                (netEasePlayListDetailResponse.playlist.tracks.size / 10) + 1
            }

            event.subject.sendMessage(message.plus("当前处在${key[key.size - 1]}页,共${num}页"))
        }catch (e:Exception){
            e.printStackTrace()
            event.subject.sendMessage(message.plus("查看榜单歌曲失败"))
        }
    }
}