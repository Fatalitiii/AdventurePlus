package com.fatalitiii.adventureplus.Blocks;

import com.fatalitiii.adventureplus.AdventurePlus;
import com.fatalitiii.adventureplus.Utils.ModInfo;
import com.fatalitiii.utilfatal.Register.BlockRegister;

import net.minecraft.block.Block;

public class AdventureBlocks {

	public static Block blockEvent;

	public static void init() {
		BlockRegister.init(blockEvent, BlockEvent.class, "event", AdventurePlus.tab, ModInfo.MOD_ID);
	}

}
