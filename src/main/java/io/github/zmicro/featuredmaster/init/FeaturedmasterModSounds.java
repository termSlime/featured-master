
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.zmicro.featuredmaster.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import io.github.zmicro.featuredmaster.FeaturedmasterMod;

public class FeaturedmasterModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FeaturedmasterMod.MODID);
	public static final RegistryObject<SoundEvent> CHILL_CALM1 = REGISTRY.register("chill_calm1", () -> new SoundEvent(new ResourceLocation("featuredmaster", "chill_calm1")));
	public static final RegistryObject<SoundEvent> CAVESTATIC_LOW = REGISTRY.register("cavestatic_low", () -> new SoundEvent(new ResourceLocation("featuredmaster", "cavestatic_low")));
	public static final RegistryObject<SoundEvent> PLY_WALK1 = REGISTRY.register("ply_walk1", () -> new SoundEvent(new ResourceLocation("featuredmaster", "ply_walk1")));
}
