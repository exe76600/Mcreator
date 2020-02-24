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
public class MCreatorCopper extends Elementsmorethingsmod.ModElement {
	@GameRegistry.ObjectHolder("morethingsmod:copperhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("morethingsmod:copperbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("morethingsmod:copperlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("morethingsmod:copperboots")
	public static final Item boots = null;

	public MCreatorCopper(Elementsmorethingsmod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("COPPER", "morethingsmod:copper_", 30, new int[]{6, 9, 10, 6}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("copperhelmet").setRegistryName("copperhelmet")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("copperbody").setRegistryName("copperbody")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("copperlegs").setRegistryName("copperlegs")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("copperboots").setRegistryName("copperboots")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("morethingsmod:copperhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("morethingsmod:copperbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("morethingsmod:copperlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("morethingsmod:copperboots", "inventory"));
	}
}
