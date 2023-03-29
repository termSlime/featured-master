
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.zmicro.featuredmaster.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import io.github.zmicro.featuredmaster.item.SpelldenOreItem;
import io.github.zmicro.featuredmaster.item.CilldiscItem;
import io.github.zmicro.featuredmaster.FeaturedmasterMod;

public class FeaturedmasterModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FeaturedmasterMod.MODID);
	public static final RegistryObject<Item> SLIME_SPAWN_EGG = REGISTRY.register("slime_spawn_egg", () -> new ForgeSpawnEggItem(FeaturedmasterModEntities.SLIME, -13382656, -13369549, new Item.Properties().tab(FeaturedmasterModTabs.TAB_GENERAL)));
	public static final RegistryObject<Item> CILLDISC = REGISTRY.register("cilldisc", () -> new CilldiscItem());
	public static final RegistryObject<Item> CSLIME_SPAWN_EGG = REGISTRY.register("cslime_spawn_egg", () -> new ForgeSpawnEggItem(FeaturedmasterModEntities.CSLIME, -16738048, -13369549, new Item.Properties().tab(FeaturedmasterModTabs.TAB_GENERAL)));
	public static final RegistryObject<Item> SPELLDEN = block(FeaturedmasterModBlocks.SPELLDEN, FeaturedmasterModTabs.TAB_GENERAL);
	public static final RegistryObject<Item> SPELLDEN_ORE = REGISTRY.register("spellden_ore", () -> new SpelldenOreItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
