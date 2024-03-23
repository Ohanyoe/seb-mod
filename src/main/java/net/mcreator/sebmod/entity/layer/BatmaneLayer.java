package net.mcreator.sebmod.entity.layer;

public class BatmaneLayer extends GeoRenderLayer<BatmaneEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("seb_mod_", "textures/entities/batemane.png");

	public BatmaneLayer(GeoRenderer<BatmaneEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, BatmaneEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}