
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.zmicro.featuredmaster.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.github.zmicro.featuredmaster.block.SpelldenBlock;
import io.github.zmicro.featuredmaster.FeaturedmasterMod;

public class FeaturedmasterModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FeaturedmasterMod.MODID);
	public static final RegistryObject<Block> SPELLDEN = REGISTRY.register("spellden", () -> new SpelldenBlock());
}
