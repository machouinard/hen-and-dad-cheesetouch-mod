package com.hankcraft.cheesetouch.init;

import com.hankcraft.cheesetouch.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by markchouinard on 9/22/15.
 */
public class ModItems {

    public static Item cheese_sword;

    public static void init() {
        cheese_sword = new Item().setUnlocalizedName("cheese_sword");

    }

    public static void register() {
        GameRegistry.registerItem(cheese_sword, cheese_sword.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {
        registerRender( cheese_sword );
    }

    public static void registerRender( Item item ) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
