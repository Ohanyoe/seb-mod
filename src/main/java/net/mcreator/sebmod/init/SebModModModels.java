
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sebmod.client.model.Modelskibidi_toilet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SebModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelskibidi_toilet.LAYER_LOCATION, Modelskibidi_toilet::createBodyLayer);
	}
}
