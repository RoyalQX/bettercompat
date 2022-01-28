package com.bettercompat.main.modifiers.trait;

import com.sammy.malum.core.systems.spirits.SpiritHelper;

import net.minecraft.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class VoodooModifier extends Modifier {

	public VoodooModifier() {
		super(0x5f3672);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if (attacker.canEquip(tool.getItem()) && context.isFullyCharged()) {
			SpiritHelper.causeVoodooDamage(attacker, target, level + 2);
		}
		return 0;
	}

}
