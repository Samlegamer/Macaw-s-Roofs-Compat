package fr.samlegamer.cave_and_cliff_part_II.roof;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MCRCodeGen
{
	/*
	 * NOT FINISHED - ALPHA (A)
	 */
	
	public static void init(String location)
	{
		File folderCode = new File(location + "code/");
		File folderRenderType = new File(location + "code/RenderType/");
		File folderBlocks = new File(location + "code/Blocks/");

		if(!folderCode.exists() || !folderRenderType.exists() || !folderBlocks.exists())
		{
			folderCode.mkdir();
			folderRenderType.mkdir();
			folderBlocks.mkdir();
		}
	}

	public static class ItemBlockRenderTypes
	{
		public static void InitRendersLog(String Location, ArrayList<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypeRoofsLog" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_attic_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_cube_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_lower_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_steep_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_top_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_upper_lower_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_upper_steep_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void InitRendersPlanks(String Location, ArrayList<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypeRoofsPlanks" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_attic_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_cube_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_lower_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_steep_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_top_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_upper_lower_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_planks_upper_steep_roof.get(), RenderType.cutout());");
						buffer.newLine();
					}
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class BlockRegistries
	{
		public static void registerBlockLog(String Location, ArrayList<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksRoofsLog" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_attic_roof = createBlock(\""+i+"_attic_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_cube_roof = createBlock(\""+i+"_cube_roof\", () -> new RoofBlock(BlockBehaviour.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).strengh(2.0F, 2.3F))););");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_lower_roof = createBlock(\""+i+"_lower_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_roof = createBlock(\""+i+"_roof\", () -> new StairsBlock(Blocks.OAK_PLANKS.defaultBlockstate, BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_steep_roof = createBlock(\""+i+"_steep_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_top_roof = createBlock(\""+i+"_top_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_upper_lower_roof = createBlock(\""+i+"_upper_lower_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_upper_steep_roof = createBlock(\""+i+"_upper_steep_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void registerBlockPlanks(String Location, ArrayList<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksRoofsPlanks" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_attic_roof = createBlock(\""+i+"_planks_attic_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_cube_roof = createBlock(\""+i+"_planks_cube_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_lower_roof = createBlock(\""+i+"_planks_lower_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_roof = createBlock(\""+i+"_planks_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_steep_roof = createBlock(\""+i+"_planks_steep_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_top_roof = createBlock(\""+i+"_planks_top_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_upper_lower_roof = createBlock(\""+i+"_planks_upper_lower_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_planks_upper_steep_roof = createBlock(\""+i+"_planks_upper_steep_roof\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
						buffer.newLine();
					}
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}