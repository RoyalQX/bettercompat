package com.bettercompat.main.modifiers.craftable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.modifiers.SingleLevelModifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import wayoftime.bloodmagic.api.compat.IDemonWill;
import wayoftime.bloodmagic.common.item.BloodMagicItems;
import wayoftime.bloodmagic.will.PlayerDemonWillHandler;

public class SentientModifier extends SingleLevelModifier {

	public SentientModifier() {
		super(0xb3f4f6);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
        if(target.getHealth() <= 0 && (target instanceof PlayerEntity || target instanceof MonsterEntity)) {
            IDemonWill soul = ((IDemonWill) BloodMagicItems.MONSTER_SOUL_RAW.get());
            double willModifier = target instanceof SlimeEntity ? 0.67 : 1;
            ItemStack soulStack = soul.createWill(willModifier * (target.world.rand.nextDouble()  * target.getMaxHealth() / 20d));
            if (target.world.rand.nextDouble() < 1) {
                PlayerDemonWillHandler.addDemonWill((PlayerEntity)attacker, soulStack);
            }
        }
		return 0;
	}
}
