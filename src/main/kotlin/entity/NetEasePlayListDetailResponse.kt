package com.hcyacg.entity
import com.alibaba.fastjson.annotation.JSONField


data class NetEasePlayListDetailResponse(
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "playlist")
    val playlist: Playlist? = Playlist(),
    @JSONField(name = "privileges")
    val privileges: List<PLPrivilege>? = listOf(),
    @JSONField(name = "relatedVideos")
    val relatedVideos: Any? = Any(),
    @JSONField(name = "resEntrance")
    val resEntrance: Any? = Any(),
    @JSONField(name = "sharedPrivilege")
    val sharedPrivilege: Any? = Any(),
    @JSONField(name = "urls")
    val urls: Any? = Any()
)

data class Playlist(
    @JSONField(name = "adType")
    val adType: Int? = 0,
    @JSONField(name = "backgroundCoverId")
    val backgroundCoverId: Int? = 0,
    @JSONField(name = "backgroundCoverUrl")
    val backgroundCoverUrl: Any? = Any(),
    @JSONField(name = "cloudTrackCount")
    val cloudTrackCount: Int? = 0,
    @JSONField(name = "commentCount")
    val commentCount: Int? = 0,
    @JSONField(name = "commentThreadId")
    val commentThreadId: String? = "",
    @JSONField(name = "coverImgId")
    val coverImgId: Long? = 0,
    @JSONField(name = "coverImgId_str")
    val coverImgIdStr: String? = "",
    @JSONField(name = "coverImgUrl")
    val coverImgUrl: String? = "",
    @JSONField(name = "createTime")
    val createTime: Long? = 0,
    @JSONField(name = "creator")
    val creator: Creator? = Creator(),
    @JSONField(name = "description")
    val description: String? = "",
    @JSONField(name = "englishTitle")
    val englishTitle: Any? = Any(),
    @JSONField(name = "highQuality")
    val highQuality: Boolean? = false,
    @JSONField(name = "historySharedUsers")
    val historySharedUsers: Any? = Any(),
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "newImported")
    val newImported: Boolean? = false,
    @JSONField(name = "officialPlaylistType")
    val officialPlaylistType: Any? = Any(),
    @JSONField(name = "opRecommend")
    val opRecommend: Boolean? = false,
    @JSONField(name = "ordered")
    val ordered: Boolean? = false,
    @JSONField(name = "playCount")
    val playCount: Int? = 0,
    @JSONField(name = "privacy")
    val privacy: Int? = 0,
    @JSONField(name = "remixVideo")
    val remixVideo: Any? = Any(),
    @JSONField(name = "shareCount")
    val shareCount: Int? = 0,
    @JSONField(name = "sharedUsers")
    val sharedUsers: Any? = Any(),
    @JSONField(name = "specialType")
    val specialType: Int? = 0,
    @JSONField(name = "status")
    val status: Int? = 0,
    @JSONField(name = "subscribed")
    val subscribed: Any? = Any(),
    @JSONField(name = "subscribedCount")
    val subscribedCount: Int? = 0,
    @JSONField(name = "subscribers")
    val subscribers: List<Subscriber>? = listOf(),
    @JSONField(name = "tags")
    val tags: List<Any>? = listOf(),
    @JSONField(name = "titleImage")
    val titleImage: Int? = 0,
    @JSONField(name = "titleImageUrl")
    val titleImageUrl: Any? = Any(),
    @JSONField(name = "trackCount")
    val trackCount: Int? = 0,
    @JSONField(name = "trackIds")
    val trackIds: List<TrackId>? = listOf(),
    @JSONField(name = "trackNumberUpdateTime")
    val trackNumberUpdateTime: Long? = 0,
    @JSONField(name = "trackUpdateTime")
    val trackUpdateTime: Long? = 0,
    @JSONField(name = "tracks")
    val tracks: List<Track>? = listOf(),
    @JSONField(name = "updateFrequency")
    val updateFrequency: Any? = Any(),
    @JSONField(name = "updateTime")
    val updateTime: Long? = 0,
    @JSONField(name = "userId")
    val userId: Int? = 0,
    @JSONField(name = "videoIds")
    val videoIds: Any? = Any(),
    @JSONField(name = "videos")
    val videos: Any? = Any()
)

