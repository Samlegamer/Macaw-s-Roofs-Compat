package fr.samlegamer.macawsroofsbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.macawsroofsbop.block.MRBOPBlocksRegistry;
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

@Mod(value = MacawsRoofsBOP.MODID)
@Mod.EventBusSubscriber(modid = MacawsRoofsBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MacawsRoofsBOP
{
	public static final String MODID = "macawsroofsbop";
    private static CreativeModeTab MR_BOP;
	private static final Logger log = LogManager.getLogger();
	
	public MacawsRoofsBOP()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreateTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
		log.info("Macaw's Roofs - Biome O' Plenty : Loading...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MRBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MRBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		log.info("Macaw's Roofs - Biome O' Plenty : Is Charged");
	}
	
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
	
	private void CreateTab(CreativeModeTabEvent.Register event)
    {
        MR_BOP = event.registerCreativeModeTab(new ResourceLocation("macawsroofsbop", "tab_mrbop"), builder -> builder
        .icon(() -> new ItemStack(MRBOPBlocksRegistry.cherry_roof.get()))
        .title(Component.literal("Macaw's Roofs - BOP")));
    }
    
    private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == MR_BOP)
    	 {
    		 event.accept(MRBOPBlocksRegistry.cherry_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.cherry_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.dead_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.fir_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.hellbark_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.jacaranda_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.magic_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.mahogany_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.palm_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.redwood_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.umbran_planks_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_upper_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_planks_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_planks_attic_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_planks_top_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_planks_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_planks_steep_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_planks_upper_lower_roof.get());

    		 event.accept(MRBOPBlocksRegistry.willow_planks_upper_steep_roof.get());
    	 }
    }
}