package com.ssblur.scriptor_mana.neo;

import com.ssblur.scriptor_mana.ScriptorMana;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(ScriptorMana.MODID)
public final class ScriptorManaNeoForge {
    public ScriptorManaNeoForge() {
        ScriptorMana.INSTANCE.init();
        if (FMLEnvironment.dist == Dist.CLIENT) {
            ScriptorMana.INSTANCE.clientInit();
        }
    }
}
