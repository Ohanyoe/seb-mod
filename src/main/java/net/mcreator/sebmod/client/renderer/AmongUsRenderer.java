
package net.mcreator.sebmod.client.renderer;

import net.mcreator.sebmod.entity.model.AmongUsModel;
import net.mcreator.sebmod.entity.layer.AmongUsLayer;
import net.mcreator.sebmod.entity.AmongUsEntity;

public class AmongUsRenderer extends GeoEntityRenderer<AmongUsEntity> {
	public AmongUsRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AmongUsModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new AmongUsLayer(this));
	}

	@Override
	public RenderType getRenderType(AmongUsEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, AmongUsEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(AmongUsEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
