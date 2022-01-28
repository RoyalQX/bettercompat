package com.bettercompat.main.modifiers.craftable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class LungeModifier extends Modifier {

	public LungeModifier() {
		super(0xBC9862);
	}
	
	@Override
	public ActionResultType onToolUse(IModifierToolStack tool, int level, World world, PlayerEntity player, Hand hand) {
		if(player.canEquip(tool.getItem()) && player.isElytraFlying()) {
			return ActionResultType.PASS;
		}
		player.setActiveHand(hand);
		return ActionResultType.SUCCESS;
	}
	
	@Override
	public UseAction getUseAction(IModifierToolStack tool, int level) {
		return UseAction.BOW;
	}
	
	@Override
	public int getUseDuration(IModifierToolStack tool, int level) {
		return 200;
	}
	
	@Override
	public boolean onStoppedUsing(IModifierToolStack tool, int level, World world, LivingEntity entity, int timeLeft) {
	    int time = this.getUseDuration(tool, level) - timeLeft;
	    double motionX = entity.getMotion().x;
	    double motionY = entity.getMotion().y;
	    double motionZ = entity.getMotion().z;
	    if(time > 5) {
	      if(entity instanceof PlayerEntity) {
	        PlayerEntity entityPlayer = ((PlayerEntity) entity);
	        entityPlayer.addExhaustion(0.2F);
	        entityPlayer.getCooldownTracker().setCooldown(tool.getItem(), 3);
	      }
	      entity.setSprinting(true);

	      float increase = (float) (0.02 * time + 0.2);
	      if(increase > 0.56f) {
	        increase = 0.56f;
	      }
	      motionY += increase;

	      float speed = 0.05F * time;
	      if(speed > 0.925f) {
	        speed = 0.925f;
	      }
	      motionX = (double) (-MathHelper.sin(entity.rotationYaw/ 180.0F * (float) Math.PI) * MathHelper.cos(entity.rotationPitch / 180.0F * (float) Math.PI) * speed);
	      motionZ = (double) (MathHelper.cos(entity.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(entity.rotationPitch / 180.0F * (float) Math.PI) * speed);
	      entity.setMotion(motionX, motionY, motionZ);
	    }

	    return super.onStoppedUsing(tool, level, world, entity, timeLeft);
	}
}
