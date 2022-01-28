package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class EnderCrushingModifier extends Modifier {

	public EnderCrushingModifier() {
		super(0x6b807f);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		boolean isInEnd = attacker.getEntityWorld().getDimensionKey().equals(World.THE_END);
		if (isInEnd && attacker.canEquip(tool.getItem()))  {
			float attackDmg = tool.getModifier(ToolStats.ATTACK_DAMAGE);
			float damageBoost = attackDmg * (level / 5);
			target.attackEntityFrom(DamageSource.MAGIC, damageBoost);
		}
		return 0;
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		PlayerEntity player = event.getPlayer();
		boolean isInEnd = player.getEntityWorld().getDimensionKey().equals(World.THE_END);
		if(isInEnd && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 2f));
		}
	}

}
