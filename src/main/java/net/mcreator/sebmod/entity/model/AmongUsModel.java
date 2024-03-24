package net.mcreator.sebmod.entity.model;

import net.mcreator.sebmod.entity.AmongUsEntity;

public class AmongUsModel extends GeoModel<AmongUsEntity> {
	@Override
	public ResourceLocation getAnimationResource(AmongUsEntity entity) {
		return new ResourceLocation("seb_mod_", "animations/among_us.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AmongUsEntity entity) {
		return new ResourceLocation("seb_mod_", "geo/among_us.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AmongUsEntity entity) {
		return new ResourceLocation("seb_mod_", "textures/entities/" + entity.getTexture() + ".png");
	}

}
