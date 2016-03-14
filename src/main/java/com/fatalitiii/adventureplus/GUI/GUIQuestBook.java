package com.fatalitiii.adventureplus.GUI;

import java.awt.Color;

import com.fatalitiii.adventureplus.Utils.ModInfo;
import com.fatalitiii.utilfatal.gui.guiElement;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GUIQuestBook extends GuiContainer {

	public final ResourceLocation BACKGROUND = new ResourceLocation(ModInfo.MOD_ID + ":textures/gui/questBook.png");

	public GUIQuestBook(Container container) {
		super(container);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		Minecraft.getMinecraft().getTextureManager().bindTexture(BACKGROUND);
		int x = 25;
		//Top
		guiElement.drawRectWithUV(50+x, 20, 0, 0, 12, 12, 12, 12);
		guiElement.drawRectWithUV(62+x, 20, 12, 0, 300, 12, 1, 12);
		guiElement.drawRectWithUV(362+x, 20, 14, 0, 12, 12, 12, 12);
		
		//Middle
		guiElement.drawRectWithUV(50+x, 32, 0, 12, 12, 154, 12, 1);
		guiElement.drawRectWithUV(361+x, 32, 13, 12, 12, 154, 12, 1);
		guiElement.drawRectWithUV(62+x, 32, 13, 13, 299, 154, 1, 1);
		
		//Bottom
		guiElement.drawRectWithUV(50+x, 186, 0, 13, 12, 12, 12, 12);
		guiElement.drawRectWithUV(62+x, 186, 12,13, 300, 12, 1, 12);
		guiElement.drawRectWithUV(362+x, 186, 14, 13, 12, 12, 12, 12);
		
		guiElement.drawRectWithUV(170+x, 27, 27, 0, 5, 164, 5, 1);
		
		guiElement.drawRectWithUV(180+x, 29, 27, 0, 180, 100, 1, 1);
		
		guiElement.addElement(62+x, 176, 3, 28, 18, 10, "", 1, BACKGROUND, Color.ORANGE.getRGB(), this);
	}

}
