package com.bettercompat.main.modifiers.trait;

import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.item.IModifiable;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.library.tools.nbt.ModDataNBT;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;

public class ObsidianifiedModifier extends Modifier {

	public ObsidianifiedModifier() {
		super(0x702ead);
	}
	
	@Override
	public void addVolatileData(ToolDefinition toolDefinition, StatsNBT baseStats, IModDataReadOnly persistentData, int level, ModDataNBT volatileData) {
		volatileData.putBoolean(IModifiable.INDESTRUCTIBLE_ENTITY, true);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (isEffective && event.getEntityLiving().areEyesInFluid(FluidTags.WATER)) {
			event.setNewSpeed(event.getNewSpeed() * (level * 1.5f));
		}
		if (isEffective && event.getEntityLiving().areEyesInFluid(FluidTags.LAVA)) {
			event.setNewSpeed(event.getNewSpeed() - (level * 1.5f));
		} else {
			event.getOriginalSpeed();
		}
	}
}
