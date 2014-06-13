package net.bitm.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.bitm.bonytechmod;
import net.bitm.creativeTab;
import net.bitm.config.defaultsettings;

public class chromeglass extends Block{
	public chromeglass (Material material){
		super(material.glass);
		
		this.setHardness(1F);
		this.setStepSound(soundTypeGlass);
		this.setResistance(5);
		this.setBlockName("chromeglass");
		if(defaultsettings.alternetcreativemenuonoff == 0){
			this.setCreativeTab(CreativeTabs.tabBlock);
		}else{
		this.setCreativeTab(creativeTab.bonetabDeco);
		}
		this.setLightLevel(1);
		
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon texture1;
	private IIcon texture2;
	private IIcon texture3;
	private IIcon texture4;
	
	public Item getItemDropped(int par1, Random random, int par2){
		return Item.getItemFromBlock(Blocks.air);
	}
	
	protected boolean canSilkHarvest(){
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass(){
		return 1;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register){
		this.texture1 = register.registerIcon("bitm" + ":" + "chrome1");
		this.texture2 = register.registerIcon("bitm" + ":" + "chrome3");
		this.texture3 = register.registerIcon("bitm" + ":" + "chrome2");
		this.texture4 = register.registerIcon("bitm" + ":" + "chrome4");
		
	
		
	}
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		
		
		switch(side){
		case 0: return this.texture1;
		case 1: return this.texture4;
		case 2: return this.texture2;
		case 3: return this.texture2;
		case 4: return this.texture1;
	
		default: return this.texture3;
		}
		
		
		//Outdated stuff down there. Kept for nostigalic reasons, however you spell that...
		//if(side == 0){
		//	return this.texture1;
		//}
		//if(side == 1){
		//	return this.texture2;
		//}
		//if(side == 2){
		//	return this.texture3;
		//}
		//if(side == 3){
		//	return this.texture4;
		//}
		//if(side == 4){
		//	return this.texture5;
		//}
		//return this.texture6;
	}

}

