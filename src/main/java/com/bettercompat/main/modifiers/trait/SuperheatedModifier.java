package com.bettercompat.main.modifiers.trait;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.loot.LootContext;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.common.recipe.RecipeCacheInvalidator;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.recipe.SingleItemInventory;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class SuperheatedModifier extends Modifier {
	
	//Autosmelt properties pulled from Tinkers Construct AutosmeltModifier class
	
	private final Cache<Item,Optional<FurnaceRecipe>> recipeCache = CacheBuilder
			.newBuilder()
			.maximumSize(64)
			.build();
	
	private final SingleItemInventory inventory = new SingleItemInventory();

	public SuperheatedModifier() {
		super(0xFF5A27);
		RecipeCacheInvalidator.addReloadListener(client -> {
			if (!client) {
				recipeCache.invalidateAll();
			}
		});
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if (attacker.canEquip(tool.getItem()))  {
			if (!target.isImmuneToFire() && !target.isPotionActive(Effects.FIRE_RESISTANCE)) {
				target.setFire(level * 3);
			}
			float bonus = level * 4;
			target.attackEntityFrom(DamageSource.MAGIC, bonus);
		}
		return 0;
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		PlayerEntity player = event.getPlayer();
		boolean isInNether = player.getEntityWorld().getDimensionKey().equals(World.THE_NETHER);
		if (isInNether && isEffective) {
			float speed = event.getOriginalSpeed();
			speed += event.getOriginalSpeed() * level + 0.75f;
			event.setNewSpeed(speed);
		}
	}
	
	@Override
	public List<ItemStack> processLoot(IModifierToolStack tool, int level, List<ItemStack> generatedLoot, LootContext context) {
		World world = context.getWorld();
		if (!generatedLoot.isEmpty()) {
			return generatedLoot.stream()
					.map(stack -> smeltItem(stack, world))
					.filter(stack -> !stack.isEmpty())
					.collect(Collectors.toList());
		}
		return generatedLoot;
	}

	private Optional<FurnaceRecipe> findRecipe(ItemStack stack, World world) {
		inventory.setStack(stack);
		return world.getRecipeManager().getRecipe(IRecipeType.SMELTING, inventory, world);
	}
	
	@Nullable
	private FurnaceRecipe findCachedRecipe(ItemStack stack, World world) {
		if (stack.hasTag()) {
			return findRecipe(stack, world).orElse(null);
		} try {
			return recipeCache.get(stack.getItem(), () -> findRecipe(stack, world)).orElse(null);
		} catch (ExecutionException e) {
			return null;
		}
	}
	
	private ItemStack smeltItem(ItemStack stack, World world) {
		FurnaceRecipe recipe = findCachedRecipe(stack, world);
		if (recipe != null) {
			inventory.setStack(stack);
			ItemStack output = recipe.getCraftingResult(inventory);
			if (stack.getCount() > 1) {
				output.setCount(output.getCount() * stack.getCount());
			}
			return output;
		}
		return stack;
	}
}
