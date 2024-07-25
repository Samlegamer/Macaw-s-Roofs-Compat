package fr.samlegamer.macawsroofsbop.block;

import com.google.common.base.Supplier;
import com.mcwroofs.kikoz.objects.roofs.Lower;
import com.mcwroofs.kikoz.objects.roofs.RoofGlass;
import com.mcwroofs.kikoz.objects.roofs.RoofTopNew;
import com.mcwroofs.kikoz.objects.roofs.Steep;
import com.mcwroofs.kikoz.util.FuelItemBlock;
import fr.samlegamer.macawsroofsbop.MacawsRoofsBOP;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MRBOPBlocksRegistry
{
	public static final DeferredRegister.Blocks BLOCKS_REGISTRY = DeferredRegister.createBlocks(MacawsRoofsBOP.MODID);
	public static final DeferredRegister.Items ITEMS_REGISTRY = DeferredRegister.createItems(MacawsRoofsBOP.MODID);
	public static final DeferredRegister<CreativeModeTab> Item_Group = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MacawsRoofsBOP.MODID);
	
	public static DeferredHolder<CreativeModeTab, CreativeModeTab> MR_BOP_CT = Item_Group.register("tab_mrbop", () -> CreativeModeTab.builder().title((Component)Component.literal("Macaw's Roofs - BOP")).icon(()-> new ItemStack(MRBOPBlocksRegistry.dead_roof.get())).build());
	    
	//Logs Roofs   
    public static final DeferredBlock<Block> dead_roof = createBlock("dead_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_attic_roof = createBlock("dead_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_top_roof = createBlock("dead_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_lower_roof = createBlock("dead_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_steep_roof = createBlock("dead_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_upper_lower_roof = createBlock("dead_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_upper_steep_roof = createBlock("dead_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    
    public static final DeferredBlock<Block> fir_roof = createBlock("fir_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_attic_roof = createBlock("fir_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_top_roof = createBlock("fir_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_lower_roof = createBlock("fir_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_steep_roof = createBlock("fir_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_upper_lower_roof = createBlock("fir_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_upper_steep_roof = createBlock("fir_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    
    public static final DeferredBlock<Block> hellbark_roof = createBlock("hellbark_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_attic_roof = createBlock("hellbark_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_top_roof = createBlock("hellbark_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_lower_roof = createBlock("hellbark_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_steep_roof = createBlock("hellbark_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_upper_lower_roof = createBlock("hellbark_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_upper_steep_roof = createBlock("hellbark_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> jacaranda_roof = createBlock("jacaranda_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_attic_roof = createBlock("jacaranda_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_top_roof = createBlock("jacaranda_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_lower_roof = createBlock("jacaranda_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_steep_roof = createBlock("jacaranda_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_upper_lower_roof = createBlock("jacaranda_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_upper_steep_roof = createBlock("jacaranda_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> magic_roof = createBlock("magic_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_attic_roof = createBlock("magic_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_top_roof = createBlock("magic_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_lower_roof = createBlock("magic_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_steep_roof = createBlock("magic_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_upper_lower_roof = createBlock("magic_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_upper_steep_roof = createBlock("magic_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> mahogany_roof = createBlock("mahogany_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_attic_roof = createBlock("mahogany_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_top_roof = createBlock("mahogany_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_lower_roof = createBlock("mahogany_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_steep_roof = createBlock("mahogany_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_upper_lower_roof = createBlock("mahogany_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_upper_steep_roof = createBlock("mahogany_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> palm_roof = createBlock("palm_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_attic_roof = createBlock("palm_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_top_roof = createBlock("palm_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_lower_roof = createBlock("palm_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_steep_roof = createBlock("palm_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_upper_lower_roof = createBlock("palm_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_upper_steep_roof = createBlock("palm_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> redwood_roof = createBlock("redwood_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_attic_roof = createBlock("redwood_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_top_roof = createBlock("redwood_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_lower_roof = createBlock("redwood_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_steep_roof = createBlock("redwood_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_upper_lower_roof = createBlock("redwood_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_upper_steep_roof = createBlock("redwood_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> umbran_roof = createBlock("umbran_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_attic_roof = createBlock("umbran_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_top_roof = createBlock("umbran_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_lower_roof = createBlock("umbran_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_steep_roof = createBlock("umbran_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_upper_lower_roof = createBlock("umbran_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_upper_steep_roof = createBlock("umbran_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> willow_roof = createBlock("willow_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_attic_roof = createBlock("willow_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_top_roof = createBlock("willow_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_lower_roof = createBlock("willow_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_steep_roof = createBlock("willow_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_upper_lower_roof = createBlock("willow_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_upper_steep_roof = createBlock("willow_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> empyreal_roof = createBlock("empyreal_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_attic_roof = createBlock("empyreal_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_top_roof = createBlock("empyreal_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_lower_roof = createBlock("empyreal_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_steep_roof = createBlock("empyreal_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_upper_lower_roof = createBlock("empyreal_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_upper_steep_roof = createBlock("empyreal_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    
    //Planks Roofs
    public static final DeferredBlock<Block> dead_planks_roof = createBlock("dead_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_planks_attic_roof = createBlock("dead_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_planks_top_roof = createBlock("dead_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_planks_lower_roof = createBlock("dead_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_planks_steep_roof = createBlock("dead_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_planks_upper_lower_roof = createBlock("dead_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_planks_upper_steep_roof = createBlock("dead_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> fir_planks_roof = createBlock("fir_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_planks_attic_roof = createBlock("fir_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_planks_top_roof = createBlock("fir_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_planks_lower_roof = createBlock("fir_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_planks_steep_roof = createBlock("fir_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_planks_upper_lower_roof = createBlock("fir_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_planks_upper_steep_roof = createBlock("fir_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> hellbark_planks_roof = createBlock("hellbark_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_planks_attic_roof = createBlock("hellbark_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_planks_top_roof = createBlock("hellbark_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_planks_lower_roof = createBlock("hellbark_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_planks_steep_roof = createBlock("hellbark_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_planks_upper_lower_roof = createBlock("hellbark_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_planks_upper_steep_roof = createBlock("hellbark_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> jacaranda_planks_roof = createBlock("jacaranda_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_planks_attic_roof = createBlock("jacaranda_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_planks_top_roof = createBlock("jacaranda_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_planks_lower_roof = createBlock("jacaranda_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_planks_steep_roof = createBlock("jacaranda_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_planks_upper_lower_roof = createBlock("jacaranda_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_planks_upper_steep_roof = createBlock("jacaranda_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> magic_planks_roof = createBlock("magic_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_planks_attic_roof = createBlock("magic_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_planks_top_roof = createBlock("magic_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_planks_lower_roof = createBlock("magic_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_planks_steep_roof = createBlock("magic_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_planks_upper_lower_roof = createBlock("magic_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_planks_upper_steep_roof = createBlock("magic_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> mahogany_planks_roof = createBlock("mahogany_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_planks_attic_roof = createBlock("mahogany_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_planks_top_roof = createBlock("mahogany_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_planks_lower_roof = createBlock("mahogany_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_planks_steep_roof = createBlock("mahogany_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_planks_upper_lower_roof = createBlock("mahogany_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_planks_upper_steep_roof = createBlock("mahogany_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> palm_planks_roof = createBlock("palm_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_planks_attic_roof = createBlock("palm_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_planks_top_roof = createBlock("palm_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_planks_lower_roof = createBlock("palm_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_planks_steep_roof = createBlock("palm_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_planks_upper_lower_roof = createBlock("palm_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_planks_upper_steep_roof = createBlock("palm_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> redwood_planks_roof = createBlock("redwood_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_planks_attic_roof = createBlock("redwood_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_planks_top_roof = createBlock("redwood_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_planks_lower_roof = createBlock("redwood_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_planks_steep_roof = createBlock("redwood_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_planks_upper_lower_roof = createBlock("redwood_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_planks_upper_steep_roof = createBlock("redwood_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> umbran_planks_roof = createBlock("umbran_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_planks_attic_roof = createBlock("umbran_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_planks_top_roof = createBlock("umbran_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_planks_lower_roof = createBlock("umbran_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_planks_steep_roof = createBlock("umbran_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_planks_upper_lower_roof = createBlock("umbran_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_planks_upper_steep_roof = createBlock("umbran_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> willow_planks_roof = createBlock("willow_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_planks_attic_roof = createBlock("willow_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_planks_top_roof = createBlock("willow_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_planks_lower_roof = createBlock("willow_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_planks_steep_roof = createBlock("willow_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_planks_upper_lower_roof = createBlock("willow_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_planks_upper_steep_roof = createBlock("willow_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    
    public static final DeferredBlock<Block> empyreal_planks_roof = createBlock("empyreal_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_planks_attic_roof = createBlock("empyreal_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_planks_top_roof = createBlock("empyreal_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_planks_lower_roof = createBlock("empyreal_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_planks_steep_roof = createBlock("empyreal_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_planks_upper_lower_roof = createBlock("empyreal_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_planks_upper_steep_roof = createBlock("empyreal_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static DeferredBlock<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        DeferredBlock<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties()));
        return block;
    }
}