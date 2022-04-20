package com.hcyacg

import com.hcyacg.config.Setting
import com.hcyacg.netease.NSong
import com.hcyacg.netease.Netease
import net.mamoe.mirai.console.extension.PluginComponentStorage
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.globalEventChannel
import net.mamoe.mirai.event.subscribeGroupMessages
import java.util.regex.Pattern

object Music : KotlinPlugin(
    JvmPluginDescription(
        id = "com.hcyacg.music",
        name = "音乐插件",
        version = "1.0",
    ) {
        author("Nekoer")
        info("""音乐插件""")
    }
){

    override fun onDisable() {
        super.onDisable()
    }

    override fun onEnable() {
        Setting.reload()

        globalEventChannel().subscribeGroupMessages {
            val nSearch: Pattern = Pattern.compile("(?i)^(${Setting.netease.command.search}) ([\\s\\S]*) (\\d*[1-9]\\d*)\$")
            content { nSearch.matcher(message.contentToString()).find() } quoteReply { Netease.load(this) }

            val nSong: Pattern = Pattern.compile("(?i)^(${Setting.netease.command.song}) (\\d*[1-9]\\d*)\$")
            content { nSong.matcher(message.contentToString()).find()  } quoteReply { NSong.load(this) }
        }
    }

    override fun PluginComponentStorage.onLoad() {

    }
}