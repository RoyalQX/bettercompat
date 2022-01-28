package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import slimeknights.tconstruct.common.TinkerEffect;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class EnderferenceModifier extends Modifier {
	
	public static TinkerEffect Enderference = new TinkerEffect(EffectType.NEUTRAL, false);

	public EnderferenceModifier() {
		super(0x105a4b);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public float beforeEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damage, float baseKnockback, float knockback) {
		LivingEntity target = context.getLivingTarget();
		if(target instanceof EndermanEntity) {
			EffectInstance effect = new EffectInstance(Enderference, 100, 1, false, false);
			target.addPotionEffect(effect);
		}
		return knockback;
	}

	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if(target.hitByEntity(attacker)) {
			target.removePotionEffect(Enderference);
		}
		return level;
	}

	@SubscribeEvent
	public void onEnderTeleport(EnderTeleportEvent event) {
		if(Enderference.getLevel(event.getEntityLiving()) > 0) {
			event.setCanceled(true);
		}
	}
}
