package net.mcreator.sebmod.entity.model;

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
