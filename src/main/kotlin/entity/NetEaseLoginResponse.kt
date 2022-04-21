package com.hcyacg.entity
import com.alibaba.fastjson.annotation.JSONField


data class NetEaseLoginResponse(
    @JSONField(name = "account")
    val account: Account? = Account(),
    @JSONField(name = "bindings")
    val bindings: List<Binding>? = listOf(),
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "cookie")
    val cookie: String? = "",
    @JSONField(name = "loginType")
    val loginType: Int? = 0,
    @JSONField(name = "profile")
    val profile: Profile? = Profile(),
    @JSONField(name = "token")
    val token: String? = ""
)

data class Account(
    @JSONField(name = "anonimousUser")
    val anonimousUser: Boolean? = false,
    @JSONField(name = "ban")
    val ban: Int? = 0,
    @JSONField(name = "baoyueVersion")
    val baoyueVersion: Int? = 0,
    @JSONField(name = "createTime")
    val createTime: Long? = 0,
    @JSONField(name = "donateVersion")
    val donateVersion: Int? = 0,
    @JSONField(name = "id")
    val id: Int? = 0,
    @JSONField(name = "salt")
    val salt: String? = "",
    @JSONField(name = "status")
    val status: Int? = 0,
    @JSONField(name = "tokenVersion")
    val tokenVersion: Int? = 0,
    @JSONField(name = "type")
    val type: Int? = 0,
    @JSONField(name = "uninitialized")
    val uninitialized: Boolean? = false,
    @JSONField(name = "userName")
    val userName: String? = "",
    @JSONField(name = "vipType")
    val vipType: Int? = 0,
    @JSONField(name = "viptypeVersion")
    val viptypeVersion: Long? = 0,
    @JSONField(name = "whitelistAuthority")
    val whitelistAuthority: Int? = 0
)

data class Binding(
    @JSONField(name = "bindingTime")
    val bindingTime: Long? = 0,
    @JSONField(name = "expired")
    val expired: Boolean? = false,
    @JSONField(name = "expiresIn")
    val expiresIn: Int? = 0,
    @JSONField(name = "id")
    val id: Long? = 0,
    @JSONField(name = "refreshTime")
    val refreshTime: Int? = 0,
    @JSONField(name = "tokenJsonStr")
    val tokenJsonStr: String? = "",
    @JSONField(name = "type")
    val type: Int? = 0,
    @JSONField(name = "url")
    val url: String? = "",
    @JSONField(name = "userId")
    val userId: Int? = 0
)

data class Profile(
    @JSONField(name = "accountStatus")
    val accountStatus: Int? = 0,
    @JSONField(name = "authStatus")
    val authStatus: Int? = 0,
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
    val birthday: Long? = 0,
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
    @JSONField(name = "eventCount")
    val eventCount: Int? = 0,
    @JSONField(name = "expertTags")
    val expertTags: Any? = Any(),
    @JSONField(name = "experts")
    val experts: Experts? = Experts(),
    @JSONField(name = "followed")
    val followed: Boolean? = false,
    @JSONField(name = "followeds")
    val followeds: Int? = 0,
    @JSONField(name = "follows")
    val follows: Int? = 0,
    @JSONField(name = "gender")
    val gender: Int? = 0,
    @JSONField(name = "mutual")
    val mutual: Boolean? = false,
    @JSONField(name = "nickname")
    val nickname: String? = "",
    @JSONField(name = "playlistBeSubscribedCount")
    val playlistBeSubscribedCount: Int? = 0,
    @JSONField(name = "playlistCount")
    val playlistCount: Int? = 0,
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

class Experts