package com.bettercompat.main.modifiers.trait;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.props.FrozenProperties;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class IcyModifier extends Modifier {
	
	public IcyModifier() {
		super(0xbadbe2);
	}

	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if (attacker.canEquip(tool.getItem())) {
			if (target instanceof EntityFireDragon) {
                target.attackEntityFrom(DamageSource.DROWN, level + 12.5F);
			}

			FrozenProperties.setFrozenFor(target, 300);
			target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 300, 2));
			target.applyKnockback( 1F, attacker.getPosX() - target.getPosX(), attacker.getPosZ() - target.getPosZ());
		}
		return 0;
	}
}
