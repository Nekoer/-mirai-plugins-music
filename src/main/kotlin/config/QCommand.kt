package com.hcyacg.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class QCommand(
    @SerialName("search")
    var search: String = "qq",
)