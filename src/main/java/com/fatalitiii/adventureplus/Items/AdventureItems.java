package com.fatalitiii.adventureplus.Items;

import com.fatalitiii.adventureplus.AdventurePlus;
import com.fatalitiii.adventureplus.Utils.ModInfo;
import com.fatalitiii.utilfatal.Register.ItemRegister;

import net.minecraft.item.Item;

public class AdventureItems {

	public static Item itemQuest;

	public static void init() {
		ItemRegister.init(itemQuest, ItemQuestBook.class, "questbook", AdventurePlus.tab, ModInfo.MOD_ID);
	}
	
}
