package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.StrayEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ClimeModifier extends Modifier {
	public ClimeModifier() {
		super(0xFF9031);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		BlockPos pos = attacker.getPosition();
		float temperature = attacker.world.getBiome(pos).getTemperature(pos);
		if(attacker.canEquip(tool.getItem())) {
			if (temperature >= 1.5f && !target.isImmuneToFire()) {
				target.setFire(level * 3);
			}
			if (temperature <= 0.5f && !(target instanceof PolarBearEntity) && !(target instanceof StrayEntity)) {
				target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, level * 50, level, false, false));
				target.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, level * 50, level, false, false));
			}
			target.addPotionEffect(new EffectInstance(Effects.WEAKNESS, level * 50, level, false, false));
		}
		return 0;
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (isEffective) {
			BlockPos pos = event.getPos();
			float temperature = event.getPlayer().world.getBiome(pos).getTemperature(pos);
			float b = temperature * level / 5;
			event.setNewSpeed(event.getNewSpeed() * (0.5f + b));
		}
	}
}
