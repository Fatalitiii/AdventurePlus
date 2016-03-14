package com.fatalitiii.adventureplus.Utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AdventureTab extends CreativeTabs {

	public AdventureTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.diamond_sword;
	}

}
