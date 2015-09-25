package com.hankcraft.cheesetouch.proxy;

import com.hankcraft.cheesetouch.init.ModBlocks;
import com.hankcraft.cheesetouch.init.ModCrafting;
import com.hankcraft.cheesetouch.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by markchouinard on 9/22/15.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {

        super.preInit(e);
        ModCrafting.init();

    }

    @Override
    public void init(FMLInitializationEvent e) {

        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {

        super.postInit(e);
    }

    @Override
    public void registerRenders() {

        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
