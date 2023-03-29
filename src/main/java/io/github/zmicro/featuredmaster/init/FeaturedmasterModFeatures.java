
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.zmicro.featuredmaster.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import io.github.zmicro.featuredmaster.world.features.ores.SpelldenFeature;
import io.github.zmicro.featuredmaster.FeaturedmasterMod;

@Mod.EventBusSubscriber
public class FeaturedmasterModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FeaturedmasterMod.MODID);
	public static final RegistryObject<Feature<?>> SPELLDEN = REGISTRY.register("spellden", SpelldenFeature::feature);
}
