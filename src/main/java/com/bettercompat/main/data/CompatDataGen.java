package com.bettercompat.main.data;

import com.bettercompat.main.data.material.MaterialDataProvider;
import com.bettercompat.main.data.material.MaterialStatsDataProvider;
import com.bettercompat.main.data.material.MaterialTraitsDataProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;

public class CompatDataGen {
	
	public CompatDataGen() {
        MinecraftForge.EVENT_BUS.register(this);
	}
	
    @SubscribeEvent
    static void gatherData(final GatherDataEvent event) {
    	if (event.includeServer()) {
    		DataGenerator datagenerator = event.getGenerator();
    		AbstractMaterialDataProvider materials = new MaterialDataProvider(datagenerator);
    		datagenerator.addProvider(materials);
    		datagenerator.addProvider(new MaterialStatsDataProvider(datagenerator, materials));
    		datagenerator.addProvider(new MaterialTraitsDataProvider(datagenerator, materials));
    	}
    }
}
