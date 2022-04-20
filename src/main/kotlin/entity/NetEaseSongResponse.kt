package com.hcyacg.entity
import com.alibaba.fastjson.annotation.JSONField


data class NetEaseSongResponse(
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "data")
    val `data`: List<Data>? = listOf()
)

data class Data(
    @JSONField(name = "br")
    val br: Int? = 0,
    @JSONField(name = "canExtend")
    val canExtend: Boolean? = false,
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "encodeType")
    val encodeType: String? = "",
    @JSONField(name = "expi")
    val expi: Int? = 0,
    @JSONField(name = "fee")
    val fee: Int? = 0,
    @JSONField(name = "flag")
    val flag: Int? = 0,
    @JSONField(name = "freeTimeTrialPrivilege")
    val freeTimeTrialPrivilege: SongFreeTimeTrialPrivilege? = SongFreeTimeTrialPrivilege(),
    @JSONField(name = "freeTrialInfo")
    val freeTrialInfo: Any? = Any(),
    @JSONField(name = "freeTrialPrivilege")
    val freeTrialPrivilege: SongFreeTrialPrivilege? = SongFreeTrialPrivilege(),
    @JSONField(name = "gain")
    val gain: Double? = 0.0,
    @JSONField(name = "id")
    val id: Int? = 0,
    @JSONField(name = "level")
    val level: String? = "",
    @JSONField(name = "md5")
    val md5: String? = "",
    @JSONField(name = "payed")
    val payed: Int? = 0,
    @JSONField(name = "size")
    val size: Int? = 0,
    @JSONField(name = "type")
    val type: String? = "",
    @JSONField(name = "uf")
    val uf: Any? = Any(),
    @JSONField(name = "url")
    val url: String? = "",
    @JSONField(name = "urlSource")
    val urlSource: Int? = 0
)

data class SongFreeTimeTrialPrivilege(
    @JSONField(name = "remainTime")
    val remainTime: Int? = 0,
    @JSONField(name = "resConsumable")
    val resConsumable: Boolean? = false,
    @JSONField(name = "type")
    val type: Int? = 0,
    @JSONField(name = "userConsumable")
    val userConsumable: Boolean? = false
)

data class SongFreeTrialPrivilege(
    @JSONField(name = "listenType")
    val listenType: Any? = Any(),
    @JSONField(name = "resConsumable")
    val resConsumable: Boolean? = false,
    @JSONField(name = "userConsumable")
    val userConsumable: Boolean? = false
)