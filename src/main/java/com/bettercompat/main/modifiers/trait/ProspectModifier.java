package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ProspectModifier extends Modifier {

	public ProspectModifier() {
		super(0xfca816);
	}
	
	@Override
	public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context) {
		LivingEntity player = context.getPlayer();
		float chance = (level / 5f) * 0.25f;
		if (RANDOM.nextFloat() < chance) {
			player.addPotionEffect(new EffectInstance(Effects.HASTE, level * 20, 1, false, false));
		}
	}
}
