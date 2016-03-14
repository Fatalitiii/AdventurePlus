package com.fatalitiii.adventureplus.GUI;

import com.fatalitiii.adventureplus.GUI.Container.ContainerQuestBook;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public final static int guiQuestBook = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
		case guiQuestBook:
			return new ContainerQuestBook();

		default:
			break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
		case guiQuestBook:
			return new GUIQuestBook(new ContainerQuestBook());

		default:
			break;
		}
		return null;
	}

}
