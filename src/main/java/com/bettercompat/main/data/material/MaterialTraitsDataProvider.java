package com.bettercompat.main.data.material;

import com.bettercompat.main.modifiers.CompatModifiers;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;
import slimeknights.tconstruct.tools.TinkerModifiers;

public class MaterialTraitsDataProvider extends AbstractMaterialTraitDataProvider {

	public MaterialTraitsDataProvider(DataGenerator gen, AbstractMaterialDataProvider materials) {
		super(gen, materials);
	}

	@Override
	public String getName() {
		return "BetterCompat Material Traits";
	}

	@Override
	protected void addMaterialTraits() {
		//ticbc
		addDefaultTraits(MaterialIds.aurinium, CompatModifiers.ANGELIC.get());
		
		//minecraft
		addDefaultTraits(MaterialIds.blaze_rod, TinkerModifiers.autosmelt.get());
		addDefaultTraits(MaterialIds.diamond, CompatModifiers.CRYSTALLIZED.get());
		addDefaultTraits(MaterialIds.emerald, CompatModifiers.BARTERABLE.get());
		
		//betterendforge
		addDefaultTraits(MaterialIds.amber, CompatModifiers.CLIME.get());
		addDefaultTraits(MaterialIds.thallasium, CompatModifiers.HOLY.get());
		addDefaultTraits(MaterialIds.terminite, CompatModifiers.INCLINED.get());
		addDefaultTraits(MaterialIds.aeternium, CompatModifiers.ENDER_CRUSHING.get());
		
		//betternether
		addDefaultTraits(MaterialIds.cincinnasite, CompatModifiers.PROSPECT.get());
		addDefaultTraits(MaterialIds.ruby, CompatModifiers.REFLECT.get());
		
		//oresabovediamonds
		addDefaultTraits(MaterialIds.amethyst, CompatModifiers.CRYSTAL_POWER.get());
		addDefaultTraits(MaterialIds.blackopal, CompatModifiers.DARK_MIGHT.get());
		addDefaultTraits(MaterialIds.netheriteopal, CompatModifiers.LAVA_EFFICIENCY.get());
		
		//iceandfire
		addDefaultTraits(MaterialIds.dragonbone, CompatModifiers.BONE_SHARD.get());
		addDefaultTraits(MaterialIds.sapphire, CompatModifiers.MINERS_LUCK.get());
		addDefaultTraits(MaterialIds.firedragonsteel, CompatModifiers.FIERY.get());
		addDefaultTraits(MaterialIds.icedragonsteel, CompatModifiers.ICY.get());
		addDefaultTraits(MaterialIds.lightningdragonsteel, CompatModifiers.ELECTRIC.get());
		
		//endreborn
		addDefaultTraits(MaterialIds.endorium, CompatModifiers.ENDERFERENCE.get());
		
		//botania
		addDefaultTraits(MaterialIds.livingwood, CompatModifiers.FLORAS_BLESSING.get());
		addDefaultTraits(MaterialIds.manasteel, CompatModifiers.MANA.get());
		addDefaultTraits(MaterialIds.elementium, CompatModifiers.MANA.get(), CompatModifiers.ELEMENTAL.get());
		addDefaultTraits(MaterialIds.terrasteel, CompatModifiers.MANA.get());
		
		//mythicbotany
		addDefaultTraits(MaterialIds.alfsteel, CompatModifiers.MANA.get());
		
		//ae2
		addDefaultTraits(MaterialIds.certus_quartz, CompatModifiers.QUARTZ_INFUSED.get());
		addDefaultTraits(MaterialIds.fluix, TinkerModifiers.lacerating.get());
		
		//cyclic
		addDefaultTraits(MaterialIds.crystallized_obsidian, CompatModifiers.OBSIDIANIFIED.get());
		
		//projecte
		addDefaultTraits(MaterialIds.dark_matter, CompatModifiers.ANTI_ARMOR.get());
		addDefaultTraits(MaterialIds.red_matter, CompatModifiers.BLOODIED.get());
		
		//enderium
		addDefaultTraits(MaterialIds.enderium, CompatModifiers.RISING.get());
		
		//undead expansion
		addDefaultTraits(MaterialIds.shadowsteel, CompatModifiers.SHADOW_RAGE.get());
		
		//malum
		addDefaultTraits(MaterialIds.soul_stained_steel, CompatModifiers.VOODOO.get());
		
		//vulcanite
		addDefaultTraits(MaterialIds.vulcanite, CompatModifiers.SUPERHEATED.get());
	}

}
