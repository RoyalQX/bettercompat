package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class BloodiedModifier extends Modifier {

	public BloodiedModifier() {
		super(0x900707);
	}
	
	@Override
	public float getEntityDamage(IModifierToolStack tool, int level, ToolAttackContext context, float baseDamage, float damage) {
		LivingEntity attacker = context.getAttacker();
		float boost = (attacker.getMaxHealth() / attacker.getHealth()) * (level * 0.3f); 
		if (attacker.getHealth() > 10) {
			return damage;
		}
		return damage + boost;
	}
}
