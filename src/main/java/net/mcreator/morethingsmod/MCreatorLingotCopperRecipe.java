package net.mcreator.morethingsmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorLingotCopperRecipe extends Elementsmorethingsmod.ModElement {
	public MCreatorLingotCopperRecipe(Elementsmorethingsmod instance) {
		super(instance, 112);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMineraisCopper.block, (int) (1)), new ItemStack(MCreatorLingotCopper.block, (int) (1)), 1F);
	}
}
