
package net.mcreator.sebmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sebmod.entity.model.SkibiditoiletModel;
import net.mcreator.sebmod.entity.layer.SkibiditoiletLayer;
import net.mcreator.sebmod.entity.SkibiditoiletEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SkibiditoiletRenderer extends GeoEntityRenderer<SkibiditoiletEntity> {
	public SkibiditoiletRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SkibiditoiletModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new SkibiditoiletLayer(this));
	}

	@Override
	public RenderType getRenderType(SkibiditoiletEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, SkibiditoiletEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(SkibiditoiletEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
