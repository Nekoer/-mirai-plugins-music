package com.hcyacg.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NetEase(
    @SerialName("command")
    val command: NCommand = NCommand()
)