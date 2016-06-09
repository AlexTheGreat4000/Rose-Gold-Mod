package com.nvminecraftbros.rosegoldmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RoseGoldBlock extends Block{

	public RoseGoldBlock(Material materialIn) {
		super(materialIn);
		this.func_149752_b(10.0F);
		this.func_149711_c(3.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	public boolean isQpaqueCube() {
		return false;
	}

}
