package com.miningbear.bloodtech.handler;

import java.io.File;

import com.miningbear.bloodtech.reference.Reference;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {

	public static Configuration configuration;
	
	public static boolean generateCopperOre = true;
	public static boolean generateTinOre = true;
	
	public static void init(File configFile) {

		if (configuration == null) {
			
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e) {
		
		if (e.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		
		generateTinOre = configuration.getBoolean("generateTinOre", Configuration.CATEGORY_GENERAL, true, "");
		generateCopperOre = configuration.getBoolean("generateCopperOre", "WORLD", true, "");
	
		if (configuration.hasChanged()) {
			configuration.save();
		}
	}
}
