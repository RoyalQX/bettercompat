package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.shared.TinkerCommons;
import slimeknights.tconstruct.shared.block.SlimeType;

public class BloodLeechingModifier extends Modifier {

	public BloodLeechingModifier() {
		super(0xffffff);
	}
	
	@Override
	public float getEntityDamage(IModifierToolStack tool, int level, ToolAttackContext context, float baseDamage, float damage) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if (attacker.canEquip(tool.getItem())) {
			return baseDamage += Math.pow(target.getMaxHealth() - target.getHealth(), 0.6);
		}
		return damage;
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if (target.hitByEntity(attacker)) {
			target.world.addEntity(new ItemEntity(target.world, target.getPosX(), target.getPosY(), target.getPosZ(),
					TinkerCommons.slimeball.get(SlimeType.BLOOD).getDefaultInstance()));
		}
		return 0;
	}

}
