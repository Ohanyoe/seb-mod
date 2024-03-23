
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.mcreator.sebmod.SebModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SebModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SebModMod.MODID);
	public static final RegistryObject<CreativeModeTab> SEB_MOD = REGISTRY.register("seb_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.seb_mod_.seb_mod")).icon(() -> new ItemStack(SebModModItems.SKIBIDI_DOP_DOP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SebModModItems.SKIBIDI_DOP_DOP.get());
				tabData.accept(SebModModItems.SKIBIDITOILET_SPAWN_EGG.get());
				tabData.accept(SebModModItems.NASTYPATTY.get());
				tabData.accept(SebModModItems.PRETTY_PATTY.get());
				tabData.accept(SebModModItems.BATMANE_SPAWN_EGG.get());
				tabData.accept(SebModModItems.PETER_GRIFFIN.get());
				tabData.accept(SebModModItems.GARY_SPAWN_EGG.get());
				tabData.accept(SebModModItems.BEHELIT.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SebModModBlocks.JABIBI_BLOCK.get().asItem());
			tabData.accept(SebModModBlocks.JABIBI_ORE.get().asItem());
			tabData.accept(SebModModBlocks.PETER_ORE.get().asItem());
			tabData.accept(SebModModBlocks.PETER_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SebModModItems.JABIBITOOLS_SWORD.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_HELMET.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(SebModModItems.JABIBIARMOR_ARMOR_BOOTS.get());
			tabData.accept(SebModModItems.PETE_ARMOR_HELMET.get());
			tabData.accept(SebModModItems.PETE_ARMOR_CHESTPLATE.get());
			tabData.accept(SebModModItems.PETE_ARMOR_LEGGINGS.get());
			tabData.accept(SebModModItems.PETE_ARMOR_BOOTS.get());
			tabData.accept(SebModModItems.PETE_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(SebModModItems.AMONG_US_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SebModModItems.JABIBI.get());
			tabData.accept(SebModModItems.PETER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SebModModItems.JABIBITOOLS_AXE.get());
			tabData.accept(SebModModItems.JABIBITOOLS_PICKAXE.get());
			tabData.accept(SebModModItems.JABIBITOOLS_SHOVEL.get());
			tabData.accept(SebModModItems.JABIBITOOLS_HOE.get());
			tabData.accept(SebModModItems.PETE_PICKAXE.get());
			tabData.accept(SebModModItems.PETE_AXE.get());
			tabData.accept(SebModModItems.PETE_SHOVEL.get());
			tabData.accept(SebModModItems.PETE_HOE.get());
		}
	}
}
