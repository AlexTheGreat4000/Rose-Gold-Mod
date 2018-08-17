package com.nvminecraftbros.rosegoldmod.init;

import com.nvminecraftbros.rosegoldmod.Reference;
import com.nvminecraftbros.rosegoldmod.RoseGoldMod;
import com.nvminecraftbros.rosegoldmod.item.ItemRoseGoldArmour;
import com.nvminecraftbros.rosegoldmod.item.ItemRoseGoldAxe;
import com.nvminecraftbros.rosegoldmod.item.ItemRoseGoldHoe;
import com.nvminecraftbros.rosegoldmod.item.ItemRoseGoldPickaxe;
import com.nvminecraftbros.rosegoldmod.item.ItemRoseGoldShovel;
import com.nvminecraftbros.rosegoldmod.item.ItemRoseGoldSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RoseGoldItems {
	
public static Item rose_gold_sword;
public static Item rose_gold_pickaxe;
public static Item rose_gold_ingot;
public static Item rose_gold_axe;
public static Item rose_gold_shovel;
public static Item rose_gold_hoe;

public static Item rose_gold_helmet;
public static Item rose_gold_chestplate;
public static Item rose_gold_leggings;
public static Item rose_gold_boots;

public static final ItemArmor.ArmorMaterial rosegoldarmour = EnumHelper.addArmorMaterial("rosegoldarmour",  "rgm:rose_gold", 50, new int[]{2,5,3,1}, 30);
public static final Item.ToolMaterial rosegoldsword = EnumHelper.addToolMaterial("rosegoldsword", 0, 60, 4.0F, 1.0F, 30);
public static final Item.ToolMaterial rosegoldpickaxe = EnumHelper.addToolMaterial("rosegoldpickaxe", 2, 60, 2.0F, 1.0F, 30);
public static final Item.ToolMaterial rosegoldaxe = EnumHelper.addToolMaterial("rosegoldaxe", 1, 60, 2.0F, 1.0F, 30);
public static final Item.ToolMaterial rosegoldshovel = EnumHelper.addToolMaterial("rosegoldshovel", 1, 60, 2.0F, 1.0F, 30);
public static final Item.ToolMaterial rosegoldhoe = EnumHelper.addToolMaterial("rosegoldhoe", 1, 60, 1.0F, 1.0F, 30);

	public static void init() {
		rose_gold_sword = new ItemRoseGoldSword(rosegoldsword).setUnlocalizedName("rose_gold_sword").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_pickaxe = new ItemRoseGoldPickaxe(rosegoldpickaxe).setUnlocalizedName("rose_gold_pickaxe").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_ingot = new Item().setUnlocalizedName("rose_gold_ingot").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_axe = new ItemRoseGoldAxe(rosegoldaxe).setUnlocalizedName("rose_gold_axe").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_shovel = new ItemRoseGoldShovel(rosegoldshovel).setUnlocalizedName("rose_gold_shovel").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_hoe = new ItemRoseGoldHoe(rosegoldhoe).setUnlocalizedName("rose_gold_hoe").setCreativeTab(RoseGoldMod.tabRoseGold);
		
		rose_gold_helmet = new ItemRoseGoldArmour(rosegoldarmour, 1, 0).setUnlocalizedName("rose_gold_helmet").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_chestplate = new ItemRoseGoldArmour(rosegoldarmour, 1, 1).setUnlocalizedName("rose_gold_chestplate").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_leggings = new ItemRoseGoldArmour(rosegoldarmour, 2, 2).setUnlocalizedName("rose_gold_leggings").setCreativeTab(RoseGoldMod.tabRoseGold);
		rose_gold_boots = new ItemRoseGoldArmour(rosegoldarmour, 1, 3).setUnlocalizedName("rose_gold_boots").setCreativeTab(RoseGoldMod.tabRoseGold);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(rose_gold_sword, rose_gold_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_pickaxe, rose_gold_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_ingot, rose_gold_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_axe, rose_gold_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_shovel, rose_gold_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_hoe, rose_gold_hoe.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(rose_gold_helmet, rose_gold_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_chestplate, rose_gold_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_leggings, rose_gold_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rose_gold_boots, rose_gold_boots.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(rose_gold_sword);
		registerRender(rose_gold_pickaxe);
		registerRender(rose_gold_ingot);
		registerRender(rose_gold_axe);
		registerRender(rose_gold_shovel);
		registerRender(rose_gold_hoe);
		
		registerRender(rose_gold_helmet);
		registerRender(rose_gold_chestplate);
		registerRender(rose_gold_leggings);
		registerRender(rose_gold_boots);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
