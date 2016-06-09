package com.nvminecraftbros.rosegoldmod.proxy;

import com.nvminecraftbros.rosegoldmod.world.RoseGoldWorldGeneration;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void registerRenders() {
		
	}
	
	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new RoseGoldWorldGeneration(), 0);
	}
}
