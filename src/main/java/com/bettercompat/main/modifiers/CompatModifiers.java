package com.bettercompat.main.modifiers;

import com.bettercompat.main.BetterCompat;
import com.bettercompat.main.modifiers.craftable.*;
import com.bettercompat.main.modifiers.trait.*;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class CompatModifiers {
	public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, BetterCompat.MODID);
	
		//trait
	public static final RegistryObject<EnderferenceModifier> ENDERFERENCE = MODIFIERS.register("enderference", EnderferenceModifier::new); //endorium
	public static final RegistryObject<QuartzInfusedModifier> QUARTZ_INFUSED = MODIFIERS.register("quartz_infused", QuartzInfusedModifier::new); //certus quartz
	public static final RegistryObject<LavaEfficiencyModifier> LAVA_EFFICIENCY = MODIFIERS.register("lava_efficiency", LavaEfficiencyModifier::new); //netherite opal
	public static final RegistryObject<CrystalPowerModifier> CRYSTAL_POWER = MODIFIERS.register("crystal_power", CrystalPowerModifier::new); //amethyst
	public static final RegistryObject<MoonlightModifier> MOONLIGHT = MODIFIERS.register("moonlight", MoonlightModifier::new); //moonstone
	public static final RegistryObject<ElementalModifier> ELEMENTAL = MODIFIERS.register("elemental", ElementalModifier::new); //elementium
	public static final RegistryObject<InclinedModifier> INCLINED = MODIFIERS.register("inclined", InclinedModifier::new); //terminite
	public static final RegistryObject<DarkMightModifier> DARK_MIGHT = MODIFIERS.register("dark_might", DarkMightModifier::new); //black opal
	public static final RegistryObject<FieryModifier> FIERY = MODIFIERS.register("fiery", FieryModifier::new); //fire dragonsteel
	public static final RegistryObject<IcyModifier> ICY = MODIFIERS.register("icy", IcyModifier::new); //ice dragonsteel
	public static final RegistryObject<ElectricModifier> ELECTRIC = MODIFIERS.register("electric", ElectricModifier::new); //lightning dragonsteel
	public static final RegistryObject<EnderCrushingModifier> ENDER_CRUSHING = MODIFIERS.register("ender_crushing", EnderCrushingModifier::new); //aeternium
	public static final RegistryObject<FlorasBlessingModifier> FLORAS_BLESSING = MODIFIERS.register("floras_blessing", FlorasBlessingModifier::new); //livingwood
	public static final RegistryObject<HolyModifier> HOLY = MODIFIERS.register("holy", HolyModifier::new); //thallasium
	public static final RegistryObject<ManaModifier> MANA = MODIFIERS.register("mana", ManaModifier::new); //manasteel, terrasteel, elementium, and alfsteel
	public static final RegistryObject<ClimeModifier> CLIME = MODIFIERS.register("clime", ClimeModifier::new); //amber
	public static final RegistryObject<ObsidianifiedModifier> OBSIDIANIFIED = MODIFIERS.register("obsidianified", ObsidianifiedModifier::new); //crystallized obsidian
	public static final RegistryObject<CrystallizedModifier> CRYSTALLIZED = MODIFIERS.register("crystallized", CrystallizedModifier::new); //diamond
	public static final RegistryObject<BarterableModifier> BARTERABLE = MODIFIERS.register("barterable", BarterableModifier::new); //emerald
	public static final RegistryObject<SuperheatedModifier> SUPERHEATED = MODIFIERS.register("superheated", SuperheatedModifier::new); //vulcanite
	public static final RegistryObject<RisingModifier> RISING = MODIFIERS.register("rising", RisingModifier::new); //enderium
	public static final RegistryObject<BoneShardModifier> BONE_SHARD = MODIFIERS.register("bone_shard", BoneShardModifier::new); //dragonbone
	public static final RegistryObject<MinersLuckModifier> MINERS_LUCK = MODIFIERS.register("miners_luck", MinersLuckModifier::new); //sapphire
	public static final RegistryObject<AntiArmorModifier> ANTI_ARMOR = MODIFIERS.register("anti_armor", AntiArmorModifier::new); //dark matter
	public static final RegistryObject<BloodiedModifier> BLOODIED = MODIFIERS.register("bloodied", BloodiedModifier::new); //red matter
	public static final RegistryObject<VoodooModifier> VOODOO = MODIFIERS.register("voodoo", VoodooModifier::new); //soul stained steel
	public static final RegistryObject<ShadowRageModifier> SHADOW_RAGE = MODIFIERS.register("shadow_rage", ShadowRageModifier::new); //shadowsteel
	public static final RegistryObject<ReflectModifier> REFLECT = MODIFIERS.register("reflect", ReflectModifier::new); //ruby
	public static final RegistryObject<ProspectModifier> PROSPECT = MODIFIERS.register("prospect", ProspectModifier::new); //cincinnasite
	public static final RegistryObject<BloodLeechingModifier> BLOOD_LEECHING = MODIFIERS.register("blood_leeching", BloodLeechingModifier::new); //unused
	public static final RegistryObject<InfusedModifier> INFUSED = MODIFIERS.register("infused", InfusedModifier::new); //unused
	public static final RegistryObject<DefileModifier> DEFILE = MODIFIERS.register("defile", DefileModifier::new); //unused
	public static final RegistryObject<AngelicModifier> ANGELIC = MODIFIERS.register("angelic", AngelicModifier::new); //aurinium
	
		//craftable
	public static final RegistryObject<SentientModifier> SENTIENT = MODIFIERS.register("sentient", SentientModifier::new); //blood magic
	public static final RegistryObject<SpiritReaperModifier> SPIRIT_REAPER = MODIFIERS.register("spirit_reaper", SpiritReaperModifier::new); //malum
	public static final RegistryObject<LungeModifier> LUNGE = MODIFIERS.register("lunge", LungeModifier::new); 
}