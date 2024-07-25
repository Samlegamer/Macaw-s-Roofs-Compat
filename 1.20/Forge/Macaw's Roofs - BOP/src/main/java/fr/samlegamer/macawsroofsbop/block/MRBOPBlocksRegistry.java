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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MRBOPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsRoofsBOP.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsRoofsBOP.MODID);
	public static final DeferredRegister<CreativeModeTab> Item_Group = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MacawsRoofsBOP.MODID);
	
	public static RegistryObject<CreativeModeTab> MR_BOP_CT = Item_Group.register("tab_mrbop", () -> CreativeModeTab.builder().title((Component)Component.literal("Macaw's Roofs - BOP")).icon(()-> new ItemStack(MRBOPBlocksRegistry.dead_roof.get())).build());
	    
	//Logs Roofs   
    public static final RegistryObject<Block> dead_roof = createBlock("dead_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_attic_roof = createBlock("dead_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_top_roof = createBlock("dead_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_lower_roof = createBlock("dead_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_steep_roof = createBlock("dead_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_upper_lower_roof = createBlock("dead_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_upper_steep_roof = createBlock("dead_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    
    public static final RegistryObject<Block> fir_roof = createBlock("fir_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_attic_roof = createBlock("fir_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_top_roof = createBlock("fir_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_lower_roof = createBlock("fir_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_steep_roof = createBlock("fir_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_upper_lower_roof = createBlock("fir_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_upper_steep_roof = createBlock("fir_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    
    public static final RegistryObject<Block> hellbark_roof = createBlock("hellbark_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_attic_roof = createBlock("hellbark_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_top_roof = createBlock("hellbark_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_lower_roof = createBlock("hellbark_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_steep_roof = createBlock("hellbark_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_upper_lower_roof = createBlock("hellbark_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_upper_steep_roof = createBlock("hellbark_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> jacaranda_roof = createBlock("jacaranda_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_attic_roof = createBlock("jacaranda_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_top_roof = createBlock("jacaranda_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_lower_roof = createBlock("jacaranda_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_steep_roof = createBlock("jacaranda_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_upper_lower_roof = createBlock("jacaranda_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_upper_steep_roof = createBlock("jacaranda_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> magic_roof = createBlock("magic_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_attic_roof = createBlock("magic_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_top_roof = createBlock("magic_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_lower_roof = createBlock("magic_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_steep_roof = createBlock("magic_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_upper_lower_roof = createBlock("magic_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_upper_steep_roof = createBlock("magic_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> mahogany_roof = createBlock("mahogany_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_attic_roof = createBlock("mahogany_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_top_roof = createBlock("mahogany_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_lower_roof = createBlock("mahogany_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_steep_roof = createBlock("mahogany_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_upper_lower_roof = createBlock("mahogany_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_upper_steep_roof = createBlock("mahogany_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> palm_roof = createBlock("palm_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_attic_roof = createBlock("palm_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_top_roof = createBlock("palm_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_lower_roof = createBlock("palm_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_steep_roof = createBlock("palm_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_upper_lower_roof = createBlock("palm_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_upper_steep_roof = createBlock("palm_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> redwood_roof = createBlock("redwood_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_attic_roof = createBlock("redwood_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_top_roof = createBlock("redwood_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_lower_roof = createBlock("redwood_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_steep_roof = createBlock("redwood_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_upper_lower_roof = createBlock("redwood_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_upper_steep_roof = createBlock("redwood_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> umbran_roof = createBlock("umbran_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_attic_roof = createBlock("umbran_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_top_roof = createBlock("umbran_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_lower_roof = createBlock("umbran_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_steep_roof = createBlock("umbran_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_upper_lower_roof = createBlock("umbran_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_upper_steep_roof = createBlock("umbran_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> willow_roof = createBlock("willow_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_attic_roof = createBlock("willow_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_top_roof = createBlock("willow_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_lower_roof = createBlock("willow_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_steep_roof = createBlock("willow_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_upper_lower_roof = createBlock("willow_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_upper_steep_roof = createBlock("willow_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    
    //Planks Roofs
    public static final RegistryObject<Block> dead_planks_roof = createBlock("dead_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_planks_attic_roof = createBlock("dead_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_planks_top_roof = createBlock("dead_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_planks_lower_roof = createBlock("dead_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_planks_steep_roof = createBlock("dead_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_planks_upper_lower_roof = createBlock("dead_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> dead_planks_upper_steep_roof = createBlock("dead_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> fir_planks_roof = createBlock("fir_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_planks_attic_roof = createBlock("fir_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_planks_top_roof = createBlock("fir_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_planks_lower_roof = createBlock("fir_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_planks_steep_roof = createBlock("fir_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_planks_upper_lower_roof = createBlock("fir_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> fir_planks_upper_steep_roof = createBlock("fir_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> hellbark_planks_roof = createBlock("hellbark_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_planks_attic_roof = createBlock("hellbark_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_planks_top_roof = createBlock("hellbark_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_planks_lower_roof = createBlock("hellbark_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_planks_steep_roof = createBlock("hellbark_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_planks_upper_lower_roof = createBlock("hellbark_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> hellbark_planks_upper_steep_roof = createBlock("hellbark_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> jacaranda_planks_roof = createBlock("jacaranda_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_planks_attic_roof = createBlock("jacaranda_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_planks_top_roof = createBlock("jacaranda_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_planks_lower_roof = createBlock("jacaranda_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_planks_steep_roof = createBlock("jacaranda_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_planks_upper_lower_roof = createBlock("jacaranda_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jacaranda_planks_upper_steep_roof = createBlock("jacaranda_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> magic_planks_roof = createBlock("magic_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_planks_attic_roof = createBlock("magic_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_planks_top_roof = createBlock("magic_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_planks_lower_roof = createBlock("magic_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_planks_steep_roof = createBlock("magic_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_planks_upper_lower_roof = createBlock("magic_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> magic_planks_upper_steep_roof = createBlock("magic_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> mahogany_planks_roof = createBlock("mahogany_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_planks_attic_roof = createBlock("mahogany_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_planks_top_roof = createBlock("mahogany_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_planks_lower_roof = createBlock("mahogany_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_planks_steep_roof = createBlock("mahogany_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_planks_upper_lower_roof = createBlock("mahogany_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mahogany_planks_upper_steep_roof = createBlock("mahogany_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> palm_planks_roof = createBlock("palm_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_planks_attic_roof = createBlock("palm_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_planks_top_roof = createBlock("palm_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_planks_lower_roof = createBlock("palm_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_planks_steep_roof = createBlock("palm_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_planks_upper_lower_roof = createBlock("palm_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> palm_planks_upper_steep_roof = createBlock("palm_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> redwood_planks_roof = createBlock("redwood_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_planks_attic_roof = createBlock("redwood_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_planks_top_roof = createBlock("redwood_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_planks_lower_roof = createBlock("redwood_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_planks_steep_roof = createBlock("redwood_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_planks_upper_lower_roof = createBlock("redwood_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> redwood_planks_upper_steep_roof = createBlock("redwood_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> umbran_planks_roof = createBlock("umbran_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_planks_attic_roof = createBlock("umbran_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_planks_top_roof = createBlock("umbran_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_planks_lower_roof = createBlock("umbran_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_planks_steep_roof = createBlock("umbran_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_planks_upper_lower_roof = createBlock("umbran_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> umbran_planks_upper_steep_roof = createBlock("umbran_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> willow_planks_roof = createBlock("willow_planks_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_planks_attic_roof = createBlock("willow_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_planks_top_roof = createBlock("willow_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_planks_lower_roof = createBlock("willow_planks_lower_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_planks_steep_roof = createBlock("willow_planks_steep_roof", () -> new StairBlock(()->Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_planks_upper_lower_roof = createBlock("willow_planks_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> willow_planks_upper_steep_roof = createBlock("willow_planks_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState() ,BlockBehaviour.Properties.of().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties()));
        return block;
    }
}