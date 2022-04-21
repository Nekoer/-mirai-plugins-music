package com.hcyacg.entity
import com.alibaba.fastjson.annotation.JSONField


data class NetEaseLoginRefreshResponse(
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "cookie")
    val cookie: String? = ""
)