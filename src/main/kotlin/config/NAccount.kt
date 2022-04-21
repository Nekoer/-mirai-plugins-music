package com.hcyacg.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NAccount (
    @SerialName("phone")
    var phone: String = "",
    @SerialName("password")
    var password:String = ""
)