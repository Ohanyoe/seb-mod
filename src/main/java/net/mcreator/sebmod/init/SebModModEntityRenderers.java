
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.sebmod.client.renderer.SkibiditoiletRenderer;
import net.mcreator.sebmod.client.renderer.AmongUsRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SebModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SebModModEntities.SKIBIDITOILET.get(), SkibiditoiletRenderer::new);
		event.registerEntityRenderer(SebModModEntities.AMONG_US.get(), AmongUsRenderer::new);
	}
}
