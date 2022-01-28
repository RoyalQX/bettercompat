package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class AntiArmorModifier extends Modifier {

	public AntiArmorModifier() {
		super(0x38173c);
	}
	
	@Override
	public float getEntityDamage(IModifierToolStack tool, int level, ToolAttackContext context, float baseDamage, float damage) {
		LivingEntity target = context.getLivingTarget();
		float boost = target.getTotalArmorValue() * (level * 0.2f);
		if (target.getTotalArmorValue() < 0) {
			return damage;
		}
		target.attackEntityFrom(DamageSource.GENERIC.setDamageBypassesArmor(), damage + boost);
		return 0;
	}
}
