package com.hcyacg.config

import kotlinx.serialization.*

@Serializable
data class NCommand(
    @SerialName("obscure")
    var obscure:String="点歌",
    @SerialName("search")
    var search: String = "wy",
    @SerialName("song")
    var song:String = "wyid",
    @SerialName("list")
    var list :String = "list",
    @SerialName("rank")
    var rank :String = "rank"
)