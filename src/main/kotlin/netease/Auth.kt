package com.hcyacg.netease

import com.alibaba.fastjson.JSON
import com.hcyacg.config.Setting
import com.hcyacg.data.Data
import com.hcyacg.entity.NetEaseLoginRefreshResponse
import com.hcyacg.entity.NetEaseLoginResponse
import com.hcyacg.entity.NetEaseLoginStatusResponse
import com.hcyacg.entity.NetEaseSearchResponse
import com.hcyacg.utils.RequestUtil
import net.mamoe.mirai.utils.MiraiLogger
import okhttp3.Headers
import okhttp3.RequestBody

/**
 * 网易云音乐登录接口
 */
object Auth {
    private val headers = Headers.Builder()
    private val requestBody: RequestBody? = null
    private val logger = MiraiLogger.Factory.create(this::class.java)

    /**
     * 手机登录
     */
    fun phoneLogin(): NetEaseLoginResponse {
        return try{
            val data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/login/cellphone?password=${Setting.netease.account.password}&phone=${Setting.netease.account.phone}",
                requestBody,
                headers.build(),
                logger
            )

            JSON.parseObject(data.toString(), NetEaseLoginResponse::class.java)
        }catch (e:Exception){
            e.printStackTrace()
            NetEaseLoginResponse()
        }

    }


    /**
     * 检查登录状态
     */
    fun checkStatus():NetEaseLoginStatusResponse{
        return try{
            headers.add("cookie", Data.neteaseCookie)
            val data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/login/status",
                requestBody,
                headers.build(),
                logger
            )

            JSON.parseObject(data.toString(), NetEaseLoginStatusResponse::class.java)
        }catch (e:Exception){
            e.printStackTrace()
            NetEaseLoginStatusResponse()
        }
    }

    /**
     * 刷新登录cookie
     */
    fun refresh(): NetEaseLoginRefreshResponse {
        headers.add("cookie", Data.neteaseCookie)
        return try{
            val data = RequestUtil.requestObject(
                RequestUtil.Companion.Method.GET,
                "${Setting.neteaseDomain}/login/refresh",
                requestBody,
                headers.build(),
                logger
            )

            JSON.parseObject(data.toString(), NetEaseLoginRefreshResponse::class.java)
        }catch (e:Exception){
            e.printStackTrace()
            NetEaseLoginRefreshResponse()
        }
    }


}