package com.bettercompat.main.data.material;

import com.bettercompat.main.BetterCompat;

import slimeknights.tconstruct.library.materials.definition.MaterialId;

public class MaterialIds {

	//ticbc
	public static final MaterialId aurinium = id("aurinium");
	
	//compat mods
		//minecraft
	public static final MaterialId blaze_rod = id("blaze_rod");
	public static final MaterialId diamond = id("diamond");
	public static final MaterialId emerald = id("emerald");
		//betterend
	public static final MaterialId amber = id("amber");
	public static final MaterialId thallasium = id("thallasium");
	public static final MaterialId terminite = id("terminite");
	public static final MaterialId aeternium = id("aeternium");
		//betternether
	public static final MaterialId cincinnasite = id("cincinnasite");
	public static final MaterialId ruby = id("ruby");
		//oresabovediamonds
	public static final MaterialId amethyst = id("amethyst");
	public static final MaterialId blackopal = id("blackopal");
	public static final MaterialId netheriteopal = id("netheriteopal");
		//iceandfire
	public static final MaterialId dragonbone = id("dragonbone");
	public static final MaterialId sapphire = id("sapphire");
	public static final MaterialId firedragonsteel = id("firedragonsteel");
	public static final MaterialId icedragonsteel = id("icedragonsteel");
	public static final MaterialId lightningdragonsteel = id("lightningdragonsteel");
		//druidcraft
	public static final MaterialId moonstone = id("moonstone");
		//endreborn
	public static final MaterialId endorium = id("endorium");
		//botania
	public static final MaterialId livingwood = id("livingwood");
	public static final MaterialId manasteel = id("manasteel");
	public static final MaterialId elementium = id("elementium");
	public static final MaterialId terrasteel = id("terrasteel");
		//mythic botany
	public static final MaterialId alfsteel = id("alfsteel");
		//ae2
	public static final MaterialId certus_quartz = id("certus_quartz");
	public static final MaterialId fluix = id("fluix");
		//cyclic
	public static final MaterialId crystallized_obsidian = id("crystallized_obsidian");
		//projecte
	public static final MaterialId dark_matter = id("dark_matter");
	public static final MaterialId red_matter = id("red_matter");
		//enderium
	public static final MaterialId enderium = id("enderium");
		//undead expansion
	public static final MaterialId shadowsteel = id("shadowsteel");
		//malum
	public static final MaterialId soul_stained_steel = id("soul_stained_steel");
		//vulcanite
	public static final MaterialId vulcanite = id("vulcanite");
	
	private static MaterialId id(String string) {
		return new MaterialId(BetterCompat.MODID, string);
	}
	
}
