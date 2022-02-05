package fr.samlegamer.cave_and_cliff_part_II.bridge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MacawsBridgesCodeGen
{	
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
	
	public static void InitAllItemBlockRenderTypes(String Location, ArrayList<String> Material, String ClassMod)
	{
		ItemBlockRenderTypes.BridgeLog(Location, Material, ClassMod);
		ItemBlockRenderTypes.BridgeRail(Location, Material, ClassMod);
		ItemBlockRenderTypes.BridgeStairsLog(Location, Material, ClassMod);
		ItemBlockRenderTypes.PierBridgeWood(Location, Material, ClassMod);
		ItemBlockRenderTypes.RopeBridge(Location, Material, ClassMod);
	}
	
	public static void InitAllCodeBlock(String Location, ArrayList<String> Material)
	{
		BlockRegistry.BridgeLog(Location, Material);
		BlockRegistry.BridgeRail(Location, Material);
		BlockRegistry.BridgeStairsLog(Location, Material);
		BlockRegistry.PierBridgeWood(Location, Material);
		BlockRegistry.RopeBridge(Location, Material);
	}
	
	public static class ItemBlockRenderTypes
	{
		public static void BridgeLog(String Location, ArrayList<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypeBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_log_bridge_middle.get(), RenderType.cutout());");
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
		
		public static void RopeBridge(String Location, ArrayList<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypeRopesBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+".rope_"+i+"_bridge.get(), RenderType.cutout());");
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
		
		public static void PierBridgeWood(String Location, ArrayList<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypePierBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_bridge_pier.get(), RenderType.cutout());");
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

		public static void BridgeStairsLog(String Location, ArrayList<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypeStairsBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_log_bridge_stair.get(), RenderType.cutout());");
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

		public static void BridgeRail(String Location, ArrayList<String> Material, String ClassMod)
		{
			File file = new File(Location + "/code/RenderType/" + "RenderTypeRailsBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("ItemBlockRenderTypes.setRenderLayer("+ClassMod+"."+i+"_rail_bridge.get(), RenderType.cutout());");
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
	
	public static class BlockRegistry
	{
		public static void BridgeLog(String Location, ArrayList<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_middle = createBlock(\""+i+"_log_bridge_middle\", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
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
		
		public static void RopeBridge(String Location, ArrayList<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksRopeBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> rope_"+i+"_bridge = createBlock(\"rope_"+i+"_bridge\", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
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
		
		public static void PierBridgeWood(String Location, ArrayList<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksPierBridges" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_bridge_pier = createBlock(\""+i+"_bridge_pier\", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
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

		public static void BridgeStairsLog(String Location, ArrayList<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksBridgesStairs" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_log_bridge_stair = createBlock(\""+i+"_log_bridge_stair\", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
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

		public static void BridgeRail(String Location, ArrayList<String> Material)
		{
			File file = new File(Location + "/code/Blocks/" + "BlocksBridgesRails" + ".java");

			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : Material)
					{
						buffer.write("public static final RegistryObject<Block> "+i+"_rail_bridge = createBlock(\""+i+"_rail_bridge\", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));");
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