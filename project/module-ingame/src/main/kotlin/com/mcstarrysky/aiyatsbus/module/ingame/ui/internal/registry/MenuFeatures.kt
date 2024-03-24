package com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.registry

import com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.MenuFeature
import com.mcstarrysky.aiyatsbus.module.ingame.ui.internal.container.SimpleRegistry
import java.util.*

object MenuFeatures : SimpleRegistry<String, MenuFeature>(TreeMap(String.CASE_INSENSITIVE_ORDER)) {
    override fun getKey(value: MenuFeature): String = value.name
}