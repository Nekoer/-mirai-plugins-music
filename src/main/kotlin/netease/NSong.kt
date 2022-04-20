package com.hcyacg.netease

import com.alibaba.fastjson.JSON
import com.hcyacg.config.Setting
import com.hcyacg.entity.NetEaseDetailResponse
import com.hcyacg.entity.NetEaseSongResponse
import com.hcyacg.utils.RequestUtil
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.message.data.At
import net.mamoe.mirai.message.data.MusicKind
import net.mamoe.mirai.message.data.MusicShare
import net.mamoe.mirai.utils.MiraiLogger
import okhttp3.Headers
import okhttp3.RequestBody

object NSong {
    private val headers = Headers.Builder()
    private val requestBody: RequestBody? = null
    private val logger = MiraiLogger.Factory.create(this::class.java)

    suspend fun load(event: GroupMessageEvent) {
        try{
            val message = At(event.sender).plus("\n")
            var key = event.message.contentToString()
            key = key.replace("${Setting.netease.command.song} ", "")

            var data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "https://docs.hcyacg.com/api/netease/detail?id=$key",
                requestBody,
                headers.build(),
                logger
            )
            val netEaseDetailResponse = JSON.parseObject(data.toString(), NetEaseDetailResponse::class.java)

            if (null == netEaseDetailResponse.songs) {
                event.subject.sendMessage(message.plus("该id没有查询到歌曲数据"))
                return
            }

            val title = netEaseDetailResponse.songs[0].name
            val author = netEaseDetailResponse.songs[0].ar?.get(0)?.name
            val cover = netEaseDetailResponse.songs[0].al?.picUrl
            val jump = "https://music.163.com/#/song?id=${netEaseDetailResponse.songs[0].id}"


            data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "https://docs.hcyacg.com/api/netease/song?id=$key",
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
            event.subject.sendMessage("出现错误")
        }
    }
}