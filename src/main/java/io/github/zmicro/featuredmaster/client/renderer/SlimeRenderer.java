
package io.github.zmicro.featuredmaster.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import io.github.zmicro.featuredmaster.entity.SlimeEntity;

public class SlimeRenderer extends MobRenderer<SlimeEntity, SlimeModel<SlimeEntity>> {
	public SlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlimeEntity entity) {
		return new ResourceLocation("featuredmaster:textures/entities/unnamed.png");
	}
}
