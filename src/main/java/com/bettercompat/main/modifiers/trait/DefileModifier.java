package com.bettercompat.main.modifiers.trait;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class DefileModifier extends Modifier {

	public DefileModifier() {
		super(0xffffff);
	}
	
	@Override
	public int onDamageTool(IModifierToolStack toolStack, int level, int amount) {
		return amount * 2;
	}
}
