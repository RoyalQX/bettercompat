package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class AngelicModifier extends Modifier {
	public AngelicModifier() {
		super(0xffc5ff);
	}
	
	@Override
	public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context) {
		PlayerEntity player = context.getPlayer();
		float chance = level * 0.1f;
		if (RANDOM.nextFloat() < chance) {
			player.addPotionEffect(new EffectInstance(Effects.REGENERATION, level * 50, level, false, false));
			player.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, level * 50, level, false, false));
		}
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if (attacker.canEquip(tool.getItem()) && !target.isAlive()) {
			float chance = level * 0.2f;
			if (RANDOM.nextFloat() < chance) {
				attacker.addPotionEffect(new EffectInstance(Effects.REGENERATION, level * 50, level, false, false));
				attacker.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, level * 50, level, false, false));
			}
		}
		return 0;
	}
}