data class PLPrivilege(
    @JSONField(name = "chargeInfoList")
    val chargeInfoList: List<PLChargeInfo>? = listOf(),
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
    val freeTrialPrivilege: PLFreeTrialPrivilege? = PLFreeTrialPrivilege(),
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "maxbr")
    val maxbr: Int? = 0,
    @JSONField(name = "paidBigBang")
    val paidBigBang: Boolean? = false,
    @JSONField(name = "payed")
    val payed: Int? = 0,
    @JSONField(name = "pc")
    val pc: Any? = Any(),
    @JSONField(name = "pl")
    val pl: Int? = 0,
    @JSONField(name = "playMaxbr")
    val playMaxbr: Int? = 0,
    @JSONField(name = "preSell")
    val preSell: Boolean? = false,
    @JSONField(name = "realPayed")
    val realPayed: Int? = 0,
    @JSONField(name = "rscl")
    val rscl: Int? = 0,
    @JSONField(name = "sp")
    val sp: Int? = 0,
    @JSONField(name = "st")
    val st: Int? = 0,
    @JSONField(name = "subp")
    val subp: Int? = 0,
    @JSONField(name = "toast")
    val toast: Boolean? = false
)

data class Creator(
    @JSONField(name = "accountStatus")
    val accountStatus: Int? = 0,
    @JSONField(name = "anchor")
    val anchor: Boolean? = false,
    @JSONField(name = "authStatus")
    val authStatus: Int? = 0,
    @JSONField(name = "authenticationTypes")
    val authenticationTypes: Int? = 0,
    @JSONField(name = "authority")
    val authority: Int? = 0,
    @JSONField(name = "avatarDetail")
    val avatarDetail: AvatarDetail? = AvatarDetail(),
    @JSONField(name = "avatarImgId")
    val avatarImgId: Long? = 0,
    @JSONField(name = "avatarImgIdStr")
    val avatarImgIdStr: String? = "",
    @JSONField(name = "avatarImgId_str")
    val avatarImgId_Str: String? = "",
    @JSONField(name = "avatarUrl")
    val avatarUrl: String? = "",
    @JSONField(name = "backgroundImgId")
    val backgroundImgId: Long? = 0,
    @JSONField(name = "backgroundImgIdStr")
    val backgroundImgIdStr: String? = "",
    @JSONField(name = "backgroundUrl")
    val backgroundUrl: String? = "",
    @JSONField(name = "birthday")
    val birthday: Int? = 0,
    @JSONField(name = "city")
    val city: Int? = 0,
    @JSONField(name = "defaultAvatar")
    val defaultAvatar: Boolean? = false,
    @JSONField(name = "description")
    val description: String? = "",
    @JSONField(name = "detailDescription")
    val detailDescription: String? = "",
    @JSONField(name = "djStatus")
    val djStatus: Int? = 0,
    @JSONField(name = "expertTags")
    val expertTags: Any? = Any(),
    @JSONField(name = "experts")
    val experts: Any? = Any(),
    @JSONField(name = "followed")
    val followed: Boolean? = false,
    @JSONField(name = "gender")
    val gender: Int? = 0,
    @JSONField(name = "mutual")
    val mutual: Boolean? = false,
    @JSONField(name = "nickname")
    val nickname: String? = "",
    @JSONField(name = "province")
    val province: Int? = 0,
    @JSONField(name = "remarkName")
    val remarkName: Any? = Any(),
    @JSONField(name = "signature")
    val signature: String? = "",
    @JSONField(name = "userId")
    val userId: Int? = 0,
    @JSONField(name = "userType")
    val userType: Int? = 0,
    @JSONField(name = "vipType")
    val vipType: Int? = 0
)

data class Subscriber(
    @JSONField(name = "accountStatus")
    val accountStatus: Int? = 0,
    @JSONField(name = "anchor")
    val anchor: Boolean? = false,
    @JSONField(name = "authStatus")
    val authStatus: Int? = 0,
    @JSONField(name = "authenticationTypes")
    val authenticationTypes: Int? = 0,
    @JSONField(name = "authority")
    val authority: Int? = 0,
    @JSONField(name = "avatarDetail")
    val avatarDetail: Any? = Any(),
    @JSONField(name = "avatarImgId")
    val avatarImgId: Long? = 0,
    @JSONField(name = "avatarImgIdStr")
    val avatarImgIdStr: String? = "",
    @JSONField(name = "avatarImgId_str")
    val avatarImgId_Str: String? = "",
    @JSONField(name = "avatarUrl")
    val avatarUrl: String? = "",
    @JSONField(name = "backgroundImgId")
    val backgroundImgId: Long? = 0,
    @JSONField(name = "backgroundImgIdStr")
    val backgroundImgIdStr: String? = "",
    @JSONField(name = "backgroundUrl")
    val backgroundUrl: String? = "",
    @JSONField(name = "birthday")
    val birthday: Int? = 0,
    @JSONField(name = "city")
    val city: Int? = 0,
    @JSONField(name = "defaultAvatar")
    val defaultAvatar: Boolean? = false,
    @JSONField(name = "description")
    val description: String? = "",
    @JSONField(name = "detailDescription")
    val detailDescription: String? = "",
    @JSONField(name = "djStatus")
    val djStatus: Int? = 0,
    @JSONField(name = "expertTags")
    val expertTags: Any? = Any(),
    @JSONField(name = "experts")
    val experts: Any? = Any(),
    @JSONField(name = "followed")
    val followed: Boolean? = false,
    @JSONField(name = "gender")
    val gender: Int? = 0,
    @JSONField(name = "mutual")
    val mutual: Boolean? = false,
    @JSONField(name = "nickname")
    val nickname: String? = "",
    @JSONField(name = "province")
    val province: Int? = 0,
    @JSONField(name = "remarkName")
    val remarkName: Any? = Any(),
    @JSONField(name = "signature")
    val signature: String? = "",
    @JSONField(name = "userId")
    val userId: Long? = 0,
    @JSONField(name = "userType")
    val userType: Int? = 0,
    @JSONField(name = "vipType")
    val vipType: Int? = 0
)

