
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.mcreator.sebmod.item.SkibidiDopDopItem;
import net.mcreator.sebmod.item.PrettyPattyItem;
import net.mcreator.sebmod.item.NastypattyItem;
import net.mcreator.sebmod.item.JabibitoolsSwordItem;
import net.mcreator.sebmod.item.JabibitoolsShovelItem;
import net.mcreator.sebmod.item.JabibitoolsPickaxeItem;
import net.mcreator.sebmod.item.JabibitoolsHoeItem;
import net.mcreator.sebmod.item.JabibitoolsAxeItem;
import net.mcreator.sebmod.item.JabibiarmorArmorItem;
import net.mcreator.sebmod.item.JabibiItem;
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
	public static final RegistryObject<Item> BATMANE_SPAWN_EGG = REGISTRY.register("batmane_spawn_egg", () -> new ForgeSpawnEggItem(SebModModEntities.BATMANE, -13421773, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> GARY_SPAWN_EGG = REGISTRY.register("gary_spawn_egg", () -> new ForgeSpawnEggItem(SebModModEntities.GARY, -39169, -39322, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
