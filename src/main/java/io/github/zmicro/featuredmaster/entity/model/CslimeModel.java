package io.github.zmicro.featuredmaster.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import io.github.zmicro.featuredmaster.entity.CslimeEntity;

public class CslimeModel extends AnimatedGeoModel<CslimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(CslimeEntity entity) {
		return new ResourceLocation("featuredmaster", "animations/cslime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CslimeEntity entity) {
		return new ResourceLocation("featuredmaster", "geo/cslime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CslimeEntity entity) {
		return new ResourceLocation("featuredmaster", "textures/entities/" + entity.getTexture() + ".png");
	}

}
