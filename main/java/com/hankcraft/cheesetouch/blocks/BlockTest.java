package com.hankcraft.cheesetouch.blocks;

import com.hankcraft.cheesetouch.CheesetouchMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockTest extends Block {

    public BlockTest(Material materialIn) {

        super(materialIn);
        this.setUnlocalizedName("test_block");
//        this.setCreativeTab(CheesetouchMain.cheeseTab).setLightLevel(0.75F);
    }

}
