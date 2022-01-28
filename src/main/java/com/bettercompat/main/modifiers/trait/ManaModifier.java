package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import vazkii.botania.api.mana.ManaItemHandler;

public class ManaModifier extends Modifier {
	
    private int useMana = 100;
	
	public ManaModifier() {
		super(0x36d6c6);
	}
	
	@Override 
	public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {
		if (!world.isRemote && holder instanceof PlayerEntity && stack.getDamage() > 0 
				&& ManaItemHandler.instance().requestManaExactForTool(stack, (PlayerEntity) holder, useMana, true)) {
			stack.setDamage(stack.getDamage() - 1);
		}
	}
}
