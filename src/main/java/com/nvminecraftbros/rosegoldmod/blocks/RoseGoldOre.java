package com.nvminecraftbros.rosegoldmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RoseGoldOre extends Block {
	
	public RoseGoldOre(Material materialIn) {
		super(materialIn);
		this.func_149752_b(10.0F);
		this.func_149711_c(3.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public boolean func_149662_c() {
		return false;
	}
}
