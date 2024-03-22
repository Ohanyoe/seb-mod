
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sebmod.block.JabibiOreBlock;
import net.mcreator.sebmod.block.JabibiBlockBlock;
import net.mcreator.sebmod.SebModMod;

public class SebModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SebModMod.MODID);
	public static final RegistryObject<Block> JABIBI_BLOCK = REGISTRY.register("jabibi_block", () -> new JabibiBlockBlock());
	public static final RegistryObject<Block> JABIBI_ORE = REGISTRY.register("jabibi_ore", () -> new JabibiOreBlock());
}
