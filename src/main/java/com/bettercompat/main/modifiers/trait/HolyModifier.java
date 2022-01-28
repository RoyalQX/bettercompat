package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class HolyModifier extends Modifier {

	//pulled from older Tinkers Construct alpha
	
	private final CreatureAttribute type;
	public HolyModifier() {
		super(0x79cfd2);
		this.type = new CreatureAttribute();
	}

	  
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		if (target.getCreatureAttribute() != type) {
			damageDealt += level * 2.5f;
	    }
		return 0;
	}
}
