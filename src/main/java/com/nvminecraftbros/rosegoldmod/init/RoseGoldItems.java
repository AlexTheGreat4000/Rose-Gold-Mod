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
		rose_gold_sword = new ItemRoseGoldSword(rosegoldsword).func_77655_b("rose_gold_sword").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_pickaxe = new ItemRoseGoldPickaxe(rosegoldpickaxe).func_77655_b("rose_gold_pickaxe").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_ingot = new Item().func_77655_b("rose_gold_ingot").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_axe = new ItemRoseGoldAxe(rosegoldaxe).func_77655_b("rose_gold_axe").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_shovel = new ItemRoseGoldShovel(rosegoldshovel).func_77655_b("rose_gold_shovel").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_hoe = new ItemRoseGoldHoe(rosegoldhoe).func_77655_b("rose_gold_hoe").func_77637_a(RoseGoldMod.tabRoseGold);
		
		rose_gold_helmet = new ItemRoseGoldArmour(rosegoldarmour, 1, 0).func_77655_b("rose_gold_helmet").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_chestplate = new ItemRoseGoldArmour(rosegoldarmour, 1, 1).func_77655_b("rose_gold_chestplate").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_leggings = new ItemRoseGoldArmour(rosegoldarmour, 2, 2).func_77655_b("rose_gold_leggings").func_77637_a(RoseGoldMod.tabRoseGold);
		rose_gold_boots = new ItemRoseGoldArmour(rosegoldarmour, 1, 3).func_77655_b("rose_gold_boots").func_77637_a(RoseGoldMod.tabRoseGold);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(rose_gold_sword, rose_gold_sword.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_pickaxe, rose_gold_pickaxe.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_ingot, rose_gold_ingot.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_axe, rose_gold_axe.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_shovel, rose_gold_shovel.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_hoe, rose_gold_hoe.func_77658_a().substring(5));
		
		GameRegistry.registerItem(rose_gold_helmet, rose_gold_helmet.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_chestplate, rose_gold_chestplate.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_leggings, rose_gold_leggings.func_77658_a().substring(5));
		GameRegistry.registerItem(rose_gold_boots, rose_gold_boots.func_77658_a().substring(5));
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
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.func_77658_a().substring(5), "inventory"));
	}
}