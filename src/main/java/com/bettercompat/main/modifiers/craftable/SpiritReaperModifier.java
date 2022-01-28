package com.bettercompat.main.modifiers.craftable;

import com.sammy.malum.core.systems.spirits.SpiritHelper;

import net.minecraft.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.SingleLevelModifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class SpiritReaperModifier extends SingleLevelModifier {
	
	public SpiritReaperModifier() {
		super(0x6d446c);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if (attacker.canEquip(tool.getItem()) && !target.isAlive()) {
			SpiritHelper.summonSpirits(target);
		}
		return 0;	
	}	
}

