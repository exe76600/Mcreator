package net.mcreator.morethingsmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorLingotCobaltRecipe extends Elementsmorethingsmod.ModElement {
	public MCreatorLingotCobaltRecipe(Elementsmorethingsmod instance) {
		super(instance, 85);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMineraisCobalt.block, (int) (1)), new ItemStack(MCreatorLingotCobalt.block, (int) (1)), 1F);
	}
}
