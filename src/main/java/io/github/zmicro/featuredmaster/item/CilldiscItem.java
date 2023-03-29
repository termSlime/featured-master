
package io.github.zmicro.featuredmaster.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import io.github.zmicro.featuredmaster.init.FeaturedmasterModTabs;

public class CilldiscItem extends RecordItem {
	public CilldiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("featuredmaster:chill_calm1")), new Item.Properties().tab(FeaturedmasterModTabs.TAB_GENERAL).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
