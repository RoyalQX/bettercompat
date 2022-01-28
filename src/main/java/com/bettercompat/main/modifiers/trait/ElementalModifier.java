package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ElementalModifier extends Modifier {

	public ElementalModifier() {
		super(0xF15CAE);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		if (damageDealt > 2 && RANDOM.nextFloat() < 0.22f) {
			int rand = RANDOM.nextInt(4);
			switch (rand) {
			case 0: // Water
				attacker.addPotionEffect(new EffectInstance(Effects.ABSORPTION, level * 200));
				attacker.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, level * 200));
				break;
			case 1: // Wind
				attacker.addPotionEffect(new EffectInstance(Effects.SPEED, level * 200));
				attacker.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, level * 200));
				break;
			case 2: // Earth
				attacker.addPotionEffect(new EffectInstance(Effects.STRENGTH, level * 200));
				attacker.addPotionEffect(new EffectInstance(Effects.SATURATION, level * 200));
				break;
			case 3: // Fire
				attacker.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, level * 200));
				attacker.addPotionEffect(new EffectInstance(Effects.REGENERATION, level * 200));
				break;
			}
		}
		return 0;
	}
}
