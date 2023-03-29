package io.github.zmicro.featuredmaster.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FeaturedmasterModVariables {
	public static List<Object> test_debug_log = new ArrayList<>();
	public static Map<Object, String> modi = new HashMap<>();
	public static String ver = "\"1.0.0\"";

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
