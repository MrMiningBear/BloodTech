package com.miningbear.bloodtech.init;

import com.miningbear.bloodtech.item.ItemBT;
import com.miningbear.bloodtech.item.ItemHypodermicNeedle;
import com.miningbear.bloodtech.item.ItemVacutainer;
import com.miningbear.bloodtech.item.ItemVacutainerFilled;
import com.miningbear.bloodtech.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Items {
	
	public static final ItemBT itemVacutainer = new ItemVacutainer();
	public static final ItemBT itemVacutainerFilled = new ItemVacutainerFilled();
	public static final ItemBT itemHypodermicNeedle = new ItemHypodermicNeedle();

	public static void init() {
		GameRegistry.registerItem(itemVacutainer, "itemVacutainer");
		GameRegistry.registerItem(itemVacutainerFilled, "itemVacutainerFilled");
		GameRegistry.registerItem(itemHypodermicNeedle, "itemHypodermicNeedle");
	}
}
