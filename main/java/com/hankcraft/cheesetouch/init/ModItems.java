package com.hankcraft.cheesetouch.init;

import com.hankcraft.cheesetouch.Reference;
import com.hankcraft.cheesetouch.items.CheeseSlice;
import com.hankcraft.cheesetouch.items.CheeseSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {

    public static Item cheese_sword;
    public static Item cheese_slice;

    public static void init() {
        cheese_sword = new CheeseSword(Item.ToolMaterial.IRON);
        cheese_slice = new CheeseSlice();
    }

    public static void register() {
        GameRegistry.registerItem(cheese_sword, cheese_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_slice, cheese_slice.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {

        registerRender( cheese_sword );
        registerRender( cheese_slice );
    }

    public static void registerRender( Item item ) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
