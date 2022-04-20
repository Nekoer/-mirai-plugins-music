package com.hcyacg.entity
import com.alibaba.fastjson.annotation.JSONField


data class NetEaseDetailResponse(
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "privileges")
    val privileges: List<NDPrivilege>? = listOf(),
    @JSONField(name = "songs")
    val songs: List<NDSong>? = listOf()
)

data class NDPrivilege(
    @JSONField(name = "chargeInfoList")
    val chargeInfoList: List<NDChargeInfo>? = listOf(),
    @JSONField(name = "cp")
    val cp: Int? = 0,
    @JSONField(name = "cs")
    val cs: Boolean? = false,
    @JSONField(name = "dl")
    val dl: Int? = 0,
    @JSONField(name = "downloadMaxbr")
    val downloadMaxbr: Int? = 0,
    @JSONField(name = "fee")
    val fee: Int? = 0,
    @JSONField(name = "fl")
    val fl: Int? = 0,
    @JSONField(name = "flag")
    val flag: Int? = 0,
    @JSONField(name = "freeTrialPrivilege")
    val freeTrialPrivilege: NDFreeTrialPrivilege? = NDFreeTrialPrivilege(),
    @JSONField(name = "id")
    val id: Int? = 0,
    @JSONField(name = "maxbr")
    val maxbr: Int? = 0,
    @JSONField(name = "payed")
    val payed: Int? = 0,
    @JSONField(name = "pl")
    val pl: Int? = 0,
    @JSONField(name = "playMaxbr")
    val playMaxbr: Int? = 0,
    @JSONField(name = "preSell")
    val preSell: Boolean? = false,
    @JSONField(name = "rscl")
    val rscl: Any? = Any(),
    @JSONField(name = "sp")
    val sp: Int? = 0,
    @JSONField(name = "st")
    val st: Int? = 0,
    @JSONField(name = "subp")
    val subp: Int? = 0,
    @JSONField(name = "toast")
    val toast: Boolean? = false
)

data class NDSong(
    @JSONField(name = "a")
    val a: Any? = Any(),
    @JSONField(name = "al")
    val al: NDAl? = NDAl(),
    @JSONField(name = "alia")
    val alia: List<String>? = listOf(),
    @JSONField(name = "ar")
    val ar: List<NDAr>? = listOf(),
    @JSONField(name = "cd")
    val cd: String? = "",
    @JSONField(name = "cf")
    val cf: String? = "",
    @JSONField(name = "copyright")
    val copyright: Int? = 0,
    @JSONField(name = "cp")
    val cp: Int? = 0,
    @JSONField(name = "crbt")
    val crbt: Any? = Any(),
    @JSONField(name = "djId")
    val djId: Int? = 0,
    @JSONField(name = "dt")
    val dt: Int? = 0,
    @JSONField(name = "entertainmentTags")
    val entertainmentTags: Any? = Any(),
    @JSONField(name = "fee")
    val fee: Int? = 0,
    @JSONField(name = "ftype")
    val ftype: Int? = 0,
    @JSONField(name = "h")
    val h: NDH? = NDH(),
    @JSONField(name = "id")
    val id: Int? = 0,
    @JSONField(name = "l")
    val l: NDL? = NDL(),
    @JSONField(name = "m")
    val m: NDM? = NDM(),
    @JSONField(name = "mark")
    val mark: Int? = 0,
    @JSONField(name = "mst")
    val mst: Int? = 0,
    @JSONField(name = "mv")
    val mv: Int? = 0,
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "no")
    val no: Int? = 0,
    @JSONField(name = "noCopyrightRcmd")
    val noCopyrightRcmd: Any? = Any(),
    @JSONField(name = "originCoverType")
    val originCoverType: Int? = 0,
    @JSONField(name = "originSongSimpleData")
    val originSongSimpleData: Any? = Any(),
    @JSONField(name = "pop")
    val pop: Double? = 0.0,
    @JSONField(name = "pst")
    val pst: Int? = 0,
    @JSONField(name = "publishTime")
    val publishTime: Long? = 0,
    @JSONField(name = "resourceState")
    val resourceState: Boolean? = false,
    @JSONField(name = "rt")
    val rt: String? = "",
    @JSONField(name = "rtUrl")
    val rtUrl: Any? = Any(),
    @JSONField(name = "rtUrls")
    val rtUrls: List<Any>? = listOf(),
    @JSONField(name = "rtype")
    val rtype: Int? = 0,
    @JSONField(name = "rurl")
    val rurl: Any? = Any(),
    @JSONField(name = "s_id")
    val sId: Int? = 0,
    @JSONField(name = "single")
    val single: Int? = 0,
    @JSONField(name = "songJumpInfo")
    val songJumpInfo: Any? = Any(),
    @JSONField(name = "st")
    val st: Int? = 0,
    @JSONField(name = "t")
    val t: Int? = 0,
    @JSONField(name = "tagPicList")
    val tagPicList: Any? = Any(),
    @JSONField(name = "v")
    val v: Int? = 0,
    @JSONField(name = "version")
    val version: Int? = 0
)

data class NDChargeInfo(
    @JSONField(name = "chargeMessage")
    val chargeMessage: Any? = Any(),
    @JSONField(name = "chargeType")
    val chargeType: Int? = 0,
    @JSONField(name = "chargeUrl")
    val chargeUrl: Any? = Any(),
    @JSONField(name = "rate")
    val rate: Int? = 0
)

data class NDFreeTrialPrivilege(
    @JSONField(name = "resConsumable")
    val resConsumable: Boolean? = false,
    @JSONField(name = "userConsumable")
    val userConsumable: Boolean? = false
)

data class NDAl(
    @JSONField(name = "id")
    val id: Int? = 0,
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "pic")
    val pic: Long? = 0,
    @JSONField(name = "pic_str")
    val picStr: String? = "",
    @JSONField(name = "picUrl")
    val picUrl: String? = "",
    @JSONField(name = "tns")
    val tns: List<Any>? = listOf()
)

data class NDAr(
    @JSONField(name = "alias")
    val alias: List<Any>? = listOf(),
    @JSONField(name = "id")
    val id: Int? = 0,
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "tns")
    val tns: List<Any>? = listOf()
)

data class NDH(
    @JSONField(name = "br")
    val br: Int? = 0,
    @JSONField(name = "fid")
    val fid: Int? = 0,
    @JSONField(name = "size")
    val size: Int? = 0,
    @JSONField(name = "vd")
    val vd: Double? = 0.0
)

data class NDL(
    @JSONField(name = "br")
    val br: Int? = 0,
    @JSONField(name = "fid")
    val fid: Int? = 0,
    @JSONField(name = "size")
    val size: Int? = 0,
    @JSONField(name = "vd")
    val vd: Double? = 0.0
)

data class NDM(
    @JSONField(name = "br")
    val br: Int? = 0,
    @JSONField(name = "fid")
    val fid: Int? = 0,
    @JSONField(name = "size")
    val size: Int? = 0,
    @JSONField(name = "vd")
    val vd: Double? = 0.0
)