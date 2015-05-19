package com.miningbear.bloodtech.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.miningbear.bloodtech.init.Items;
import com.miningbear.bloodtech.reference.Reference;

public class CreativeTabBT {
	
	public static final CreativeTabs BT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return Items.itemVacutainerFilled;
		}
	};
}
