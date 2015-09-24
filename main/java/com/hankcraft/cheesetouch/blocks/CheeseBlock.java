package com.hankcraft.cheesetouch.blocks;

import com.hankcraft.cheesetouch.CheesetouchMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class CheeseBlock extends Block {

        public CheeseBlock(Material material) {
            super(material);
            this.setUnlocalizedName("cheeseBlock");
            this.setCreativeTab(CheesetouchMain.cheeseTab);
            this.setResistance(5.0F);
            this.setHardness(10.0F);
            this.setLightLevel(1.0F);
            this.setStepSound(soundTypePiston);
        }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, Entity entityIn) {
        // Chucks player WAY up in the air = certain death :)
//        entityIn.motionY += 4.0;
        if(entityIn instanceof EntityLivingBase) {
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 600, 3));
        }
    }
}
