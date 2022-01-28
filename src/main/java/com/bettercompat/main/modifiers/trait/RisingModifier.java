package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class RisingModifier extends Modifier {

	public RisingModifier() {
		super(0xd17cff);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		if (damageDealt > 6) {
			target.addPotionEffect(new EffectInstance(Effects.LEVITATION, level * 50));
		}
		return 0;
	}

}
