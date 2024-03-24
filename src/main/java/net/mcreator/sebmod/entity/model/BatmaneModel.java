package net.mcreator.sebmod.entity.model;

import net.mcreator.sebmod.entity.BatmaneEntity;

public class BatmaneModel extends GeoModel<BatmaneEntity> {
	@Override
	public ResourceLocation getAnimationResource(BatmaneEntity entity) {
		return new ResourceLocation("seb_mod_", "animations/batman.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BatmaneEntity entity) {
		return new ResourceLocation("seb_mod_", "geo/batman.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BatmaneEntity entity) {
		return new ResourceLocation("seb_mod_", "textures/entities/" + entity.getTexture() + ".png");
	}

}
