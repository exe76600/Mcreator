package net.mcreator.morethingsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorMoreThingsMod extends Elementsmorethingsmod.ModElement {
	public MCreatorMoreThingsMod(Elementsmorethingsmod instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmorethingsmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorLingotCobalt.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
