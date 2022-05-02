package com.bettercompat.main.modifiers.trait;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.ModList;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class MinersLuckModifier extends Modifier {

	public MinersLuckModifier() {
		super(0x0b2476);
	}
	
	@Override
	public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context) {
		PlayerEntity player = context.getPlayer();
		BlockPos block = context.getPos();
		boolean isEffective = context.isEffective();
		if (isEffective) {
			dropItem(player.world, block.getX(), block.getY(), block.getZ(), level * 0.001f);
		}
	}

	protected void dropItem(World world, double x, double y, double z, float chance) {
		ItemEntity item;
		if (!world.isRemote && RANDOM.nextFloat() < chance) {
			int rand = RANDOM.nextInt(4);
			switch (rand) {
			case 0:
				item = new ItemEntity(world, x, y, z, new ItemStack(Items.DIAMOND));
				world.addEntity(item);
				break;
			case 1:
				item = new ItemEntity(world, x, y, z, new ItemStack(Items.EMERALD));
				world.addEntity(item);
				break;
			case 2:
				if (ModList.get().isLoaded("iceandfire")) {
					item = new ItemEntity(world, x, y, z, new ItemStack(IafItemRegistry.SAPPHIRE_GEM));
					world.addEntity(item);
				}
				break;
			case 3:
				if (ModList.get().isLoaded("iceandfire")) {
					item = new ItemEntity(world, x, y, z, new ItemStack(IafItemRegistry.AMYTHEST_GEM));
					world.addEntity(item);
				}
				break;
			}
		}
	}	
}
