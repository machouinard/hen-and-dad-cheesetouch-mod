package com.hankcraft.cheesetouch;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by markchouinard on 9/22/15.
 */
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION)
public class Main {

    public static final String MODID = "cheesetouch";
    public static final String MODNAME = "Cheese Touch";
    public static final String MODVERSION = "1.0.0";

    @Instance("cheesetouch")
    public static Main instance;

    @SidedProxy(clientSide = "com.hankcraft.com.cheesetouch.ClientProxy", serverSide = "com.hankcraft.com.cheesetouch.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        System.out.println("Called method: FMLPreInitializationEvent");
    }
    @EventHandler
    public void init(FMLInitializationEvent e) {

        System.out.println("Called method: FMLInitializationEvent");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        System.out.println("Called method: FMLPostInitializationEvent");
    }

}
