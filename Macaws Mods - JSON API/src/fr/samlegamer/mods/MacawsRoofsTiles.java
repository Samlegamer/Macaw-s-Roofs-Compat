package fr.samlegamer.mods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MacawsRoofsTiles
{
	public static void init(String location)
	{
		
	}
	
	public static void createTileLog(String Location, String CompatModid, String material)
	{
		File file = new File(Location + "/models/item/" + "tile_log_" + material + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"item/generated\",\r\n"
						+ "    \"textures\": \r\n"
						+ "    {\r\n"
						+ "        \"layer0\": \""+CompatModid+":item/tile_log_"+material+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
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
	
	public static void createTilePlanks(String Location, String CompatModid, String material)
	{
		File file = new File(Location + "/models/item/" + "tile_planks_" + material + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "    \"parent\": \"item/generated\",\r\n"
						+ "    \"textures\": \r\n"
						+ "    {\r\n"
						+ "        \"layer0\": \""+CompatModid+":item/tile_planks_"+material+"\"\r\n"
						+ "    }\r\n"
						+ "}");
				
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

	public static class Code
	{
		public static void TileLog(String Location, ArrayList<String> mat)
		{
			File file = new File(Location + "/code/" + "Tiles_Log_Code" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : mat)
					{
						buffer.write("public static final RegistryObject<Item> tile_log_"+i+" = ITEMS_REGISTRY.register(\"tile_log_"+i+"\", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs)));");
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
		
		public static void TilePlanks(String Location, ArrayList<String> mat)
		{
			File file = new File(Location + "/code/" + "Tiles_Planks_Code"+".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					for(String i : mat)
					{
						buffer.write("public static final RegistryObject<Item> tile_planks_"+i+" = ITEMS_REGISTRY.register(\"tile_planks_"+i+"\", () -> new Item(new Item.Properties().tab(MacawsRoofs.roofs)));");
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