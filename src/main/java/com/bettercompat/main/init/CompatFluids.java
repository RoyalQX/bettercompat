package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CompatFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, BetterCompat.MODID);

    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(BetterCompat.MODID,
            "blocks/fluids/molten_metal_still");
    public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(BetterCompat.MODID,
            "blocks/fluids/molten_metal_flowing");
    
    public static final RegistryObject<ForgeFlowingFluid.Source> AURINIUM = FLUIDS.register("molten_aurinium",
            () -> new ForgeFlowingFluid.Source(makeMoltenAuriniumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AURINIUM = FLUIDS.register("flowing_molten_aurinium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAuriniumProperties()));

    //materials
    	//better end
    public static final RegistryObject<ForgeFlowingFluid.Source> THALLASIUM = FLUIDS.register("molten_thallasium",
            () -> new ForgeFlowingFluid.Source(makeMoltenThallasiumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_THALLASIUM = FLUIDS.register("flowing_molten_thallasium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenThallasiumProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> TERMINITE = FLUIDS.register("molten_terminite",
            () -> new ForgeFlowingFluid.Source(makeMoltenTerminiteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_TERMINITE = FLUIDS.register("flowing_molten_terminite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenTerminiteProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> AETERNIUM = FLUIDS.register("molten_aeternium",
            () -> new ForgeFlowingFluid.Source(makeMoltenAeterniumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AETERNIUM = FLUIDS.register("flowing_molten_aeternium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAeterniumProperties()));
    
    	//better nether
    public static final RegistryObject<ForgeFlowingFluid.Source> CINCINNASITE = FLUIDS.register("molten_cincinnasite",
            () -> new ForgeFlowingFluid.Source(makeMoltenCincinnasiteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_CINCINNASITE = FLUIDS.register("flowing_molten_cincinnasite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenCincinnasiteProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> RUBY = FLUIDS.register("molten_ruby",
            () -> new ForgeFlowingFluid.Source(makeMoltenRubyProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_RUBY = FLUIDS.register("flowing_molten_ruby",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenRubyProperties()));
    
    	//ores above diamonds
    public static final RegistryObject<ForgeFlowingFluid.Source> AMETHYST = FLUIDS.register("molten_amethyst",
            () -> new ForgeFlowingFluid.Source(makeMoltenAmethystProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AMETHYST = FLUIDS.register("flowing_molten_amethyst",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAmethystProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> BLACKOPAL = FLUIDS.register("molten_blackopal",
            () -> new ForgeFlowingFluid.Source(makeMoltenBlackOpalProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BLACKOPAL = FLUIDS.register("flowing_molten_blackopal",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenBlackOpalProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> NETHERITEOPAL = FLUIDS.register("molten_netheriteopal",
            () -> new ForgeFlowingFluid.Source(makeMoltenNetheriteOpalProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_NETHERITEOPAL = FLUIDS.register("flowing_molten_netheriteopal",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenNetheriteOpalProperties()));
    
    	//iceandfire
    public static final RegistryObject<ForgeFlowingFluid.Source> SAPPHIRE = FLUIDS.register("molten_sapphire",
            () -> new ForgeFlowingFluid.Source(makeMoltenSapphireProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_SAPPHIRE = FLUIDS.register("flowing_molten_sapphire",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenSapphireProperties()));
    
    	//endreborn
    public static final RegistryObject<ForgeFlowingFluid.Source> ENDORIUM = FLUIDS.register("molten_endorium",
            () -> new ForgeFlowingFluid.Source(makeMoltenEndoriumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ENDORIUM = FLUIDS.register("flowing_molten_endorium",
    		() -> new ForgeFlowingFluid.Flowing(makeMoltenEndoriumProperties()));
    
    	//druidcraft
    public static final RegistryObject<ForgeFlowingFluid.Source> MOONSTONE = FLUIDS.register("molten_moonstone",
            () -> new ForgeFlowingFluid.Source(makeMoltenMoonstoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_MOONSTONE = FLUIDS.register("flowing_molten_moonstone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenMoonstoneProperties()));
    
    	//cyclic
    public static final RegistryObject<ForgeFlowingFluid.Source> CRYSTALLIZED_OBSIDIAN = FLUIDS.register("molten_crystallized_obsidian", 
    		() -> new ForgeFlowingFluid.Source(makeCrystallizedObsidianProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_CRYSTALLIZED_OBSIDIAN = FLUIDS.register("flowing_molten_crystallized_obsidian", 
    		() -> new ForgeFlowingFluid.Flowing(makeCrystallizedObsidianProperties()));
    
    	//enderium
    public static final RegistryObject<ForgeFlowingFluid.Source> ENDERIUM = FLUIDS.register("molten_enderium", 
    		() -> new ForgeFlowingFluid.Source(makeEnderiumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ENDERIUM = FLUIDS.register("flowing_molten_enderium", 
    		() -> new ForgeFlowingFluid.Flowing(makeEnderiumProperties()));
    	
    	//vulcanite
    public static final RegistryObject<ForgeFlowingFluid.Source> VULCANITE = FLUIDS.register("molten_vulcanite", 
    		() -> new ForgeFlowingFluid.Source(makeVulcaniteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_VULCANITE = FLUIDS.register("flowing_molten_vulcanite", 
    		() -> new ForgeFlowingFluid.Flowing(makeVulcaniteProperties()));
    
    	//botania
    public static final RegistryObject<ForgeFlowingFluid.Source> MANASTEEL = FLUIDS.register("molten_manasteel",
            () -> new ForgeFlowingFluid.Source(makeMoltenManasteelProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_MANASTEEL = FLUIDS.register("flowing_molten_manasteel",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenManasteelProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> ELEMENTIUM = FLUIDS.register("molten_elementium",
            () -> new ForgeFlowingFluid.Source(makeMoltenElementiumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ELEMENTIUM = FLUIDS.register("flowing_molten_elementium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenElementiumProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> TERRASTEEL = FLUIDS.register("molten_terrasteel",
            () -> new ForgeFlowingFluid.Source(makeMoltenTerrasteelProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_TERRASTEEL = FLUIDS.register("flowing_molten_terrasteel",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenTerrasteelProperties()));
    
    	//mythic botany
    public static final RegistryObject<ForgeFlowingFluid.Source> ALFSTEEL = FLUIDS.register("molten_alfsteel",
            () -> new ForgeFlowingFluid.Source(makeMoltenAlfsteelProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ALFSTEEL = FLUIDS.register("flowing_molten_alfsteel",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAlfsteelProperties()));
    
    	//ae2
    public static final RegistryObject<ForgeFlowingFluid.Source> CERTUS_QUARTZ = FLUIDS.register("molten_certus_quartz",
            () -> new ForgeFlowingFluid.Source(makeMoltenCertusQuartzProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_CERTUS_QUARTZ = FLUIDS.register("flowing_molten_certus_quartz",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenCertusQuartzProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> FLUIX = FLUIDS.register("molten_fluix",
            () -> new ForgeFlowingFluid.Source(makeMoltenFluixProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_FLUIX = FLUIDS.register("flowing_molten_fluix",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenFluixProperties()));
    
    	//malum
    public static final RegistryObject<ForgeFlowingFluid.Source> SOUL_STAINED_STEEL = FLUIDS.register("molten_soul_stained_steel",
            () -> new ForgeFlowingFluid.Source(makeMoltenSoulStainedSteelProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_SOUL_STAINED_STEEL = FLUIDS.register("flowing_molten_soul_stained_steel",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenSoulStainedSteelProperties()));
    
    	//undead expansion
    public static final RegistryObject<ForgeFlowingFluid.Source> SHADOWSTEEL = FLUIDS.register("molten_shadowsteel",
            () -> new ForgeFlowingFluid.Source(makeMoltenShadowsteelProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_SHADOWSTEEL = FLUIDS.register("flowing_molten_shadowsteel",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenShadowsteelProperties()));
    
    //molten material properties
    	//ticbc
    private static ForgeFlowingFluid.Properties makeMoltenAuriniumProperties() {
        return new ForgeFlowingFluid.Properties(AURINIUM, flowing_AURINIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFFC5FF)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
        		.bucket(CompatItems.AURINIUM_BUCKET).block(CompatBlocks.MOLTEN_AURINIUM).explosionResistance(1000F).tickRate(9);
    }
    
    	//better end
    private static ForgeFlowingFluid.Properties makeMoltenThallasiumProperties() {
        return new ForgeFlowingFluid.Properties(THALLASIUM, flowing_THALLASIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF79CFD2)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
        		.bucket(CompatItems.THALLASIUM_BUCKET).block(CompatBlocks.MOLTEN_THALLASIUM).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makeMoltenTerminiteProperties() {
        return new ForgeFlowingFluid.Properties(TERMINITE, flowing_TERMINITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF34C8BD)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.TERMINITE_BUCKET).block(CompatBlocks.MOLTEN_TERMINITE).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makeMoltenAeterniumProperties() {
        return new ForgeFlowingFluid.Properties(AETERNIUM, flowing_AETERNIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF6B807F)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.AETERNIUM_BUCKET).block(CompatBlocks.MOLTEN_AETERNIUM).explosionResistance(1000F).tickRate(9);
    }
    
    	//better nether
    private static ForgeFlowingFluid.Properties makeMoltenCincinnasiteProperties() {
        return new ForgeFlowingFluid.Properties(CINCINNASITE, flowing_CINCINNASITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFCA816)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.CINCINNASITE_BUCKET).block(CompatBlocks.MOLTEN_CINCINNASITE).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeMoltenRubyProperties() {
        return new ForgeFlowingFluid.Properties(RUBY, flowing_RUBY,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF930015)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.RUBY_BUCKET).block(CompatBlocks.MOLTEN_RUBY).explosionResistance(1000F).tickRate(9);
    }
    
    	//ores above diamonds
    private static ForgeFlowingFluid.Properties makeMoltenAmethystProperties() {
        return new ForgeFlowingFluid.Properties(AMETHYST, flowing_AMETHYST,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFB859CB)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.AMETHYST_BUCKET).block(CompatBlocks.MOLTEN_AMETHYST).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeMoltenBlackOpalProperties() {
        return new ForgeFlowingFluid.Properties(BLACKOPAL, flowing_BLACKOPAL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF130935)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.BLACKOPAL_BUCKET).block(CompatBlocks.MOLTEN_BLACKOPAL).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeMoltenNetheriteOpalProperties() {
        return new ForgeFlowingFluid.Properties(NETHERITEOPAL, flowing_NETHERITEOPAL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF000017)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.NETHERITEOPAL_BUCKET).block(CompatBlocks.MOLTEN_NETHERITEOPAL).explosionResistance(1000F).tickRate(9);
    }
    
    	//iceandfire
    private static ForgeFlowingFluid.Properties makeMoltenSapphireProperties() {
        return new ForgeFlowingFluid.Properties(SAPPHIRE, flowing_SAPPHIRE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF0B2476)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.SAPPHIRE_BUCKET).block(CompatBlocks.MOLTEN_SAPPHIRE).explosionResistance(1000F).tickRate(9);
    }
    
    	//endreborn
    private static ForgeFlowingFluid.Properties makeMoltenEndoriumProperties() {
        return new ForgeFlowingFluid.Properties(ENDORIUM, flowing_ENDORIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF105A4B)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.ENDORIUM_BUCKET).block(CompatBlocks.MOLTEN_ENDORIUM).explosionResistance(1000F).tickRate(9);
    }
    
    	//druidcraft
    private static ForgeFlowingFluid.Properties makeMoltenMoonstoneProperties() {
        return new ForgeFlowingFluid.Properties(MOONSTONE, flowing_MOONSTONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF6EB2EA)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.MOONSTONE_BUCKET).block(CompatBlocks.MOLTEN_MOONSTONE).explosionResistance(1000F).tickRate(9);
    }
    
    	//cyclic
    private static ForgeFlowingFluid.Properties makeCrystallizedObsidianProperties() {
        return new ForgeFlowingFluid.Properties(CRYSTALLIZED_OBSIDIAN, flowing_CRYSTALLIZED_OBSIDIAN,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF702EAD)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.CRYSTALLIZED_OBSIDIAN_BUCKET).block(CompatBlocks.MOLTEN_CRYSTALLIZED_OBSIDIAN).explosionResistance(1000F).tickRate(9);
    }
    
    	//enderium
    private static ForgeFlowingFluid.Properties makeEnderiumProperties() {
        return new ForgeFlowingFluid.Properties(ENDERIUM, flowing_ENDERIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFD17CFF)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.ENDERIUM_BUCKET).block(CompatBlocks.MOLTEN_ENDERIUM).explosionResistance(1000F).tickRate(9);
    }
    
    	//vulcanite
    private static ForgeFlowingFluid.Properties makeVulcaniteProperties() {
        return new ForgeFlowingFluid.Properties(VULCANITE, flowing_VULCANITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFF3300)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.VULCANITE_BUCKET).block(CompatBlocks.MOLTEN_VULCANITE).explosionResistance(1000F).tickRate(9);
    }
    
    	//botania
    private static ForgeFlowingFluid.Properties makeMoltenManasteelProperties() {
        return new ForgeFlowingFluid.Properties(MANASTEEL, flowing_MANASTEEL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF4196DC)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
        		.bucket(CompatItems.MANASTEEL_BUCKET).block(CompatBlocks.MOLTEN_MANASTEEL).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makeMoltenElementiumProperties() {
        return new ForgeFlowingFluid.Properties(ELEMENTIUM, flowing_ELEMENTIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFF15CAE)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.ELEMENTIUM_BUCKET).block(CompatBlocks.MOLTEN_ELEMENTIUM).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makeMoltenTerrasteelProperties() {
        return new ForgeFlowingFluid.Properties(TERRASTEEL, flowing_TERRASTEEL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF58FF0B)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.TERRASTEEL_BUCKET).block(CompatBlocks.MOLTEN_TERRASTEEL).explosionResistance(1000F).tickRate(9);
    }
    
    	//mythic botany
    private static ForgeFlowingFluid.Properties makeMoltenAlfsteelProperties() {
        return new ForgeFlowingFluid.Properties(ALFSTEEL, flowing_ALFSTEEL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFFFC54F)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.ALFSTEEL_BUCKET).block(CompatBlocks.MOLTEN_ALFSTEEL).explosionResistance(1000F).tickRate(9);
    }
    
    	//ae2
    private static ForgeFlowingFluid.Properties makeMoltenCertusQuartzProperties() {
        return new ForgeFlowingFluid.Properties(CERTUS_QUARTZ, flowing_CERTUS_QUARTZ,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFDFEDFB)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
        		.bucket(CompatItems.CERTUS_QUARTZ_BUCKET).block(CompatBlocks.MOLTEN_CERTUS_QUARTZ).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makeMoltenFluixProperties() {
        return new ForgeFlowingFluid.Properties(FLUIX, flowing_FLUIX,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF915DCD)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.FLUIX_BUCKET).block(CompatBlocks.MOLTEN_FLUIX).explosionResistance(1000F).tickRate(9);
    }
    
    	//malum
    private static ForgeFlowingFluid.Properties makeMoltenSoulStainedSteelProperties() {
        return new ForgeFlowingFluid.Properties(SOUL_STAINED_STEEL, flowing_SOUL_STAINED_STEEL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF5F3672)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.SOUL_STAINED_STEEL_BUCKET).block(CompatBlocks.MOLTEN_SOUL_STAINED_STEEL).explosionResistance(1000F).tickRate(9);
    }
        
    private static ForgeFlowingFluid.Properties makeMoltenShadowsteelProperties() {
        return new ForgeFlowingFluid.Properties(SHADOWSTEEL, flowing_SHADOWSTEEL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF685582)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA))
                .bucket(CompatItems.SHADOWSTEEL_BUCKET).block(CompatBlocks.MOLTEN_SHADOWSTEEL).explosionResistance(1000F).tickRate(9);
    }       
}
