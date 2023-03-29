
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.zmicro.featuredmaster.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.zmicro.featuredmaster.client.renderer.SlimeRenderer;
import io.github.zmicro.featuredmaster.client.renderer.CslimeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FeaturedmasterModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FeaturedmasterModEntities.SLIME.get(), SlimeRenderer::new);
		event.registerEntityRenderer(FeaturedmasterModEntities.CSLIME.get(), CslimeRenderer::new);
	}
}
