package com.hcyacg.netease

import com.alibaba.fastjson.JSON
import com.hcyacg.config.Setting
import com.hcyacg.data.Data
import com.hcyacg.entity.NetEaseSearchResponse
import com.hcyacg.entity.NetEaseSongResponse
import com.hcyacg.utils.RequestUtil
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.message.data.At
import net.mamoe.mirai.message.data.MusicKind
import net.mamoe.mirai.message.data.MusicShare
import net.mamoe.mirai.utils.MiraiLogger
import okhttp3.Headers
import okhttp3.RequestBody

object Netease {
    private val headers = Headers.Builder()
    private val requestBody: RequestBody? = null
    private val logger = MiraiLogger.Factory.create(this::class.java)


    /**
     * 搜索歌曲
     */
    suspend fun search(event: GroupMessageEvent) {
        var message = At(event.sender).plus("\n")
        var key = event.message.contentToString()

        key = key.replace("${Setting.netease.command.search} ", "")
        val temp = key.split(" ")

        if (temp.size < 2) {
            event.subject.sendMessage(message.plus("请输入正确的搜索命令格式 ${Setting.netease.command.search} 歌曲名 页码"))
            return
        }

        var offset = temp[temp.size - 1].toInt() * 10 - 10
        try {
            headers.add("cookie", Data.neteaseCookie)
            val data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/cloudsearch?keywords=${temp[0]}&type=1&limit=10&offset=$offset",
                requestBody,
                headers.build(),
                logger
            )
            val netEaseSearchResponse = JSON.parseObject(data.toString(), NetEaseSearchResponse::class.java)

            if (null == netEaseSearchResponse.result){
                event.subject.sendMessage(message.plus("该页没有数据"))
                return
            }
            if (null == netEaseSearchResponse.result.songs){
                event.subject.sendMessage(message.plus("该页没有数据"))
                return
            }

            for ((index,item) in netEaseSearchResponse.result.songs.withIndex()){
                message = if (index == netEaseSearchResponse.result.songs.size - 1){
                    message.plus("${++offset}. ${item.name} - ${item.ar?.get(0)?.name} - ${item.id}")
                }else{
                    message.plus("${++offset}. ${item.name} - ${item.ar?.get(0)?.name} - ${item.id}").plus("\n")
                }
            }

            event.subject.sendMessage(message)
        } catch (e: Exception) {
            e.printStackTrace()
            event.subject.sendMessage("出现错误")
        }
    }

    suspend fun obscure(event: GroupMessageEvent){
        val message = At(event.sender).plus("\n")
        val key = event.message.contentToString().replace("${Setting.netease.command.obscure} ","")
        try{
            headers.add("cookie", Data.neteaseCookie)
            var data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/cloudsearch?keywords=${key}&type=1&limit=10&offset=0",
                requestBody,
                headers.build(),
                logger
            )
            val netEaseSearchResponse = JSON.parseObject(data.toString(), NetEaseSearchResponse::class.java)
            if (null == netEaseSearchResponse.result){
                event.subject.sendMessage(message.plus("模糊搜索未搜索到数据"))
                return
            }
            if (null == netEaseSearchResponse.result.songs){
                event.subject.sendMessage(message.plus("模糊搜索未搜索到数据"))
                return
            }

            val title = netEaseSearchResponse.result.songs[0].name
            val author = netEaseSearchResponse.result.songs[0].ar?.get(0)?.name
            val cover = netEaseSearchResponse.result.songs[0].al?.picUrl
            val jump = "https://music.163.com/#/song?id=${netEaseSearchResponse.result.songs[0].id}"


            data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/song/url?id=${netEaseSearchResponse.result.songs[0].id}&realIP=116.25.146.177",
                requestBody,
                headers.build(),
                logger
            )
            val netEaseSongResponse = JSON.parseObject(data.toString(), NetEaseSongResponse::class.java)
            if (null == netEaseSongResponse.data) {
                event.subject.sendMessage(message.plus("该歌曲没有源曲数据"))
                return
            }


            val song = netEaseSongResponse.data[0].url

            event.subject.sendMessage(
                MusicShare(
                    kind = MusicKind.NeteaseCloudMusic,
                    title = title.toString(),
                    summary = author.toString(),
                    brief = "[分享]${title.toString()}/${author.toString()}",
                    jumpUrl = jump,
                    pictureUrl = cover.toString(),
                    musicUrl = song.toString()
                )
            )
        }catch (e:Exception){
            e.printStackTrace()
            event.subject.sendMessage(message.plus("模糊点歌错误"))
        }
    }
}