package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class MoonlightModifier extends Modifier {

	public MoonlightModifier() {
		super(0x6EB2EA);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		LivingEntity holder = event.getPlayer();
		if (holder.canEquip(tool.getItem()) && holder.getEntityWorld().isNightTime() && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 0.5f));
		}
	}
	
	@Override
	public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {
		if (holder.canEquip(tool.getItem()) && holder.getEntityWorld().isNightTime()) {
			holder.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, level * 100, 0));
		}
	}
}
