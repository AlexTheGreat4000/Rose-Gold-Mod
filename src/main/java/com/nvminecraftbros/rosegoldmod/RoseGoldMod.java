package com.nvminecraftbros.rosegoldmod;

import com.nvminecraftbros.rosegoldmod.init.RoseGoldBlocks;
import com.nvminecraftbros.rosegoldmod.init.RoseGoldItems;
import com.nvminecraftbros.rosegoldmod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class RoseGoldMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final RoseGoldTab tabRoseGold = new RoseGoldTab("tabRoseGold");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RoseGoldBlocks.init();
		RoseGoldBlocks.register();
		RoseGoldItems.init();
		RoseGoldItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		ModRecipes.addRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}