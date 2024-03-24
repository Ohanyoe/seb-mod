
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sebmod.item.SkibidiDopDopItem;
import net.mcreator.sebmod.item.PrettyPattyItem;
import net.mcreator.sebmod.item.PeterItem;
import net.mcreator.sebmod.item.PeterGriffinItem;
import net.mcreator.sebmod.item.PeteSwordItem;
import net.mcreator.sebmod.item.PeteShovelItem;
import net.mcreator.sebmod.item.PetePickaxeItem;
import net.mcreator.sebmod.item.PeteHoeItem;
import net.mcreator.sebmod.item.PeteAxeItem;
import net.mcreator.sebmod.item.PeteArmorItem;
import net.mcreator.sebmod.item.NastypattyItem;
import net.mcreator.sebmod.item.JabibitoolsSwordItem;
import net.mcreator.sebmod.item.JabibitoolsShovelItem;
import net.mcreator.sebmod.item.JabibitoolsPickaxeItem;
import net.mcreator.sebmod.item.JabibitoolsHoeItem;
import net.mcreator.sebmod.item.JabibitoolsAxeItem;
import net.mcreator.sebmod.item.JabibiarmorArmorItem;
import net.mcreator.sebmod.item.JabibiItem;
import net.mcreator.sebmod.item.JabeebeeItem;
import net.mcreator.sebmod.item.BehelitItem;
import net.mcreator.sebmod.SebModMod;

public class SebModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SebModMod.MODID);
	public static final RegistryObject<Item> SKIBIDI_DOP_DOP = REGISTRY.register("skibidi_dop_dop", () -> new SkibidiDopDopItem());
	public static final RegistryObject<Item> SKIBIDITOILET_SPAWN_EGG = REGISTRY.register("skibiditoilet_spawn_egg", () -> new ForgeSpawnEggItem(SebModModEntities.SKIBIDITOILET, -1, -13159, new Item.Properties()));
	public static final RegistryObject<Item> JABIBI_BLOCK = block(SebModModBlocks.JABIBI_BLOCK);
	public static final RegistryObject<Item> JABIBI_ORE = block(SebModModBlocks.JABIBI_ORE);
	public static final RegistryObject<Item> JABIBI = REGISTRY.register("jabibi", () -> new JabibiItem());
	public static final RegistryObject<Item> JABIBITOOLS_AXE = REGISTRY.register("jabibitools_axe", () -> new JabibitoolsAxeItem());
	public static final RegistryObject<Item> JABIBITOOLS_PICKAXE = REGISTRY.register("jabibitools_pickaxe", () -> new JabibitoolsPickaxeItem());
	public static final RegistryObject<Item> JABIBITOOLS_SWORD = REGISTRY.register("jabibitools_sword", () -> new JabibitoolsSwordItem());
	public static final RegistryObject<Item> JABIBITOOLS_SHOVEL = REGISTRY.register("jabibitools_shovel", () -> new JabibitoolsShovelItem());
	public static final RegistryObject<Item> JABIBITOOLS_HOE = REGISTRY.register("jabibitools_hoe", () -> new JabibitoolsHoeItem());
	public static final RegistryObject<Item> JABIBIARMOR_ARMOR_HELMET = REGISTRY.register("jabibiarmor_armor_helmet", () -> new JabibiarmorArmorItem.Helmet());
	public static final RegistryObject<Item> JABIBIARMOR_ARMOR_CHESTPLATE = REGISTRY.register("jabibiarmor_armor_chestplate", () -> new JabibiarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> JABIBIARMOR_ARMOR_LEGGINGS = REGISTRY.register("jabibiarmor_armor_leggings", () -> new JabibiarmorArmorItem.Leggings());
	public static final RegistryObject<Item> JABIBIARMOR_ARMOR_BOOTS = REGISTRY.register("jabibiarmor_armor_boots", () -> new JabibiarmorArmorItem.Boots());
	public static final RegistryObject<Item> NASTYPATTY = REGISTRY.register("nastypatty", () -> new NastypattyItem());
	public static final RegistryObject<Item> AMONG_US_SPAWN_EGG = REGISTRY.register("among_us_spawn_egg", () -> new ForgeSpawnEggItem(SebModModEntities.AMONG_US, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PRETTY_PATTY = REGISTRY.register("pretty_patty", () -> new PrettyPattyItem());
	public static final RegistryObject<Item> PETER_GRIFFIN = REGISTRY.register("peter_griffin", () -> new PeterGriffinItem());
	public static final RegistryObject<Item> BATMANE_SPAWN_EGG = REGISTRY.register("batmane_spawn_egg", () -> new ForgeSpawnEggItem(SebModModEntities.BATMANE, -13421773, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> PETER_ORE = block(SebModModBlocks.PETER_ORE);
	public static final RegistryObject<Item> GARY_SPAWN_EGG = REGISTRY.register("gary_spawn_egg", () -> new ForgeSpawnEggItem(SebModModEntities.GARY, -39169, -39322, new Item.Properties()));
	public static final RegistryObject<Item> PETER_BLOCK = block(SebModModBlocks.PETER_BLOCK);
	public static final RegistryObject<Item> PETER = REGISTRY.register("peter", () -> new PeterItem());
	public static final RegistryObject<Item> PETE_ARMOR_HELMET = REGISTRY.register("pete_armor_helmet", () -> new PeteArmorItem.Helmet());
	public static final RegistryObject<Item> PETE_ARMOR_CHESTPLATE = REGISTRY.register("pete_armor_chestplate", () -> new PeteArmorItem.Chestplate());
	public static final RegistryObject<Item> PETE_ARMOR_LEGGINGS = REGISTRY.register("pete_armor_leggings", () -> new PeteArmorItem.Leggings());
	public static final RegistryObject<Item> PETE_ARMOR_BOOTS = REGISTRY.register("pete_armor_boots", () -> new PeteArmorItem.Boots());
	public static final RegistryObject<Item> PETE_PICKAXE = REGISTRY.register("pete_pickaxe", () -> new PetePickaxeItem());
	public static final RegistryObject<Item> PETE_AXE = REGISTRY.register("pete_axe", () -> new PeteAxeItem());
	public static final RegistryObject<Item> PETE_SWORD = REGISTRY.register("pete_sword", () -> new PeteSwordItem());
	public static final RegistryObject<Item> PETE_SHOVEL = REGISTRY.register("pete_shovel", () -> new PeteShovelItem());
	public static final RegistryObject<Item> PETE_HOE = REGISTRY.register("pete_hoe", () -> new PeteHoeItem());
	public static final RegistryObject<Item> BEHELIT = REGISTRY.register("behelit", () -> new BehelitItem());
	public static final RegistryObject<Item> JABEEBEE = REGISTRY.register("jabeebee", () -> new JabeebeeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
