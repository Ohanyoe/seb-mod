
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.sebmod.SebModMod;

public class SebModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SebModMod.MODID);
	public static final RegistryObject<Potion> PETERPOTION = REGISTRY.register("peterpotion",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10000, 100, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10000, 2, false, true), new MobEffectInstance(MobEffects.REGENERATION, 10000, 10, false, true),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10000, 100, false, true), new MobEffectInstance(MobEffects.WATER_BREATHING, 10000, 100, false, true), new MobEffectInstance(MobEffects.ABSORPTION, 10000, 100, false, true)));
	public static final RegistryObject<Potion> IMPOSTERPOTION = REGISTRY.register("imposterpotion",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10000, 10, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10000, 100, false, true), new MobEffectInstance(MobEffects.REGENERATION, 10000, 10, false, true),
					new MobEffectInstance(MobEffects.JUMP, 10000, 10, false, true), new MobEffectInstance(MobEffects.ABSORPTION, 10000, 100, false, true)));
}
