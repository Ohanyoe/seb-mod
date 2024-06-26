package net.mcreator.sebmod.entity.layer;

import net.mcreator.sebmod.entity.AmongUsEntity;

public class AmongUsLayer extends GeoRenderLayer<AmongUsEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("seb_mod_", "textures/entities/amongus.png");

	public AmongUsLayer(GeoRenderer<AmongUsEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, AmongUsEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}
