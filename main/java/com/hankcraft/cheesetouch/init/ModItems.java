package com.hankcraft.cheesetouch.init;

import com.hankcraft.cheesetouch.Reference;
import com.hankcraft.cheesetouch.items.CheesePickaxe;
import com.hankcraft.cheesetouch.items.CheeseSlice;
import com.hankcraft.cheesetouch.items.CheeseSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {

    public static Item cheese_sword;
    public static Item cheese_slice;
    public static Item cheese_pickaxe;

    public static void init() {
        cheese_sword = new CheeseSword();
        cheese_slice = new CheeseSlice();
        cheese_pickaxe = new CheesePickaxe();
    }

    public static void register() {
        GameRegistry.registerItem(cheese_sword, cheese_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_slice, cheese_slice.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_pickaxe, cheese_pickaxe.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {

        registerRender( cheese_sword );
        registerRender( cheese_slice );
        registerRender( cheese_pickaxe );
    }

    public static void registerRender( Item item ) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
