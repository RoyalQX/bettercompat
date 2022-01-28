package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class BoneShardModifier extends Modifier {

	public BoneShardModifier() {
		super(0x969083);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if (attacker.canEquip(tool.getItem())) {
			if (target instanceof SkeletonEntity) {
				return 0;
			}
			applyEffect(target, level / 5);
		}
		return 0;
	}
	
	protected void applyEffect(LivingEntity entity, float chance) {
		if (RANDOM.nextFloat() < chance) {
			entity.addPotionEffect(new EffectInstance(Effects.WITHER, 100, 1, false, false));
		}
	}
}
