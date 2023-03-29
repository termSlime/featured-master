
package io.github.zmicro.featuredmaster.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import io.github.zmicro.featuredmaster.entity.model.CslimeModel;
import io.github.zmicro.featuredmaster.entity.CslimeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CslimeRenderer extends GeoEntityRenderer<CslimeEntity> {
	public CslimeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CslimeModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(CslimeEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
