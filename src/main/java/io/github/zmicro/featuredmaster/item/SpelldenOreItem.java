
package io.github.zmicro.featuredmaster.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import io.github.zmicro.featuredmaster.init.FeaturedmasterModTabs;

public class SpelldenOreItem extends Item {
	public SpelldenOreItem() {
		super(new Item.Properties().tab(FeaturedmasterModTabs.TAB_GENERAL).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 5;
	}
}
