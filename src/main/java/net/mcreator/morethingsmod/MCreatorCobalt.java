package net.mcreator.morethingsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorCobalt extends Elementsmorethingsmod.ModElement {
	@GameRegistry.ObjectHolder("morethingsmod:cobalthelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("morethingsmod:cobaltbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("morethingsmod:cobaltlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("morethingsmod:cobaltboots")
	public static final Item boots = null;

	public MCreatorCobalt(Elementsmorethingsmod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("COBALT", "morethingsmod:cobalt_", 36, new int[]{10, 13, 14, 10}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("cobalthelmet").setRegistryName("cobalthelmet")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("cobaltbody").setRegistryName("cobaltbody")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("cobaltlegs").setRegistryName("cobaltlegs")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("cobaltboots").setRegistryName("cobaltboots")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("morethingsmod:cobalthelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("morethingsmod:cobaltbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("morethingsmod:cobaltlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("morethingsmod:cobaltboots", "inventory"));
	}
}
