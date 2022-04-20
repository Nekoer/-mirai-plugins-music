package com.hcyacg.netease

import com.alibaba.fastjson.JSON
import com.hcyacg.config.Setting
import com.hcyacg.entity.NetEaseSearchResponse
import com.hcyacg.utils.RequestUtil
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.message.data.At
import net.mamoe.mirai.utils.MiraiLogger
import okhttp3.Headers
import okhttp3.RequestBody

object Netease {
    private val headers = Headers.Builder()
    private val requestBody: RequestBody? = null
    private val logger = MiraiLogger.Factory.create(this::class.java)

    suspend fun load(event: GroupMessageEvent) {
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
            val data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "https://docs.hcyacg.com/api/netease/search?s=${temp[0]}&search_type=1&limit=10&offset=$offset",
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
}