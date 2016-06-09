package com.nvminecraftbros.rosegoldmod.init;

import com.nvminecraftbros.rosegoldmod.Reference;
import com.nvminecraftbros.rosegoldmod.RoseGoldMod;
import com.nvminecraftbros.rosegoldmod.blocks.RoseGoldBlock;
import com.nvminecraftbros.rosegoldmod.blocks.RoseGoldOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RoseGoldBlocks {

public static Block rose_gold_block;
public static Block rose_gold_ore;
	
	public static void init()
	{
		rose_gold_block = new RoseGoldBlock(Material.field_151576_e).func_149663_c("rose_gold_block").func_149647_a(RoseGoldMod.tabRoseGold);
		rose_gold_ore = new RoseGoldOre(Material.field_151576_e).func_149663_c("rose_gold_ore").func_149647_a(RoseGoldMod.tabRoseGold);
		
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(rose_gold_block, rose_gold_block.func_149739_a().substring(5));
		GameRegistry.registerBlock(rose_gold_ore, rose_gold_ore.func_149739_a().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(rose_gold_block);
		registerRender(rose_gold_ore);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.func_150898_a(block);
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.func_77658_a().substring(5), "inventory"));
	}
}
