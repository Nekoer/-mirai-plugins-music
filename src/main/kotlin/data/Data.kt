package com.hcyacg.data

import com.hcyacg.config.Setting.provideDelegate
import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.AutoSavePluginData
import net.mamoe.mirai.console.data.ValueName
import net.mamoe.mirai.console.data.value

object Data : AutoSavePluginData("Data"){
    @ValueName("neteaseCookie")
    var neteaseCookie: String by value()
    @ValueName("qqCookie")
    var qqCookie: String by value()
}