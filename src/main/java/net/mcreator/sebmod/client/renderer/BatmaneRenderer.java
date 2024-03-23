
package net.mcreator.sebmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sebmod.entity.model.BatmaneModel;
import net.mcreator.sebmod.entity.layer.BatmaneLayer;
import net.mcreator.sebmod.entity.BatmaneEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BatmaneRenderer extends GeoEntityRenderer<BatmaneEntity> {
	public BatmaneRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BatmaneModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new BatmaneLayer(this));
	}

	@Override
	public RenderType getRenderType(BatmaneEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BatmaneEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(BatmaneEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
