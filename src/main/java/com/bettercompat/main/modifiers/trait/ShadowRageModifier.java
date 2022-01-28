package com.bettercompat.main.modifiers.trait;

import net.mcreator.undeadexpansion.potion.ShadowFormPotion;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ShadowRageModifier extends Modifier {

	public ShadowRageModifier() {
		super(0x685582);
	}

	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if (attacker.canEquip(tool.getItem()) && !target.isAlive() && target instanceof MonsterEntity) {
			attacker.addPotionEffect(new EffectInstance(ShadowFormPotion.potion, level * 50, level, false, false));
			attacker.addPotionEffect(new EffectInstance(Effects.SPEED, level * 50, level, false, false));
			attacker.addPotionEffect(new EffectInstance(Effects.STRENGTH, level * 50, level, false, false));
		}
		return 0;
	}
}