data class TrackId(
    @JSONField(name = "alg")
    val alg: Any? = Any(),
    @JSONField(name = "at")
    val at: Long? = 0,
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "lr")
    val lr: Int? = 0,
    @JSONField(name = "rcmdReason")
    val rcmdReason: String? = "",
    @JSONField(name = "sc")
    val sc: Any? = Any(),
    @JSONField(name = "t")
    val t: Int? = 0,
    @JSONField(name = "uid")
    val uid: Int? = 0,
    @JSONField(name = "v")
    val v: Int? = 0
)

data class Track(
    @JSONField(name = "a")
    val a: Any? = Any(),
    @JSONField(name = "al")
    val al: PLAl? = PLAl(),
    @JSONField(name = "alia")
    val alia: List<String>? = listOf(),
    @JSONField(name = "ar")
    val ar: List<PLAr>? = listOf(),
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
    @JSONField(name = "fee")
    val fee: Int? = 0,
    @JSONField(name = "ftype")
    val ftype: Int? = 0,
    @JSONField(name = "h")
    val h: PLH? = PLH(),
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "l")
    val l: PLL? = PLL(),
    @JSONField(name = "m")
    val m: PLM? = PLM(),
    @JSONField(name = "mark")
    val mark: Long? = 0,
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
    val pop: Int? = 0,
    @JSONField(name = "pst")
    val pst: Int? = 0,
    @JSONField(name = "publishTime")
    val publishTime: Long? = 0,
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
    @JSONField(name = "st")
    val st: Int? = 0,
    @JSONField(name = "t")
    val t: Int? = 0,
    @JSONField(name = "tns")
    val tns: List<String>? = listOf(),
    @JSONField(name = "v")
    val v: Int? = 0
)

data class AvatarDetail(
    @JSONField(name = "identityIconUrl")
    val identityIconUrl: String? = "",
    @JSONField(name = "identityLevel")
    val identityLevel: Int? = 0,
    @JSONField(name = "userType")
    val userType: Int? = 0
)

data class PLAl(
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "pic")
    val pic: Long? = 0,
    @JSONField(name = "pic_str")
    val picStr: String? = "",
    @JSONField(name = "picUrl")
    val picUrl: String? = "",
    @JSONField(name = "tns")
    val tns: List<String>? = listOf()
)

data class PLAr(
    @JSONField(name = "alias")
    val alias: List<Any>? = listOf(),
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "tns")
    val tns: List<Any>? = listOf()
)

data class PLH(
    @JSONField(name = "br")
    val br: Int? = 0,
    @JSONField(name = "fid")
    val fid: Int? = 0,
    @JSONField(name = "size")
    val size: Int? = 0,
    @JSONField(name = "vd")
    val vd: Int? = 0
)

data class PLL(
    @JSONField(name = "br")
    val br: Int? = 0,
    @JSONField(name = "fid")
    val fid: Int? = 0,
    @JSONField(name = "size")
    val size: Int? = 0,
    @JSONField(name = "vd")
    val vd: Int? = 0
)

data class PLM(
    @JSONField(name = "br")
    val br: Int? = 0,
    @JSONField(name = "fid")
    val fid: Int? = 0,
    @JSONField(name = "size")
    val size: Int? = 0,
    @JSONField(name = "vd")
    val vd: Int? = 0
)

data class PLChargeInfo(
    @JSONField(name = "chargeMessage")
    val chargeMessage: Any? = Any(),
    @JSONField(name = "chargeType")
    val chargeType: Int? = 0,
    @JSONField(name = "chargeUrl")
    val chargeUrl: Any? = Any(),
    @JSONField(name = "rate")
    val rate: Int? = 0
)

data class PLFreeTrialPrivilege(
    @JSONField(name = "resConsumable")
    val resConsumable: Boolean? = false,
    @JSONField(name = "userConsumable")
    val userConsumable: Boolean? = false
)