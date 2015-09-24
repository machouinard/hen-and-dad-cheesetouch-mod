package com.hankcraft.cheesetouch;

import com.hankcraft.cheesetouch.init.ModBlocks;
import com.hankcraft.cheesetouch.init.ModItems;
import com.hankcraft.cheesetouch.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class CheesetouchMain {

    public static final CheeseTab cheeseTab = new CheeseTab("cheeseTab");

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Instance("cheesetouch")
    public static CheesetouchMain instance;

    public static Item.ToolMaterial KRYPTONITE;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        KRYPTONITE  = EnumHelper.addToolMaterial("KRYPTONITE", 3, 800, 10.0F, 4.0F, 20);
        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();

    }
    @EventHandler
    public void init(FMLInitializationEvent e) {

        proxy.registerRenders();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

}
