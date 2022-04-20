package com.hcyacg.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class QQ {
    @SerialName("command")
    val command: QCommand = QCommand()
}