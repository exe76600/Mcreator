package net.mcreator.morethingsmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorUraniumCoalRecipe extends Elementsmorethingsmod.ModElement {
	public MCreatorUraniumCoalRecipe(Elementsmorethingsmod instance) {
		super(instance, 138);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMineraisUranium.block, (int) (1)), new ItemStack(MCreatorUraniumCoal.block, (int) (1)), 1F);
	}
}
