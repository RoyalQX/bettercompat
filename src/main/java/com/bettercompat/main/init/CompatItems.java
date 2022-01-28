package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.tconstruct.shared.TinkerCommons;

public class CompatItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterCompat.MODID);
    
    public static final RegistryObject<Item> AURINIUM_INGOT = ITEMS.register("aurinium_ingot", () -> new Item(new Item.Properties().group(TinkerCommons.TAB_GENERAL)));
    public static final RegistryObject<Item> AURINIUM_NUGGET = ITEMS.register("aurinium_nugget", () -> new Item(new Item.Properties().group(TinkerCommons.TAB_GENERAL)));
    public static final RegistryObject<Item> AURINIUM_BLOCK = ITEMS.register("aurinium_block", 
    		() -> new BlockItem(CompatBlocks.AURINIUM_BLOCK.get(), new Item.Properties().group(TinkerCommons.TAB_GENERAL)));
	public static final RegistryObject<Item> AURINIUM_BUCKET = ITEMS.register("aurinium_bucket", 
			() -> new BucketItem(CompatFluids.AURINIUM, new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1)));
    
    //better end
	public static final RegistryObject<Item> THALLASIUM_BUCKET = ITEMS.register("thallasium_bucket", 
			() -> new BucketItem(CompatFluids.THALLASIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betterendforge") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> TERMINITE_BUCKET = ITEMS.register("terminite_bucket", 
			() -> new BucketItem(CompatFluids.TERMINITE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betterendforge") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> AETERNIUM_BUCKET = ITEMS.register("aeternium_bucket", 
			() -> new BucketItem(CompatFluids.AETERNIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betterendforge") ? ItemGroup.MISC : null)));
	
	//better nether
	public static final RegistryObject<Item> CINCINNASITE_BUCKET = ITEMS.register("cincinnasite_bucket", 
			() -> new BucketItem(CompatFluids.CINCINNASITE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betternether") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> RUBY_BUCKET = ITEMS.register("ruby_bucket", 
			() -> new BucketItem(CompatFluids.RUBY,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betternether") ? ItemGroup.MISC : null)));
	
	//ores above diamonds
	public static final RegistryObject<Item> AMETHYST_BUCKET = ITEMS.register("amethyst_bucket", 
			() -> new BucketItem(CompatFluids.AMETHYST,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("oresabovediamonds") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> BLACKOPAL_BUCKET = ITEMS.register("blackopal_bucket", 
			() -> new BucketItem(CompatFluids.BLACKOPAL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("oresabovediamonds") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> NETHERITEOPAL_BUCKET = ITEMS.register("netheriteopal_bucket", 
			() -> new BucketItem(CompatFluids.NETHERITEOPAL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("oresabovediamonds") ? ItemGroup.MISC : null)));
	
	//iceandfire
	public static final RegistryObject<Item> SAPPHIRE_BUCKET = ITEMS.register("sapphire_bucket", 
			() -> new BucketItem(CompatFluids.SAPPHIRE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("iceandfire") ? ItemGroup.MISC : null)));
	
	//endreborn
	public static final RegistryObject<Item> ENDORIUM_BUCKET = ITEMS.register("endorium_bucket", 
			() -> new BucketItem(CompatFluids.ENDORIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("endreborn") ? ItemGroup.MISC : null)));
	
	//druidcraft
	public static final RegistryObject<Item> MOONSTONE_BUCKET = ITEMS.register("moonstone_bucket", 
			() -> new BucketItem(CompatFluids.MOONSTONE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("druidcraft") ? ItemGroup.MISC : null)));
	
	//cyclic
	public static final RegistryObject<Item> CRYSTALLIZED_OBSIDIAN_BUCKET = ITEMS.register("crystallized_obsidian_bucket", 
			() -> new BucketItem(CompatFluids.CRYSTALLIZED_OBSIDIAN,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("cyclic") ? ItemGroup.MISC : null)));
	
	//enderium
	public static final RegistryObject<Item> ENDERIUM_BUCKET = ITEMS.register("enderium_bucket", 
			() -> new BucketItem(CompatFluids.ENDERIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("enderium") ? ItemGroup.MISC : null)));
	
	//vulcanite
	public static final RegistryObject<Item> VULCANITE_BUCKET = ITEMS.register("vulcanite_bucket", 
			() -> new BucketItem(CompatFluids.VULCANITE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("vulcanite") ? ItemGroup.MISC : null)));
	
	//botania
	public static final RegistryObject<Item> MANASTEEL_BUCKET = ITEMS.register("manasteel_bucket", 
			() -> new BucketItem(CompatFluids.MANASTEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("botania") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> ELEMENTIUM_BUCKET = ITEMS.register("elementium_bucket", 
			() -> new BucketItem(CompatFluids.ELEMENTIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("botania") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> TERRASTEEL_BUCKET = ITEMS.register("terrasteel_bucket", 
			() -> new BucketItem(CompatFluids.TERRASTEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("botania") ? ItemGroup.MISC : null)));
	
	//mythic botany
	public static final RegistryObject<Item> ALFSTEEL_BUCKET = ITEMS.register("alfsteel_bucket", 
			() -> new BucketItem(CompatFluids.ALFSTEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("mythicbotany") ? ItemGroup.MISC : null)));
	
	//ae2
	public static final RegistryObject<Item> CERTUS_QUARTZ_BUCKET = ITEMS.register("certus_quartz_bucket",
			() -> new BucketItem(CompatFluids.CERTUS_QUARTZ,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("appliedenergistics2") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> FLUIX_BUCKET = ITEMS.register("fluix_bucket",
			() -> new BucketItem(CompatFluids.FLUIX,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("appliedenergistics2") ? ItemGroup.MISC : null)));
	
	//malum
	public static final RegistryObject<Item> SOUL_STAINED_STEEL_BUCKET = ITEMS.register("soul_stained_steel_bucket",
			() -> new BucketItem(CompatFluids.SOUL_STAINED_STEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("malum") ? ItemGroup.MISC : null)));
	
	//undead expansion
	public static final RegistryObject<Item> SHADOWSTEEL_BUCKET = ITEMS.register("shadowsteel_bucket",
			() -> new BucketItem(CompatFluids.SHADOWSTEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("undead_expansion") ? ItemGroup.MISC : null)));
	
}
