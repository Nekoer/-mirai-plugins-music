package com.hcyacg.config

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueName
import net.mamoe.mirai.console.data.value

object Setting : AutoSavePluginConfig("Setting") {

    //    @ValueName("admins")
//    var admins: MutableList<String> by value()
//    @ValueName("groups")
//    var groups: MutableList<String> by value()
    @ValueName("neteaseDomain")
    var neteaseDomain: String by value("https://netease-cloud-music-api-two-iota.vercel.app")

    @ValueName("netease")
    var netease: NetEase by value()

    @ValueName("qq")
    var qq: QQ by value()


}