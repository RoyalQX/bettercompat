package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class DarkMightModifier extends Modifier {
	
	public DarkMightModifier() {
		super(0x130935);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		Entity target = context.getTarget();
		if(attacker instanceof PlayerEntity && target instanceof MobEntity) {
			if(damageDealt > 8) {
				attacker.addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, level/6));
			}
		}
		return 0;
	}

}
