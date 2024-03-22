
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sebmod.SebModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SebModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SebModMod.MODID);
	public static final RegistryObject<CreativeModeTab> SEB_MOD = REGISTRY.register("seb_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.seb_mod_.seb_mod")).icon(() -> new ItemStack(SebModModItems.SKIBIDI_DOP_DOP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SebModModItems.SKIBIDI_DOP_DOP.get());
				tabData.accept(SebModModItems.SKIBIDITOILET_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SebModModBlocks.JABIBI_BLOCK.get().asItem());
			tabData.accept(SebModModBlocks.JABIBI_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SebModModItems.JABIBITOOLS_SWORD.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_HELMET.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SebModModItems.JABIBI.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SebModModItems.JABIBITOOLS_AXE.get());
			tabData.accept(SebModModItems.JABIBITOOLS_PICKAXE.get());
			tabData.accept(SebModModItems.JABIBITOOLS_SHOVEL.get());
			tabData.accept(SebModModItems.JABIBITOOLS_HOE.get());
		}
	}
}
