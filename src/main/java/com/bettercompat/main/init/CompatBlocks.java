package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CompatBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterCompat.MODID);
    
    public static final RegistryObject<Block> AURINIUM_BLOCK = BLOCKS.register("aurinium_block", 
    		() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.PINK).harvestLevel(4).harvestTool(ToolType.PICKAXE)
    				.hardnessAndResistance(6.0f).sound(SoundType.STONE).setRequiresTool()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AURINIUM = BLOCKS
            .register("molten_aurinium_block", () -> new FlowingFluidBlock(CompatFluids.AURINIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //better end
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_THALLASIUM = BLOCKS
            .register("molten_thallasium_block", () -> new FlowingFluidBlock(CompatFluids.THALLASIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERMINITE = BLOCKS
            .register("molten_terminite_block", () -> new FlowingFluidBlock(CompatFluids.TERMINITE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AETERNIUM = BLOCKS
            .register("molten_aeternium_block", () -> new FlowingFluidBlock(CompatFluids.AETERNIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //better nether
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CINCINNASITE = BLOCKS
            .register("molten_cincinnasite_block", () -> new FlowingFluidBlock(CompatFluids.CINCINNASITE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_RUBY = BLOCKS
            .register("molten_ruby_block", () -> new FlowingFluidBlock(CompatFluids.RUBY,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //ores above diamonds
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AMETHYST = BLOCKS
            .register("molten_amethyst_block", () -> new FlowingFluidBlock(CompatFluids.AMETHYST,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BLACKOPAL = BLOCKS
            .register("molten_blackopal_block", () -> new FlowingFluidBlock(CompatFluids.BLACKOPAL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_NETHERITEOPAL = BLOCKS
            .register("molten_netheriteopal_block", () -> new FlowingFluidBlock(CompatFluids.NETHERITEOPAL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //iceandfire
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SAPPHIRE = BLOCKS
            .register("molten_sapphire_block", () -> new FlowingFluidBlock(CompatFluids.SAPPHIRE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //endreborn
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ENDORIUM = BLOCKS
            .register("molten_endorium_block", () -> new FlowingFluidBlock(CompatFluids.ENDORIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //druidcraft
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MOONSTONE = BLOCKS
            .register("molten_moonstone_block", () -> new FlowingFluidBlock(CompatFluids.MOONSTONE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //cyclic
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CRYSTALLIZED_OBSIDIAN = BLOCKS
            .register("molten_crystallized_obsidian_block", () -> new FlowingFluidBlock(CompatFluids.CRYSTALLIZED_OBSIDIAN,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //enderium
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ENDERIUM = BLOCKS
            .register("molten_enderium_block", () -> new FlowingFluidBlock(CompatFluids.ENDERIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //vulcanite
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_VULCANITE = BLOCKS
            .register("molten_vulcanite_block", () -> new FlowingFluidBlock(CompatFluids.VULCANITE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //botania
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MANASTEEL = BLOCKS
            .register("molten_manasteel_block", () -> new FlowingFluidBlock(CompatFluids.MANASTEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ELEMENTIUM = BLOCKS
            .register("molten_elementium_block", () -> new FlowingFluidBlock(CompatFluids.ELEMENTIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERRASTEEL = BLOCKS
            .register("molten_terrasteel_block", () -> new FlowingFluidBlock(CompatFluids.TERRASTEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //mythic botany
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ALFSTEEL = BLOCKS
            .register("molten_alfsteel_block", () -> new FlowingFluidBlock(CompatFluids.ALFSTEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //ae2
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CERTUS_QUARTZ = BLOCKS
            .register("molten_certus_quartz_block", () -> new FlowingFluidBlock(CompatFluids.CERTUS_QUARTZ,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_FLUIX = BLOCKS
            .register("molten_fluix_block", () -> new FlowingFluidBlock(CompatFluids.FLUIX,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    
    //malum
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SOUL_STAINED_STEEL = BLOCKS
            .register("soul_stained_lava_block", () -> new FlowingFluidBlock(CompatFluids.SOUL_STAINED_STEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //undead expansion
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SHADOWSTEEL = BLOCKS
            .register("molten_shadowsteel_block", () -> new FlowingFluidBlock(CompatFluids.SHADOWSTEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
}
