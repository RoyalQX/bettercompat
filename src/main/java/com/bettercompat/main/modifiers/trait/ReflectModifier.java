package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class ReflectModifier extends Modifier {
	
	public static final DamageSource SELF_HURT = new DamageSource("self_hurt");

	public ReflectModifier() {
		super(0x930015);
	}
	
	@Override
	public void failedEntityHit(IModifierToolStack tool, int level, ToolAttackContext context) {
		LivingEntity attacker = context.getAttacker();
		float chance = (level / 10) * 0.2f;
		float damage = tool.getModifier(ToolStats.ATTACK_DAMAGE);
		if (attacker.canEquip(tool.getItem()) && RANDOM.nextFloat() < chance) {
			attacker.attackEntityFrom(SELF_HURT, damage);
		}
	}
}
