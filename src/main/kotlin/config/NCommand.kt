package com.hcyacg.config

import kotlinx.serialization.*

@Serializable
data class NCommand(
    @SerialName("search")
    var search: String = "wy",
    @SerialName("song")
    var song:String = "wyid"
)