package fr.samlegamer.macawsroofsbyg;

import fr.samlegamer.macawsroofsbyg.block.MRBYGBlocksRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MacawsRoofsBYG implements ModInitializer
{
	public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier("tab_mrbyg"), () -> new ItemStack(MRBYGBlocksRegistry.aspen_roof));
	
	@Override
	public void onInitialize()
	{
		MRBYGBlocksRegistry.registry();
	}
}