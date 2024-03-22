
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sebmod.SebModMod;

public class SebModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SebModMod.MODID);
	public static final RegistryObject<CreativeModeTab> SEB_MOD = REGISTRY.register("seb_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.seb_mod_.seb_mod")).icon(() -> new ItemStack(SebModModItems.SKIBIDI_DOP_DOP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SebModModItems.SKIBIDI_DOP_DOP.get());
				tabData.accept(SebModModItems.SKIBIDITOILET_SPAWN_EGG.get());
			}).withSearchBar().build());
}
