package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class BarterableModifier extends Modifier {

	public BarterableModifier() {
		super(0x41F384);
	}
	
	@Override
	public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {
		if (holder.canEquip(tool.getItem())) {
			holder.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, level, 0));
		}
	}

}
