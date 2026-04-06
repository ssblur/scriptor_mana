package com.ssblur.scriptor_mana.fabric;

import com.ssblur.scriptor_mana.ScriptorMana;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class ScriptorManaFabric implements ModInitializer, ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScriptorMana.INSTANCE.clientInit();
    }

    @Override
    public void onInitialize() {
        ScriptorMana.INSTANCE.init();
    }
}
