package com.bettercompat.main.data.material;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialStatsDataProvider;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.HandleMaterialStats;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;

public class MaterialStatsDataProvider extends AbstractMaterialStatsDataProvider {

	public MaterialStatsDataProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
		super(gen, materials);
	}

	@Override
	public String getName() {
		return "BetterCompat Material Stats";
	}

	@Override
	protected void addMaterialStats() {
		addMaterialStats(MaterialIds.aurinium,
				new HeadMaterialStats(1500, 8.5f, 5, 5f),
				new HandleMaterialStats(0.8f, 1.1f, 1.25f, 1.05f),
				new ExtraMaterialStats());
		
		//minecraft
		addMaterialStats(MaterialIds.blaze_rod,
				new HeadMaterialStats(175, 3.0f, 1, 1.5f),
				new HandleMaterialStats(1.0f, 0.85f, 1.0f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.diamond,
				new HeadMaterialStats(1550, 8.0f, 3, 3.0f),
				new HandleMaterialStats(1.0f, 1.0f, 1.2f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.emerald,
				new HeadMaterialStats(1850, 9.0f, 3, 4.0f),
				new HandleMaterialStats(1.2f, 1.0f, 1.2f, 1.0f),
				new ExtraMaterialStats());
		
		//betterendforge
		addMaterialStats(MaterialIds.amber,
				new HeadMaterialStats(500, 3.0f, 1, 1.5f),
				new HandleMaterialStats(1.0f, 1.0f, 1.1f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.thallasium,
				new HeadMaterialStats(350, 5.0f, 2, 1.5f),
				new HandleMaterialStats(0.9f, 1.0f, 1.0f, 1.2f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.terminite,
				new HeadMaterialStats(1250, 6.0f, 3, 3.0f),
				new HandleMaterialStats(1.2f, 1.0f, 1.4f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.aeternium,
				new HeadMaterialStats(2200, 9.0f, 4, 4.5f),
				new HandleMaterialStats(1.4f, 1.5f, 1.0f, 1.0f),
				new ExtraMaterialStats());
		
		//betternether
		addMaterialStats(MaterialIds.cincinnasite,
				new HeadMaterialStats(550, 6.0f, 2, 2.5f),
				new HandleMaterialStats(1.1f, 1.0f, 1.1f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.ruby,
				new HeadMaterialStats(1500, 4.0f, 3, 2.0f),
				new HandleMaterialStats(1.0f, 1.1f, 1.0f, 1.2f),
				new ExtraMaterialStats());
		
		//oresabovediamonds
		addMaterialStats(MaterialIds.amethyst,
				new HeadMaterialStats(2600, 10.0f, 4, 4.0f),
				new HandleMaterialStats(1.0f, 1.2f, 1.0f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.blackopal,
				new HeadMaterialStats(5200, 11.0f, 5, 5.0f),
				new HandleMaterialStats(1.0f, 1.0f, 1.3f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.netheriteopal,
				new HeadMaterialStats(6300, 12.0f, 5, 6.0f),
				new HandleMaterialStats(1.2f, 1.1f, 1.5f, 1.0f),
				new ExtraMaterialStats());
		
		//iceandfire
		addMaterialStats(MaterialIds.dragonbone,
				new HeadMaterialStats(1600, 8.0f, 4, 3.5f),
				new HandleMaterialStats(1.2f, 0.9f, 0.9f, 1.2f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.sapphire,
				new HeadMaterialStats(2600, 9.0f, 4, 4.0f),
				new HandleMaterialStats(1.0f, 1.0f, 1.2f, 1.2f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.firedragonsteel,
				new HeadMaterialStats(8000, 10.0f, 5, 25.0f),
				new HandleMaterialStats(1.2f, 0.95f, 0.95f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.icedragonsteel,
				new HeadMaterialStats(8000, 10.0f, 5, 25.0f),
				new HandleMaterialStats(1.0f, 1.1f, 1.1f, 0.9f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.lightningdragonsteel,
				new HeadMaterialStats(8000, 10.0f, 5, 25.0f),
				new HandleMaterialStats(0.9f, 0.95f, 1.2f, 1.1f),
				new ExtraMaterialStats());
		
		//endreborn
		addMaterialStats(MaterialIds.endorium,
				new HeadMaterialStats(1200, 8.0f, 3, 4.0f),
				new HandleMaterialStats(1.1f, 1.1f, 1.0f, 1.0f),
				new ExtraMaterialStats());
		
		//botania
		addMaterialStats(MaterialIds.livingwood,
				new HeadMaterialStats(120, 2.5f, 0, 0.8f),
				new HandleMaterialStats(1.0f, 1.0f, 1.0f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.manasteel,
				new HeadMaterialStats(400, 7.0f, 3, 4.0f),
				new HandleMaterialStats(1.0f, 1.1f, 1.0f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.elementium,
				new HeadMaterialStats(900, 7.0f, 3, 4.0f),
				new HandleMaterialStats(1.0f, 1.0f, 1.0f, 1.1f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.terrasteel,
				new HeadMaterialStats(1400, 8.0f, 4, 4.5f),
				new HandleMaterialStats(1.0f, 1.2f, 1.0f, 1.1f),
				new ExtraMaterialStats());
		
		//mythicbotany
		addMaterialStats(MaterialIds.alfsteel,
				new HeadMaterialStats(4000, 9.0f, 5, 5.0f),
				new HandleMaterialStats(1.0f, 1.1f, 1.5f, 1.1f),
				new ExtraMaterialStats());
		
		//ae2
		addMaterialStats(MaterialIds.certus_quartz,
				new HeadMaterialStats(250, 3.0f, 1, 2.0f),
				new HandleMaterialStats(1.05f, 1.0f, 1.0f, 1.0f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.fluix,
				new HeadMaterialStats(350, 4.5f, 2, 2.5f),
				new HandleMaterialStats(1.1f, 1.0f, 1.05f, 1.0f),
				new ExtraMaterialStats());
		
		//cyclic
		addMaterialStats(MaterialIds.crystallized_obsidian,
				new HeadMaterialStats(5800, 10.0f, 4, 9.0f),
				new HandleMaterialStats(1.5f, 0.8f, 0.9f, 1.1f),
				new ExtraMaterialStats());
		
		//projecte
		addMaterialStats(MaterialIds.dark_matter,
				new HeadMaterialStats(2000, 10.5f, 4, 10.0f),
				new HandleMaterialStats(1.0f, 1.2f, 1.25f, 1.2f),
				new ExtraMaterialStats());
		addMaterialStats(MaterialIds.red_matter,
				new HeadMaterialStats(2900, 14.0f, 5, 14.0f),
				new HandleMaterialStats(1.2f, 1.3f, 1.5f, 1.25f),
				new ExtraMaterialStats());
		
		//enderium
		addMaterialStats(MaterialIds.enderium,
				new HeadMaterialStats(2500, 9.0f, 3, 5.0f),
				new HandleMaterialStats(1.2f, 1.0f, 1.1f, 1.15f),
				new ExtraMaterialStats());
		
		//undead expansion
		addMaterialStats(MaterialIds.shadowsteel,
				new HeadMaterialStats(2200, 8.0f, 4, 4.0f),
				new HandleMaterialStats(1.15f, 1.0f, 1.05f, 1.0f),
				new ExtraMaterialStats());
		
		//malum
		addMaterialStats(MaterialIds.soul_stained_steel,
				new HeadMaterialStats(1800, 7.5f, 3, 2.5f),
				new HandleMaterialStats(1.1f, 1.05f, 1.0f, 1.1f),
				new ExtraMaterialStats());
		
		//vulcanite
		addMaterialStats(MaterialIds.vulcanite,
				new HeadMaterialStats(500, 8.5f, 3, 2.0f),
				new HandleMaterialStats(1.0f, 1.0f, 1.05f, 1.25f),
				new ExtraMaterialStats());
	}
	
	

}
