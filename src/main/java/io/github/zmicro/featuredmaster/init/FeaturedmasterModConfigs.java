package io.github.zmicro.featuredmaster.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import io.github.zmicro.featuredmaster.configuration.MainModConfiguration;
import io.github.zmicro.featuredmaster.FeaturedmasterMod;

@Mod.EventBusSubscriber(modid = FeaturedmasterMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FeaturedmasterModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MainModConfiguration.SPEC, "featuredmaster.toml");
		});
	}
}
