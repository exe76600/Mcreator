package net.mcreator.morethingsmod;

import net.minecraft.item.ItemStack;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorUraniumFuel extends Elementsmorethingsmod.ModElement {
	public MCreatorUraniumFuel(Elementsmorethingsmod instance) {
		super(instance, 125);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorUraniumCoal.block, (int) (1)).getItem())
			return 10000;
		return 0;
	}
}
