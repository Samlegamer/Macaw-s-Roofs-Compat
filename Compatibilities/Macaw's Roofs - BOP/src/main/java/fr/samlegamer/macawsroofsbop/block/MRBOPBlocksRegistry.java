package fr.samlegamer.macawsroofsbop.block;

import java.util.ArrayList;

import com.google.common.base.Supplier;
import com.mcwroofs.kikoz.objects.roofs.Lower;
import com.mcwroofs.kikoz.objects.roofs.RoofBlock;
import com.mcwroofs.kikoz.objects.roofs.RoofGlass;
import com.mcwroofs.kikoz.objects.roofs.RoofTopNew;
import com.mcwroofs.kikoz.objects.roofs.Steep;
import com.mcwroofs.kikoz.util.FuelItemBlock;
import fr.samlegamer.macawsroofsbop.MacawsRoofsBOP;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MRBOPBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsRoofsBOP.MODID);
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsRoofsBOP.MODID);

	//Logs Roofs
    public static final RegistryObject<Block> cherry_cube_roof = createBlock("cherry_cube_roof", () -> new RoofBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_roof = createBlock("cherry_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_attic_roof = createBlock("cherry_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_top_roof = createBlock("cherry_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_lower_roof = createBlock("cherry_lower_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_steep_roof = createBlock("cherry_steep_roof", () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_upper_lower_roof = createBlock("cherry_upper_lower_roof", () -> new Lower(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> cherry_upper_steep_roof = createBlock("cherry_upper_steep_roof", () -> new Steep(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));    
    
    public static RegistryObject<Block> cube_roof, roof, attic_roof, top_roof, lower_roof, steep_roof, upper_lower_roof, upper_steep_roof;
    public static RegistryObject<Block> planks_cube_roof, planks_roof, planks_attic_roof, planks_top_roof, planks_lower_roof, planks_steep_roof, planks_upper_lower_roof, planks_upper_steep_roof;

    public static void registryLog()
    {
    	ArrayList<String> MATERIAL = new ArrayList<String>();
    	
		MATERIAL.add("dead");
		MATERIAL.add("fir");
		MATERIAL.add("hellbark");
		MATERIAL.add("jacaranda");
		MATERIAL.add("magic");
		MATERIAL.add("mahogany");
		MATERIAL.add("palm");
		MATERIAL.add("redwood");
		MATERIAL.add("umbran");
		MATERIAL.add("willow");

		var st = Blocks.OAK_PLANKS.defaultBlockState();
		
		for(String i : MATERIAL)
		{
			cube_roof = createBlock(""+i+"_cube_roof", () -> new RoofBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			roof = createBlock(""+i+"_roof", () -> new StairBlock(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			attic_roof = createBlock(""+i+"_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			top_roof = createBlock(""+i+"_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			lower_roof = createBlock(""+i+"_lower_roof", () -> new StairBlock(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			steep_roof = createBlock(""+i+"_steep_roof", () -> new StairBlock(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			upper_lower_roof = createBlock(""+i+"_upper_lower_roof", () -> new Lower(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			upper_steep_roof = createBlock(""+i+"_upper_steep_roof", () -> new Steep(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
		}
    }
    
    public static void registryPlanks()
    {
    	ArrayList<String> MATERIAL = new ArrayList<String>();
    	
		MATERIAL.add("cherry");
		MATERIAL.add("dead");
		MATERIAL.add("fir");
		MATERIAL.add("hellbark");
		MATERIAL.add("jacaranda");
		MATERIAL.add("magic");
		MATERIAL.add("mahogany");
		MATERIAL.add("palm");
		MATERIAL.add("redwood");
		MATERIAL.add("umbran");
		MATERIAL.add("willow");

		var st = Blocks.OAK_PLANKS.defaultBlockState();

		for(String i : MATERIAL)
		{
			planks_cube_roof = createBlock(""+i+"_planks_cube_roof", () -> new RoofBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			planks_roof = createBlock(""+i+"_planks_roof", () -> new StairBlock(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			planks_attic_roof = createBlock(""+i+"_planks_attic_roof", () -> new RoofGlass(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			planks_top_roof = createBlock(""+i+"_planks_top_roof", () -> new RoofTopNew(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			planks_lower_roof = createBlock(""+i+"_planks_lower_roof", () -> new StairBlock(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			planks_steep_roof = createBlock(""+i+"_planks_steep_roof", () -> new StairBlock(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			planks_upper_lower_roof = createBlock(""+i+"_planks_upper_lower_roof", () -> new Lower(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
			planks_upper_steep_roof = createBlock(""+i+"_planks_upper_steep_roof", () -> new Steep(st, BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 2.0F).sound(SoundType.WOOD)));
		}
    }
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(MacawsRoofsBOP.TAB_GROUP)));
        return block;
    }
}