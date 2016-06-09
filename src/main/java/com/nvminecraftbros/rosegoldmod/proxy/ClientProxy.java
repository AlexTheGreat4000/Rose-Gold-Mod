package com.nvminecraftbros.rosegoldmod.proxy;

import com.nvminecraftbros.rosegoldmod.init.RoseGoldBlocks;
import com.nvminecraftbros.rosegoldmod.init.RoseGoldItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		RoseGoldBlocks.registerRenders();
		RoseGoldItems.registerRenders();
	}
}