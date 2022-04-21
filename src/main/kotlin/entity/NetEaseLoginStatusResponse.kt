package com.hcyacg.entity
import com.alibaba.fastjson.annotation.JSONField


data class NetEaseLoginStatusResponse(
    @JSONField(name = "data")
    val `data`: SData? = SData()
)

data class SData(
    @JSONField(name = "account")
    val account: SAccount? = SAccount(),
    @JSONField(name = "code")
    val code: Int? = 0,
    @JSONField(name = "profile")
    val profile: SProfile? = SProfile()
)

data class SAccount(
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
    @JSONField(name = "paidFee")
    val paidFee: Boolean? = false,
    @JSONField(name = "status")
    val status: Int? = 0,
    @JSONField(name = "tokenVersion")
    val tokenVersion: Int? = 0,
    @JSONField(name = "type")
    val type: Int? = 0,
    @JSONField(name = "userName")
    val userName: String? = "",
    @JSONField(name = "vipType")
    val vipType: Int? = 0,
    @JSONField(name = "whitelistAuthority")
    val whitelistAuthority: Int? = 0
)

data class SProfile(
    @JSONField(name = "accountStatus")
    val accountStatus: Int? = 0,
    @JSONField(name = "accountType")
    val accountType: Int? = 0,
    @JSONField(name = "anchor")
    val anchor: Boolean? = false,
    @JSONField(name = "authStatus")
    val authStatus: Int? = 0,
    @JSONField(name = "authenticated")
    val authenticated: Boolean? = false,
    @JSONField(name = "authenticationTypes")
    val authenticationTypes: Int? = 0,
    @JSONField(name = "authority")
    val authority: Int? = 0,
    @JSONField(name = "avatarDetail")
    val avatarDetail: Any? = Any(),
    @JSONField(name = "avatarImgId")
    val avatarImgId: Long? = 0,
    @JSONField(name = "avatarUrl")
    val avatarUrl: String? = "",
    @JSONField(name = "backgroundImgId")
    val backgroundImgId: Long? = 0,
    @JSONField(name = "backgroundUrl")
    val backgroundUrl: String? = "",
    @JSONField(name = "birthday")
    val birthday: Long? = 0,
    @JSONField(name = "city")
    val city: Int? = 0,
    @JSONField(name = "createTime")
    val createTime: Long? = 0,
    @JSONField(name = "defaultAvatar")
    val defaultAvatar: Boolean? = false,
    @JSONField(name = "description")
    val description: Any? = Any(),
    @JSONField(name = "detailDescription")
    val detailDescription: Any? = Any(),
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
    @JSONField(name = "lastLoginIP")
    val lastLoginIP: String? = "",
    @JSONField(name = "lastLoginTime")
    val lastLoginTime: Long? = 0,
    @JSONField(name = "locationStatus")
    val locationStatus: Int? = 0,
    @JSONField(name = "mutual")
    val mutual: Boolean? = false,
    @JSONField(name = "nickname")
    val nickname: String? = "",
    @JSONField(name = "province")
    val province: Int? = 0,
    @JSONField(name = "remarkName")
    val remarkName: Any? = Any(),
    @JSONField(name = "shortUserName")
    val shortUserName: String? = "",
    @JSONField(name = "signature")
    val signature: String? = "",
    @JSONField(name = "userId")
    val userId: Int? = 0,
    @JSONField(name = "userName")
    val userName: String? = "",
    @JSONField(name = "userType")
    val userType: Int? = 0,
    @JSONField(name = "vipType")
    val vipType: Int? = 0,
    @JSONField(name = "viptypeVersion")
    val viptypeVersion: Long? = 0
)