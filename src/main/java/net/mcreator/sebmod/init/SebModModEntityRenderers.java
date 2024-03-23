
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.mcreator.sebmod.client.renderer.SkibiditoiletRenderer;
import net.mcreator.sebmod.client.renderer.GaryRenderer;
import net.mcreator.sebmod.client.renderer.BatmaneRenderer;
import net.mcreator.sebmod.client.renderer.AmongUsRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SebModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SebModModEntities.SKIBIDITOILET.get(), SkibiditoiletRenderer::new);
		event.registerEntityRenderer(SebModModEntities.AMONG_US.get(), AmongUsRenderer::new);
		event.registerEntityRenderer(SebModModEntities.BATMANE.get(), BatmaneRenderer::new);
		event.registerEntityRenderer(SebModModEntities.GARY.get(), GaryRenderer::new);
	}
}
