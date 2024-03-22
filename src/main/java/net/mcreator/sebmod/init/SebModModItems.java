
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.sebmod.item.SkibidiDopDopItem;
import net.mcreator.sebmod.SebModMod;

public class SebModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SebModMod.MODID);
	public static final RegistryObject<Item> SKIBIDI_DOP_DOP = REGISTRY.register("skibidi_dop_dop", () -> new SkibidiDopDopItem());
	public static final RegistryObject<Item> SKIBIDITOILET_SPAWN_EGG = REGISTRY.register("skibiditoilet_spawn_egg", () -> new ForgeSpawnEggItem(SebModModEntities.SKIBIDITOILET, -1, -13159, new Item.Properties()));
}
