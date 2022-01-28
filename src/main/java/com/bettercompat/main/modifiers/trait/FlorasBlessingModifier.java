package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class FlorasBlessingModifier extends Modifier {

	public FlorasBlessingModifier() {
		super(0x33140A);
	}
	
	@Override
	public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context) {
		PlayerEntity player = context.getPlayer();
		dropBread(player.world, player.getPosX(), player.getPosY(), player.getPosZ(), level * 0.05f);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
		if (damageDealt > 2 && !target.isAlive()) {
			dropBread(target.world, target.getPosX(), target.getPosY(), target.getPosZ(), level * 0.10f);
			float rnd = RANDOM.nextFloat();
			if (rnd < 0.3f) attacker.heal(3.0f);
		}
		return 0;
	}
	
	protected void dropBread(World world, double x, double y, double z, float chance) {
		if (!world.isRemote && RANDOM.nextFloat() < chance) {
			ItemEntity entity = new ItemEntity(world, x, y, z, new ItemStack(Items.BREAD));
			world.addEntity(entity);
		}
	}

}
