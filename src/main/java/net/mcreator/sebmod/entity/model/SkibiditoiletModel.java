package net.mcreator.sebmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sebmod.entity.SkibiditoiletEntity;

public class SkibiditoiletModel extends GeoModel<SkibiditoiletEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkibiditoiletEntity entity) {
		return new ResourceLocation("seb_mod_", "animations/skibidi_toilet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkibiditoiletEntity entity) {
		return new ResourceLocation("seb_mod_", "geo/skibidi_toilet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkibiditoiletEntity entity) {
		return new ResourceLocation("seb_mod_", "textures/entities/" + entity.getTexture() + ".png");
	}

}
