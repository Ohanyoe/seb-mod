package net.mcreator.sebmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sebmod.entity.GaryEntity;

public class GaryModel extends GeoModel<GaryEntity> {
	@Override
	public ResourceLocation getAnimationResource(GaryEntity entity) {
		return new ResourceLocation("seb_mod_", "animations/gary.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GaryEntity entity) {
		return new ResourceLocation("seb_mod_", "geo/gary.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GaryEntity entity) {
		return new ResourceLocation("seb_mod_", "textures/entities/" + entity.getTexture() + ".png");
	}

}
