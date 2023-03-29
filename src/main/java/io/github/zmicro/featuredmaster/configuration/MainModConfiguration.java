package io.github.zmicro.featuredmaster.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class MainModConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_WMSG;
	static {
		BUILDER.push("chat");
		ENABLE_WMSG = BUILDER.comment("on Value is true, the welcome message will appears on creating / joining world").define("Enable welcome Message?", false);
		BUILDER.comment("this is test");
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
