package com.ssblur.scriptor_mana

import com.ssblur.unfocused.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ScriptorMana : ModInitializer("scriptor_mana") {
    const val MODID = "scriptor_mana"
    val LOGGER: Logger = LoggerFactory.getLogger(id)

    fun init() {
        LOGGER.info("Scriptor Mana loaded...")
    }

    fun clientInit() {
        LOGGER.info("Scriptor Mana loaded...")
    }
}