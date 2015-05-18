package com.miningbear.bloodtech.init;

import com.miningbear.bloodtech.block.BlockBT;
import com.miningbear.bloodtech.block.BlockBloodBank;
import com.miningbear.bloodtech.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Blocks {
	
	public static final BlockBT blockBloodBank = new BlockBloodBank();
	
	public static void init() {
		
		GameRegistry.registerBlock(blockBloodBank, "blockBloodBank");
	}
}
