
package net.mcreator.sebmod.client.renderer;

import net.mcreator.sebmod.entity.model.GaryModel;
import net.mcreator.sebmod.entity.layer.GaryLayer;
import net.mcreator.sebmod.entity.GaryEntity;

public class GaryRenderer extends GeoEntityRenderer<GaryEntity> {
	public GaryRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GaryModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new GaryLayer(this));
	}

	@Override
	public RenderType getRenderType(GaryEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, GaryEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(GaryEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
