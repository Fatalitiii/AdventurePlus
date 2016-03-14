package com.fatalitiii.adventureplus.GUI.Container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerQuestBook extends Container {
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}

}
