package fr.samlegamer.macawsroofsbyg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.macawsroofsbyg.block.MRBYGBlocksRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = McwRoofsBYG.MODID)
@Mod.EventBusSubscriber(modid = McwRoofsBYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwRoofsBYG
{ 
	public static final String MODID = "macawsroofsbyg";
	public static final Logger log = LogManager.getLogger();
	private static CreativeModeTab MR_BYG;
	
	public McwRoofsBYG()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreateTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
		log.info("Macaw's Roofs - Oh The Biomes You'll Go : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MRBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MRBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		log.info("Macaw's Roofs - Oh The Biomes You'll Go : Is Charged");
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_planks_attic_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_planks_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_planks_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_planks_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_planks_top_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_planks_upper_lower_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.aspen_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.baobab_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.blue_enchanted_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cherry_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cika_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.cypress_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ebony_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.ether_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.fir_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.green_enchanted_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.holly_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.jacaranda_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.lament_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.mahogany_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.white_mangrove_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.maple_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.nightshade_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.palm_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.pine_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.redwood_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.skyris_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.willow_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.witch_hazel_planks_upper_steep_roof.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MRBYGBlocksRegistry.zelkova_planks_upper_steep_roof.get(), RenderType.cutout());
	}
	
	private void CreateTab(CreativeModeTabEvent.Register event)
    {
		MR_BYG = event.registerCreativeModeTab(new ResourceLocation("macawsroofsbyg", "tab_mrbyg"), builder -> builder
        .icon(() -> new ItemStack(MRBYGBlocksRegistry.aspen_roof.get()))
        .title(Component.literal("Macaw's Roofs - BYG")));
    }
    
    private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == MR_BYG)
    	 {
    		 event.accept(MRBYGBlocksRegistry.aspen_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.aspen_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.baobab_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.blue_enchanted_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cherry_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cika_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.cypress_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ebony_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.ether_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.fir_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.green_enchanted_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.holly_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.jacaranda_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.lament_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.mahogany_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.white_mangrove_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.maple_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.nightshade_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.palm_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.pine_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.redwood_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.skyris_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.willow_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.witch_hazel_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.zelkova_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.bulbis_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.imparius_planks_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_upper_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_planks_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_planks_attic_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_planks_top_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_planks_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_planks_steep_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_planks_upper_lower_roof.get());

    		 event.accept(MRBYGBlocksRegistry.sythian_planks_upper_steep_roof.get());
    		 //Finish
    	 }
    }
}