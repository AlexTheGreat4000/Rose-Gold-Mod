package com.nvminecraftbros.rosegoldmod.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import net.minecraft.item.ItemArmor.ArmorMaterial;
public class ItemRoseGoldArmour extends ItemArmor {

	public String textureName;

	public ItemRoseGoldArmour(ArmorMaterial string, int renderIndex, int armorType) {
		super(string, renderIndex, armorType);
		
		this.func_77655_b(func_77658_a());
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.field_77881_a == 2)
		{
			return "rgm:textures/models/armor/rose_gold_layer_2.png";
		}
		return "rgm:textures/models/armor/rose_gold_layer_1.png";
	}
}
