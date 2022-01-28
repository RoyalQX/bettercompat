package com.bettercompat.main.modifiers.trait;

import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class InclinedModifier extends Modifier {

	public InclinedModifier() {
		super(0x34C8BD);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if(event.getPlayer().world.getHeight() >= 110 && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 1.2f));
		}
	} 

}
