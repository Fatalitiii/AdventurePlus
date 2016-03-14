package com.fatalitiii.adventureplus.Items;

import com.fatalitiii.adventureplus.AdventurePlus;
import com.fatalitiii.adventureplus.GUI.GuiHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemQuestBook extends Item {

	public ItemQuestBook() {
		this.setMaxStackSize(1);
	}

	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
    	BlockPos pos = playerIn.getPosition();
    	playerIn.openGui(AdventurePlus.instance, GuiHandler.guiQuestBook, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return itemStackIn;
    }
}