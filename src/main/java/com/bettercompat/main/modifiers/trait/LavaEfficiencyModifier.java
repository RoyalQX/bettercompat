package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.Entity;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class LavaEfficiencyModifier extends Modifier {

	public LavaEfficiencyModifier() {
		super(0xF56801);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		Entity attacker = context.getAttacker();
		Entity target = context.getTarget();
		if(attacker.areEyesInFluid(FluidTags.LAVA)) {
			return super.afterEntityHit(tool, level, context, damageDealt) * 2;
		}
		if(target.areEyesInFluid(FluidTags.LAVA)) {
			return super.afterEntityHit(tool, level, context, damageDealt) * 2;
		}
		return super.afterEntityHit(tool, level, context, damageDealt);	
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (isEffective && event.getEntityLiving().areEyesInFluid(FluidTags.LAVA)) {
			event.setNewSpeed(event.getNewSpeed() * (level * 2f));
		}
	}
}
