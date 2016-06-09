package com.nvminecraftbros.rosegoldmod;

import com.nvminecraftbros.rosegoldmod.init.RoseGoldBlocks;
import com.nvminecraftbros.rosegoldmod.init.RoseGoldItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void addRecipes() {
	GameRegistry.addRecipe(new ItemStack(RoseGoldBlocks.rose_gold_block), new Object[]{"III", "III", "III", 'I', RoseGoldItems.rose_gold_ingot});
	
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_pickaxe), new Object[]{"III", " S "," S ",'I', RoseGoldItems.rose_gold_ingot, 'S', Items.field_151055_y});
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_sword), new Object[]{" I "," I "," S ", 'I', RoseGoldItems.rose_gold_ingot, 'S', Items.field_151055_y});
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_axe), new Object[]{"II ","IS "," S ", 'I', RoseGoldItems.rose_gold_ingot, 'S', Items.field_151055_y});
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_shovel), new Object[]{" I ", " S ", " S ", 'I', RoseGoldItems.rose_gold_ingot, 'S', Items.field_151055_y});
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_hoe), new Object[]{"II ", " S ", " S ", 'I',RoseGoldItems.rose_gold_ingot, 'S', Items.field_151055_y});
	
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_helmet), new Object[]{"III", "I I", "   ", 'I', RoseGoldItems.rose_gold_ingot});
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_chestplate), new Object[]{"I I", "III", "III", 'I', RoseGoldItems.rose_gold_ingot});
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_leggings), new Object[]{"III", "I I", "I I", 'I', RoseGoldItems.rose_gold_ingot});
	GameRegistry.addRecipe(new ItemStack(RoseGoldItems.rose_gold_boots), new Object[]{"   ", "I I", "I I", 'I', RoseGoldItems.rose_gold_ingot});
	
	GameRegistry.addSmelting(RoseGoldBlocks.rose_gold_ore, new ItemStack(RoseGoldItems.rose_gold_ingot), 1F);
	}
}