package com.bettercompat.main.data.material;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.common.crafting.conditions.OrCondition;
import net.minecraftforge.common.crafting.conditions.TagEmptyCondition;
import slimeknights.tconstruct.common.json.ConfigEnabledCondition;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;

public class MaterialDataProvider extends AbstractMaterialDataProvider {

	public MaterialDataProvider(DataGenerator gen) {
		super(gen);
	}

	@Override
	public String getName() {
		return "BetterCompat Materials";
	}

	@Override
	protected void addMaterials() {
		//ticbc
		addMaterial(MaterialIds.aurinium, 4, ORDER_SPECIAL, false, 0xffc5ff);
		
		//minecraft
		addMaterial(MaterialIds.blaze_rod, 1, ORDER_GENERAL, true, 0xffc100);
		addMaterial(MaterialIds.diamond, 3, ORDER_GENERAL, false, 0x4aedd9);
		addMaterial(MaterialIds.emerald, 3, ORDER_GENERAL, false, 0x41f384);
		
		//betterendforge
		addMaterial(MaterialIds.amber, 1, ORDER_COMPAT, true, 0xff9031, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("betterendforge"), new ModLoadedCondition("cyclic"), new TagEmptyCondition("gems/amber")));
		addMaterial(MaterialIds.thallasium, 2, ORDER_COMPAT, false, 0x79cfd2, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("betterendforge")));
		addMaterial(MaterialIds.terminite, 3, ORDER_COMPAT, false, 0x34c8bd, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("betterendforge")));
		
		//betternether
		addMaterial(MaterialIds.cincinnasite, 2, ORDER_COMPAT, false, 0xfca816, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("betternether")));
		addMaterial(MaterialIds.ruby, 3, ORDER_COMPAT, false, 0x930015, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("betternether")));
		
		//oresabovediamonds
		addMaterial(MaterialIds.amethyst, 4, ORDER_COMPAT, false, 0xb859cb, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("oresabovediamonds")));
		addMaterial(MaterialIds.blackopal, 5, ORDER_COMPAT, false, 0x130935, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("oresabovediamonds")));
		addMaterial(MaterialIds.netheriteopal, 5, ORDER_COMPAT, false, 0x000017, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("oresabovediamonds")));
		
		//iceandfire
		addMaterial(MaterialIds.dragonbone, 3, ORDER_COMPAT, true, 0x969083, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("iceandfire")));
		addMaterial(MaterialIds.sapphire, 4, ORDER_COMPAT, false, 0x0b2476, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("iceandfire")));
		addMaterial(MaterialIds.amethyst, 4, ORDER_COMPAT, false, 0xb859cb, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("iceandfire")));
		addMaterial(MaterialIds.firedragonsteel, 5, ORDER_COMPAT, true, 0xc28989, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("iceandfire")));
		addMaterial(MaterialIds.icedragonsteel, 5, ORDER_COMPAT, true, 0xbadbe2, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("iceandfire")));
		addMaterial(MaterialIds.lightningdragonsteel, 5, ORDER_COMPAT, true, 0x9c86b4, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("iceandfire")));
		
		//druidcraft
		addMaterial(MaterialIds.amber, 1, ORDER_COMPAT, true, 0xff9031, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("druidcraft")));
		addMaterial(MaterialIds.moonstone, 4, ORDER_COMPAT, false, 0x6eb2ea, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("druidcraft")));
		
		//endreborn
		addMaterial(MaterialIds.endorium, 4, ORDER_COMPAT, false, 0x105a4b, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("endreborn")));
		
		//botania
		addMaterial(MaterialIds.livingwood, 2, ORDER_COMPAT, true, 0x33140a, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("botania")));
		addMaterial(MaterialIds.manasteel, 3, ORDER_COMPAT, false, 0x4196dc, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("botania")));
		addMaterial(MaterialIds.elementium, 3, ORDER_COMPAT, false, 0xf15cae, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("botania")));
		addMaterial(MaterialIds.terrasteel, 4, ORDER_COMPAT, false, 0x58ff0b, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("botania")));
		
		//mythicbotany
		addMaterial(MaterialIds.alfsteel, 5, ORDER_COMPAT, false, 0xffc54f, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("mythicbotany")));
		
		//ae2
		addMaterial(MaterialIds.certus_quartz, 3, ORDER_COMPAT, false, 0xdfedfb, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("appliedenergistics2")));
		addMaterial(MaterialIds.fluix, 3, ORDER_COMPAT, false, 0x915dcd, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("appliedenergistics2")));
		
		//cyclic
		addMaterial(MaterialIds.amber, 1, ORDER_COMPAT, true, 0xff9031, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("cyclic")));
		addMaterial(MaterialIds.crystallized_obsidian, 3, ORDER_COMPAT, false, 0x702ead, false, 
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("cyclic")));
		
		//projecte
		addMaterial(MaterialIds.dark_matter, 4, ORDER_COMPAT, true, 0x38173c, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("projecte")));
		addMaterial(MaterialIds.red_matter, 5, ORDER_COMPAT, true, 0x900707, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("projecte")));
		
		//enderium
		addMaterial(MaterialIds.enderium, 3, ORDER_COMPAT, false, 0xd17cff, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("enderium")));
		
		//undead expansion
		addMaterial(MaterialIds.shadowsteel, 4, ORDER_COMPAT, false, 0x685582, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("undead_expansion")));
		
		//malum
		addMaterial(MaterialIds.soul_stained_steel, 3, ORDER_COMPAT, false, 0x5f3672, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("malum")));
		
		//vulcanite
		addMaterial(MaterialIds.vulcanite, 3, ORDER_COMPAT, false, 0xff5a27, false,
				new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, new ModLoadedCondition("vulcanite")));
		
	}
}
