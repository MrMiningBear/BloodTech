package com.miningbear.bloodtech.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.miningbear.bloodtech.handler.ConfigurationHandler;
import com.miningbear.bloodtech.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class GuiConfigBT extends GuiConfig {

	public GuiConfigBT(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement<Object>(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
