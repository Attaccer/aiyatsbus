package com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.feature

import com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.MenuFeature
import com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.data.ActionContext
import com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.function.value
import com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.registry.MenuOpeners

@Suppress("unused")
object OpenFeature : MenuFeature() {

    override val name: String = "Open"

    override fun handle(context: ActionContext) {
        val keyword = context.extra.value<String>("keyword")
        requireNotNull(MenuOpeners[keyword]) { "未知的 MenuOpener: $keyword" }(context)
    }

}