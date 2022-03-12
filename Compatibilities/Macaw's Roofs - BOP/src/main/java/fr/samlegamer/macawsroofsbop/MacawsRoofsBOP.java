package fr.samlegamer.macawsroofsbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mcwroofs.kikoz.MacawsRoofs;

import biomesoplenty.core.BiomesOPlenty;
import fr.samlegamer.macawsroofsbop.block.MRBOPBlocksRegistry;
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
	private static final Logger log = LogManager.getLogger();
	
	public MacawsRoofsBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		log.info("Macaw's Roofs - Biome O' Plenty : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MRBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MRBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MRBOPBlocksRegistry.registryLog();
		MRBOPBlocksRegistry.registryPlanks();
		log.info("Macaw's Roofs - Biome O' Plenty : Is Charged");
	}
	
	private void setup(FMLCommonSetupEvent event) {}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_attic_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_cube_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_lower_roof.get(), RenderType.cutoutMipped());
	       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_roof.get(), RenderType.cutoutMipped());
	       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_steep_roof.get(), RenderType.cutoutMipped());
	       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_top_roof.get(), RenderType.cutoutMipped());
	       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_upper_steep_roof.get(), RenderType.cutoutMipped());
	       ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cherry_upper_lower_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.cube_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.attic_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.top_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.lower_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.steep_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.upper_lower_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.upper_steep_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_cube_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_attic_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_top_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_lower_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_steep_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_upper_lower_roof.get(), RenderType.cutoutMipped());
		   ItemBlockRenderTypes.setRenderLayer(MRBOPBlocksRegistry.planks_upper_steep_roof.get(), RenderType.cutoutMipped());
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