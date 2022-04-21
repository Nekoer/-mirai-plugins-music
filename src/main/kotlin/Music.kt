package com.hcyacg

import com.hcyacg.config.Setting
import com.hcyacg.data.Data
import com.hcyacg.netease.Auth
import com.hcyacg.netease.NSong
import com.hcyacg.netease.Netease
import com.hcyacg.netease.Rank
import net.mamoe.mirai.console.extension.PluginComponentStorage
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.globalEventChannel
import net.mamoe.mirai.event.subscribeGroupMessages
import org.apache.commons.lang3.StringUtils
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
) {

    override fun onDisable() {
        Data.save()
    }

    override fun onEnable() {
        /**
         * 检查网易云账号是否填写
         */
        Setting.reload()
        Data.reload()

        if (StringUtils.isBlank(Setting.netease.account.phone) || StringUtils.isBlank(Setting.netease.account.password)) {
            logger.warning("您的手机号或者密码为空,请填写完整再开启机器人")
            return
        }

        /**
         * 检查网易云cookie是否已存在
         */
        if (StringUtils.isBlank(Data.neteaseCookie)) {
            //不存在则登录
            val phoneLogin = Auth.phoneLogin()
            if (phoneLogin.code == 200 && null != phoneLogin.cookie) {
                Data.neteaseCookie = phoneLogin.cookie
                logger.info("网易云账号登录成功")
            } else {
                logger.warning("网易云账号登录失败,状态码：${phoneLogin.code}")
            }
        } else {
            //存在则检查登录状态
            val checkStatus = Auth.checkStatus()
            if (null != checkStatus.data && checkStatus.data.code == 200) {
                logger.info("网易云账号状态检查成功")
            } else {
                val refresh = Auth.refresh()
                if (refresh.code == 200 && null != refresh.cookie) {
                    Data.neteaseCookie = refresh.cookie
                    logger.info("网易云账号刷新成功")
                }else{
                    logger.warning("网易云账号刷新失败,请重新登录")
                }
            }
        }

        Data.save()



        globalEventChannel().subscribeGroupMessages {
            val nSearch: Pattern =
                Pattern.compile("(?i)^(${Setting.netease.command.search}) ([\\s\\S]*) (\\d*[1-9]\\d*)\$")
            content { nSearch.matcher(message.contentToString()).find() } quoteReply { Netease.search(this) }

            val nSong: Pattern = Pattern.compile("(?i)^(${Setting.netease.command.song}) (\\d*[1-9]\\d*)\$")
            content { nSong.matcher(message.contentToString()).find() } quoteReply { NSong.load(this) }

            val nList: Pattern = Pattern.compile("(?i)^(${Setting.netease.command.list}) (\\d*[1-9]\\d*)\$")
            content { nList.matcher(message.contentToString()).find() } quoteReply { Rank.topList(this)}

            val nRank: Pattern = Pattern.compile("(?i)^(${Setting.netease.command.rank}) (\\d*[1-9]\\d*) (\\d*[1-9]\\d*)\$")
            content { nRank.matcher(message.contentToString()).find() } quoteReply { Rank.playList(this)}

            val nObscure: Pattern = Pattern.compile("(?i)^(${Setting.netease.command.obscure}) ([\\s\\S]*)\$")
            content { nObscure.matcher(message.contentToString()).find() } quoteReply { Netease.obscure(this)}

        }
    }

}