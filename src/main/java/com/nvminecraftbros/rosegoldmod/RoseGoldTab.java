package com.nvminecraftbros.rosegoldmod;

import com.nvminecraftbros.rosegoldmod.init.RoseGoldItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RoseGoldTab extends CreativeTabs{

	public RoseGoldTab(String label) {
		super(label);
		this.func_78025_a("rose_gold.png");
	}

	@Override
	public Item func_78016_d() {
		return RoseGoldItems.rose_gold_ingot;
	}
}