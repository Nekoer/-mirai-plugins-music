package com.hcyacg.entity
import com.alibaba.fastjson.annotation.JSONField


data class NetEaseTopListResponse(
    @JSONField(name = "artistToplist")
    val artistToplist: ArtistToplist? = ArtistToplist(),
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "list")
    val list: List<TopList>? = listOf()
)

data class ArtistToplist(
    @JSONField(name = "coverUrl")
    val coverUrl: String? = "",
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "position")
    val position: Int? = 0,
    @JSONField(name = "upateFrequency")
    val upateFrequency: String? = "",
    @JSONField(name = "updateFrequency")
    val updateFrequency: String? = ""
)

data class TopList(
    @JSONField(name = "adType")
    val adType: Int? = 0,
    @JSONField(name = "anonimous")
    val anonimous: Boolean? = false,
    @JSONField(name = "artists")
    val artists: Any? = Any(),
    @JSONField(name = "backgroundCoverId")
    val backgroundCoverId: Int? = 0,
    @JSONField(name = "backgroundCoverUrl")
    val backgroundCoverUrl: Any? = Any(),
    @JSONField(name = "cloudTrackCount")
    val cloudTrackCount: Int? = 0,
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
    val creator: Any? = Any(),
    @JSONField(name = "description")
    val description: String? = "",
    @JSONField(name = "englishTitle")
    val englishTitle: Any? = Any(),
    @JSONField(name = "highQuality")
    val highQuality: Boolean? = false,
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "name")
    val name: String? = "",
    @JSONField(name = "newImported")
    val newImported: Boolean? = false,
    @JSONField(name = "opRecommend")
    val opRecommend: Boolean? = false,
    @JSONField(name = "ordered")
    val ordered: Boolean? = false,
    @JSONField(name = "playCount")
    val playCount: Long? = 0,
    @JSONField(name = "privacy")
    val privacy: Int? = 0,
    @JSONField(name = "recommendInfo")
    val recommendInfo: Any? = Any(),
    @JSONField(name = "specialType")
    val specialType: Int? = 0,
    @JSONField(name = "status")
    val status: Int? = 0,
    @JSONField(name = "subscribed")
    val subscribed: Any? = Any(),
    @JSONField(name = "subscribedCount")
    val subscribedCount: Int? = 0,
    @JSONField(name = "subscribers")
    val subscribers: List<Any>? = listOf(),
    @JSONField(name = "tags")
    val tags: List<String>? = listOf(),
    @JSONField(name = "titleImage")
    val titleImage: Int? = 0,
    @JSONField(name = "titleImageUrl")
    val titleImageUrl: Any? = Any(),
    @JSONField(name = "ToplistType")
    val toplistType: String? = "",
    @JSONField(name = "totalDuration")
    val totalDuration: Int? = 0,
    @JSONField(name = "trackCount")
    val trackCount: Int? = 0,
    @JSONField(name = "trackNumberUpdateTime")
    val trackNumberUpdateTime: Long? = 0,
    @JSONField(name = "trackUpdateTime")
    val trackUpdateTime: Long? = 0,
    @JSONField(name = "tracks")
    val tracks: Any? = Any(),
    @JSONField(name = "updateFrequency")
    val updateFrequency: String? = "",
    @JSONField(name = "updateTime")
    val updateTime: Long? = 0,
    @JSONField(name = "userId")
    val userId: Long? = 0
)