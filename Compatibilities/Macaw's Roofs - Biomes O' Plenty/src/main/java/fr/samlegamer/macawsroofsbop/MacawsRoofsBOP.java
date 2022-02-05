package fr.samlegamer.macawsroofsbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mcwroofs.kikoz.MacawsRoofs;

import biomesoplenty.core.BiomesOPlenty;
import fr.samlegamer.macawsroofsbop.block.MRBOPBlocksRegistry;
import fr.samlegamer.macawsroofsbop.item.MRBOPItemsRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import terrablender.core.TerraBlender;

@Mod(value = MacawsRoofsBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsRoofsBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsRoofsBOP
{
	public static final String MODID = "macawsroofsbop";
	public static final TabsMRBOP TAB_GROUP = new TabsMRBOP("tab_mrbop");
	public static final Logger log = LogManager.getLogger();
	
	public MacawsRoofsBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		log.info("Macaw's Roofs - Biome O' Plenty : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MRBOPItemsRegistry.ITEMS_REGISTRY.register(bus);
		MRBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		log.info("Macaw's Roofs - Biome O' Plenty : Is Charged");
	}
	
	private void setup(FMLCommonSetupEvent event){}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_attic_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_attic_roof.get(), RenderType.cutoutMipped());

	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_cube_roof.get(), RenderType.cutoutMipped());
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_cube_roof.get(), RenderType.cutoutMipped());
	
	     ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_lower_roof.get(), RenderType.cutoutMipped());
	   	 ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_lower_roof.get(), RenderType.cutoutMipped());

       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_roof.get(), RenderType.cutoutMipped());

       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_steep_roof.get(), RenderType.cutoutMipped());

       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_top_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_top_roof.get(), RenderType.cutoutMipped());
       
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_upper_steep_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_upper_steep_roof.get(), RenderType.cutoutMipped());

       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.dead_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.fir_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.hellbark_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.jacaranda_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.magic_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.mahogany_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.palm_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.redwood_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.umbran_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_upper_lower_roof.get(), RenderType.cutoutMipped());
       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.willow_planks_upper_lower_roof.get(), RenderType.cutoutMipped());
	}
	
	public static class TabsMRBOP extends CreativeModeTab
	{
		public TabsMRBOP(String p_i1853_2_)
		{
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(MRBOPBlocksRegistry.cherry_roof.get());
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return false;
		}
	}
	
	private void depedencies(BiomesOPlenty bop, MacawsRoofs mcwroofs, TerraBlender terra) {}
}