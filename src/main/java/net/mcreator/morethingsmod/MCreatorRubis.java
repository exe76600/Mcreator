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
public class MCreatorRubis extends Elementsmorethingsmod.ModElement {
	@GameRegistry.ObjectHolder("morethingsmod:rubishelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("morethingsmod:rubisbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("morethingsmod:rubislegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("morethingsmod:rubisboots")
	public static final Item boots = null;

	public MCreatorRubis(Elementsmorethingsmod instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RUBIS", "morethingsmod:rubis_", 33, new int[]{8, 11, 12, 8}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rubishelmet").setRegistryName("rubishelmet")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("rubisbody").setRegistryName("rubisbody")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("rubislegs").setRegistryName("rubislegs")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("rubisboots").setRegistryName("rubisboots")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("morethingsmod:rubishelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("morethingsmod:rubisbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("morethingsmod:rubislegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("morethingsmod:rubisboots", "inventory"));
	}
}
