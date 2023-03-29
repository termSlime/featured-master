
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.zmicro.featuredmaster.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FeaturedmasterModTabs {
	public static CreativeModeTab TAB_GENERAL;

	public static void load() {
		TAB_GENERAL = new CreativeModeTab("tabgeneral") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.ENDER_PEARL);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
