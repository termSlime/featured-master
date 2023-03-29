package io.github.zmicro.featuredmaster.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class MainModClientConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	static {

		SPEC = BUILDER.build();
	}

}
