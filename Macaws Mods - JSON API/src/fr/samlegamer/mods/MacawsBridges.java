package fr.samlegamer.mods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MacawsBridges
{	
	public static void init(String location)
	{		
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderBridge = new File(location + "models/block/bridge/");
		File folderBridgeWood = new File(location + "models/block/bridge/bridge_wood/");
		File folderBridgeStone = new File(location + "models/block/bridge/bridge_stone/");
		File folderBridgerail = new File(location + "models/block/bridge/rail/");
		File folderBridgeRope = new File(location + "models/block/bridge/rope/");
		File folderItem = new File(location + "models/item/");
		File folderStair = new File(location + "models/block/stair/");
		File folderStairWood = new File(location + "models/block/stair/wood/");
		File folderStairRope = new File(location + "models/block/stair/rope/");
		File folderStairStone = new File(location + "models/block/stair/stone/");
		File foldersupport_pier = new File(location + "models/block/support_pier/");
		File foldersupport_pierWood = new File(location + "models/block/support_pier/wooden/");
		File foldersupport_pierStone = new File(location + "models/block/support_pier/stone/");
		
		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists() || !folderBridge.exists()
		|| !folderBridgeWood.exists() || !folderItem.exists() || !folderBridgeStone.exists() || !folderBridgeRope.exists()
		|| !folderStair.exists() || !folderStairWood.exists() || !folderStairRope.exists() || !folderStairStone.exists()
		|| !foldersupport_pier.exists() || !foldersupport_pierWood.exists() || !foldersupport_pierStone.exists() || !folderBridgerail.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderBridge.mkdir();
			folderBridgeWood.mkdir();
			folderItem.mkdir();
			folderBridgeStone.mkdir();
			folderBridgeRope.mkdir();
			folderBridgerail.mkdir();
			folderStair.mkdir();
			folderStairWood.mkdir();
			folderStairRope.mkdir();
			folderStairStone.mkdir();
			foldersupport_pier.mkdir();
			foldersupport_pierWood.mkdir();
			foldersupport_pierStone.mkdir();
		}
	}
	
	public static void InitAllWood(String location, String modid, String blockstateName)
	{
		
	}
	
	public static class BridgeLog
	{
	
		public static void createBlockstate(String location, String modid, String blockstateName)
	{
		File file = new File(location + "/blockstates/" + blockstateName + "_log_bridge_middle" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("      {\"multipart\": [{\r\n"
						+ "      \"when\": { \"OR\": [{ \"facing\": \"north|south\"}]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_base\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"OR\": [{ \"facing\": \"east|west\"}]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_base\", \"y\": 0}},{   \r\n"
						+ "      \"when\": { \"torch\": \"true\" },\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_base_torch\" }},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 0}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 0}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_left\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side_right\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_corner\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_side\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\", \"y\": 180}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\", \"y\": 270}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle_end\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\"}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\", \"y\": 90}},{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/bridge_wood/" + blockstateName + "_middle\"}}]}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
	{
		File bridge_base = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_base" + ".json");
		File bridge_base_torch = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_base_torch" + ".json");
		File bridge_corner = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_corner" + ".json");
		File bridge_inventory = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_inventory" + ".json");
		File bridge_middle = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_middle" + ".json");
		File bridge_middle_end = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_middle_end" + ".json");
		File bridge_side = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side" + ".json");
		File bridge_side_left = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side_left" + ".json");
		File bridge_side_right = new File(location + "/models/block/bridge/bridge_wood/" + nameMaterial + "_side_right" + ".json");

		if(!bridge_base.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/base\",\r\n"
						+ "\"textures\":{\"1\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
						+ "\"2\": \"" + TextureLocationFormodid + "/" + nameMaterial + "_planks" + "\",\r\n"
						+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + "_planks" + "\"}}");
				
				buffer.close();
				writer.close();
				bridge_base.createNewFile();
				System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!bridge_base_torch.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base_torch);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/base_torch\",\r\n"
						+ "\"textures\": {\"1\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
						+ "\"3\": \"minecraft:block/torch\",\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + "_planks" + "\"}}");
				
				buffer.close();
				writer.close();
				bridge_base_torch.createNewFile();
				System.out.println("Le fichier " + bridge_base_torch + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		if(!bridge_corner.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_corner);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/corner\",\r\n"
						+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
						+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
				
				buffer.close();
				writer.close();
				bridge_corner.createNewFile();
				System.out.println("Le fichier " + bridge_corner + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			if(!bridge_inventory.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_inventory);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/inventory\",\r\n"
							+ "\"textures\": {\"0\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"2\": \"" + TextureLocationFormodid + "/" + nameMaterial + "_planks\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_inventory.createNewFile();
					System.out.println("Le fichier " + bridge_inventory + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_middle.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_middle);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/middle\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_middle.createNewFile();
					System.out.println("Le fichier " + bridge_middle + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_middle_end.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_middle_end);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/middle_end\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1\": \"" + TextureLocationFormodid + "/" + nameMaterial + "_planks\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_middle_end.createNewFile();
					System.out.println("Le fichier " + bridge_middle_end + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side\",\r\n"
							+ "\"textures\": {\"0\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_side.createNewFile();
					System.out.println("Le fichier " + bridge_side + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side_left\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_left.createNewFile();
					System.out.println("Le fichier " + bridge_side_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_side_right.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_right);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_wood/parent/side_right\",\r\n"
							+ "\"textures\":{\"0\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_right.createNewFile();
					System.out.println("Le fichier " + bridge_side_right + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
	{
		File file = new File(location + "/models/item/" + mat + "_log_bridge_middle" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \"" + modid + ":block/bridge/bridge_wood/" + mat + "_inventory\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	}
	
	public static class RopeBridge
	{
	
		public static void createBlockstate(String location, String modid, String blockstateName)
	{
		File file = new File(location + "/blockstates/" + "rope_" + blockstateName + "_bridge" + ".json");
	
	if(!file.exists())
	{
		try
		{
			FileWriter writer = new FileWriter(file);
			BufferedWriter buffer = new BufferedWriter(writer);
			
			buffer.write("{\r\n"
					+ "  \"multipart\": [\r\n"
					+ "\r\n"
					+ "    {   \"when\": { \"OR\": [\r\n"
					+ "        { \"facing\": \"north|south\"}\r\n"
					+ "        ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_base\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{   \"when\": { \"OR\": [\r\n"
					+ "        { \"facing\": \"east|west\"}\r\n"
					+ "        ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_base\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "	\r\n"
					+ "        {   \"when\": { \"torch\": \"true\" },\r\n"
					+ "            \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_base_torch\" }\r\n"
					+ "        },\r\n"
					+ "	\r\n"
					+ "	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_left\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side_right\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\"}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_corner_clear\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "		\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\"} \r\n"
					+ "    },		\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\", \"y\": 180} \r\n"
					+ "    },	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\", \"y\": 90} \r\n"
					+ "    },	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_side\", \"y\": 270} \r\n"
					+ "    },	\r\n"
					+ "		\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\"}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "  	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle_end\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\"}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \"" + modid + ":block/bridge/rope/" + blockstateName + "_middle\"}\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}	\r\n"
					+ "");
			
			buffer.close();
			writer.close();
			file.createNewFile();
			System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
	{
		File bridge_base = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_base" + ".json");
		File bridge_base_torch = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_base_torch" + ".json");
		File bridge_corner = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner" + ".json");
		File bridge_corner_clear = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_corner_clear" + ".json");
		File bridge_inventory = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_inventory" + ".json");
		File bridge_middle = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle" + ".json");
		File bridge_middle_end = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_middle_end" + ".json");
		File bridge_side = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side" + ".json");
		File bridge_side_left = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_left" + ".json");
		File bridge_side_right = new File(location + "/models/block/bridge/rope/" + nameMaterial + "_side_right" + ".json");

		if(!bridge_base.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwbridges:block/bridge/rope/parent/base\",\r\n"
						+ "\"textures\":{\"2\":\"" + TextureLocationFormodid + "/" + nameMaterial + "_planks\",\r\n"
						+ "\"particle\":\"" + TextureLocationFormodid + "/" + nameMaterial + "_planks\"}}");
				
				buffer.close();
				writer.close();
				bridge_base.createNewFile();
				System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!bridge_base_torch.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base_torch);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwbridges:block/bridge/rope/parent/base_torch\",\r\n"
						+ "\"textures\":{\"1\": \"minecraft:block/torch\",\r\n"
						+ "\"3\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
						+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + "_planks\"}}");
				
				buffer.close();
				writer.close();
				bridge_base_torch.createNewFile();
				System.out.println("Le fichier " + bridge_base_torch + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		if(!bridge_corner.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_corner);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwbridges:block/bridge/rope/parent/corner\",\r\n"
						+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
						+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
						+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
						+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");
				
				buffer.close();
				writer.close();
				bridge_corner.createNewFile();
				System.out.println("Le fichier " + bridge_corner + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			if(!bridge_corner_clear.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_corner_clear);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rope/parent/corner_clear\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");
					
					buffer.close();
					writer.close();
					bridge_corner_clear.createNewFile();
					System.out.println("Le fichier " + bridge_corner_clear + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_inventory.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_inventory);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rope/parent/inventory\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"2\": \"" + TextureLocationFormodid + "/" + nameMaterial + "_planks\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");
					
					buffer.close();
					writer.close();
					bridge_inventory.createNewFile();
					System.out.println("Le fichier " + bridge_inventory + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_middle.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_middle);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\":\"mcwbridges:block/bridge/rope/parent/middle\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");
					
					buffer.close();
					writer.close();
					bridge_middle.createNewFile();
					System.out.println("Le fichier " + bridge_middle + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_middle_end.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_middle_end);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rope/parent/middle_end\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_middle_end.createNewFile();
					System.out.println("Le fichier " + bridge_middle_end + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rope/parent/side\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1_4\": \"mcwbridges:block/lead_knot\"}}");
					
					buffer.close();
					writer.close();
					bridge_side.createNewFile();
					System.out.println("Le fichier " + bridge_side + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rope/parent/side_left\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_left.createNewFile();
					System.out.println("Le fichier " + bridge_side_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_side_right.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_right);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rope/parent/side_right\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \"" + TextureLocationFormodid + "/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_right.createNewFile();
					System.out.println("Le fichier " + bridge_side_right + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
		public static void createModelItem(String location, String modid, String mat)
	{
		File file = new File(location + "/models/item/"  + "rope_" + mat + "_bridge" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \"" + modid + ":block/bridge/rope/" + mat + "_inventory\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	}
	
	public static class BridgeStone
	{
	
	public static void createBlockstate(String location, String modid, String blockstateName)
	{
		File file = new File(location + "/blockstates/" + blockstateName + "_bridge" + ".json");
	
		if(!file.exists())
		{
		try
		{
			FileWriter writer = new FileWriter(file);
			BufferedWriter buffer = new BufferedWriter(writer);
			
			buffer.write("{\r\n"
					+ "  \"multipart\": [\r\n"
					+ "        {   \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_base\" }},\r\n"
					+ "\r\n"
					+ "        {   \"when\": { \"torch\": \"true\" },\r\n"
					+ "            \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_base_torch\" }\r\n"
					+ "        },\r\n"
					+ "	\r\n"
					+ "	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_right\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_left\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_right\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_left\", \"y\": 0}\r\n"
					+ "    },\r\n"
					+ "\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"false\",\"south\": \"false\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_left\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"false\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_right\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"false\",\"east\": \"true\",\"south\": \"true\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_left\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"toggle\": \"true\",\"north\": \"true\",\"east\": \"true\",\"south\": \"false\",\"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side_right\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_corner\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_corner\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_corner\"}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_corner\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "		\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side\"} \r\n"
					+ "    },		\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side\", \"y\": 180} \r\n"
					+ "    },	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side\", \"y\": 90} \r\n"
					+ "    },	\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"toggle\": \"false\",\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_side\", \"y\": 270} \r\n"
					+ "    },	\r\n"
					+ "		\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle_end\", \"y\": 180}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle_end\"}\r\n"
					+ "    },\r\n"
					+ "    {\r\n"
					+ "      \"when\": { \"AND\": [  {\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle_end\", \"y\": 270}\r\n"
					+ "    },\r\n"
					+ "  	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle_end\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle\"}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle\", \"y\": 90}\r\n"
					+ "    },\r\n"
					+ "	{\r\n"
					+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
					+ "      \"apply\": { \"model\": \""+modid+":block/bridge/bridge_stone/" + blockstateName + "_middle\"}\r\n"
					+ "    }\r\n"
					+ "  ]\r\n"
					+ "}");
			
			buffer.close();
			writer.close();
			file.createNewFile();
			System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
	
	public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String textureWall, String textureFloor)
	{
		File bridge_base = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_base" + ".json");
		File bridge_base_torch = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_base_torch" + ".json");
		File bridge_corner = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_corner" + ".json");
		File bridge_inventory = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_inventory" + ".json");
		File bridge_middle = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_middle" + ".json");
		File bridge_middle_end = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_middle_end" + ".json");
		File bridge_side = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_side" + ".json");
		File bridge_side_left = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_side_left" + ".json");
		File bridge_side_right = new File(location + "/models/block/bridge/bridge_stone/" + nameMaterial + "_side_right" + ".json");

		if(!bridge_base.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/base\",\r\n"
						+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
						+ "\"2\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+textureFloor+"\"}}");
				
				buffer.close();
				writer.close();
				bridge_base.createNewFile();
				System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!bridge_base_torch.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base_torch);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/base_torch\",\r\n"
						+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
						+ "\"3\": \"minecraft:block/torch\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
				
				buffer.close();
				writer.close();
				bridge_base_torch.createNewFile();
				System.out.println("Le fichier " + bridge_base_torch + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		if(!bridge_corner.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_corner);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/corner\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
				
				buffer.close();
				writer.close();
				bridge_corner.createNewFile();
				System.out.println("Le fichier " + bridge_corner + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			if(!bridge_inventory.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_inventory);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/inventory\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
							+ "\"2_2\": \""+TextureLocationFormodid+"/"+textureFloor+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_inventory.createNewFile();
					System.out.println("Le fichier " + bridge_inventory + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_middle.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_middle);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/middle\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_middle.createNewFile();
					System.out.println("Le fichier " + bridge_middle + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_middle_end.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_middle_end);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/middle_end\",\r\n"
							+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_middle_end.createNewFile();
					System.out.println("Le fichier " + bridge_middle_end + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/side\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_side.createNewFile();
					System.out.println("Le fichier " + bridge_side + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/side_left\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_left.createNewFile();
					System.out.println("Le fichier " + bridge_side_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_side_right.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_right);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/bridge_stone/parent/side_right\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_right.createNewFile();
					System.out.println("Le fichier " + bridge_side_right + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static void createModelItem(String location, String modid, String mat)
	{
		File file = new File(location + "/models/item/" + mat + "_bridge" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\""+modid+":block/bridge/bridge_stone/"+mat+"_inventory\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	}
	
	public static class StairWood
	{
		public static void createBlockstate(String location, String modid, String woodMat)
		{
			File file = new File(location + "/blockstates/" + woodMat + "_log_bridge_stair" + ".json");
		
			if(!file.exists())
			{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_base\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_torch\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"true\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"true\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_double\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_right\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/wood/"+woodMat+"_left\", \"y\": 270}\r\n"
						+ "    }\r\n"
						+ "\r\n"
						+ "  ]\r\n"
						+ "}	");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File bridge_base = new File(location + "/models/block/stair/wood/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/wood/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/wood/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/wood/" + nameMaterial + "_right" + ".json");
			File bridge_torch = new File(location + "/models/block/stair/wood/" + nameMaterial + "_torch" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/base\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_double.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_double);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/double\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_double.createNewFile();
					System.out.println("Le fichier " + bridge_double + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/left\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_left.createNewFile();
					System.out.println("Le fichier " + bridge_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/right\",\r\n"
								+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\",\r\n"
								+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_right.createNewFile();
						System.out.println("Le fichier " + bridge_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_torch.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_torch);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/wood/parent/torch\",\r\n"
								+ "\"textures\":{\"3\": \"minecraft:block/torch\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\",\r\n"
								+ "\"1_1\": \""+TextureLocationFormodid+"/"+nameMaterial+ (isStemTexture ? "_stem" : "_log")+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_torch.createNewFile();
						System.out.println("Le fichier " + bridge_torch + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_log_bridge_stair" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\":\""+modid+":block/stair/wood/"+mat+"_double\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class StairRope
	{
		public static void createBlockstate(String location, String modid, String woodMat)
		{
			File file = new File(location + "/blockstates/" + woodMat + "_rope_bridge_stair" + ".json");
		
			if(!file.exists())
			{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_base\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_torch\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"true\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"true\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_double\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_right\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/rope/"+woodMat+"_left\", \"y\": 270}\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}	\r\n"
						+ "");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File bridge_base = new File(location + "/models/block/stair/wood/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/wood/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/wood/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/wood/" + nameMaterial + "_right" + ".json");
			File bridge_torch = new File(location + "/models/block/stair/wood/" + nameMaterial + "_torch" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/base\",\r\n"
							+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ " \"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_double.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_double);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/double\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_double.createNewFile();
					System.out.println("Le fichier " + bridge_double + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/left\",\r\n"
							+ "\"textures\":{\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
							+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
							+ "\"4\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_left.createNewFile();
					System.out.println("Le fichier " + bridge_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/right\",\r\n"
								+ "\"textures\": {\"0\": \"mcwbridges:block/lead_knot_vert\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/" + nameMaterial + "_planks\",\r\n"
								+ "\"3\": \"mcwbridges:block/lead_knot\",\r\n"
								+ "\"4\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
						
						buffer.close();
						writer.close();
						bridge_right.createNewFile();
						System.out.println("Le fichier " + bridge_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_torch.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_torch);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/rope/parent/torch\",\r\n"
								+ "\"textures\":{\"4\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
								+ "\"1_3\": \"minecraft:block/torch\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
						
						buffer.close();
						writer.close();
						bridge_torch.createNewFile();
						System.out.println("Le fichier " + bridge_torch + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_rope_bridge_stair" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/stair/rope/"+mat+"_double\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class StairStone
	{
		public static void createBlockstate(String location, String modid, String Stonemat)
		{
			File file = new File(location + "/blockstates/" + Stonemat + "_bridge_stair" + ".json");
		
			if(!file.exists())
			{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_base\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_base\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"north\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_base\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"east\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_base\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_torch\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_torch\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_torch\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"torch\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_torch\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_double\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"false\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_right\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east\",\"east\": \"true\",\"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_left\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_double\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"false\",\"north\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_right\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"south\",\"south\": \"true\",\"north\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_left\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_double\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"false\",\"east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_right\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"west\",\"west\": \"true\",\"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_left\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_double\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_right\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north\",\"north\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/stair/stone/" + Stonemat + "_left\", \"y\": 270}\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String textureWall, String textureFloor)
		{
			File bridge_base = new File(location + "/models/block/stair/stone/" + nameMaterial + "_base" + ".json");
			File bridge_double = new File(location + "/models/block/stair/stone/" + nameMaterial + "_double" + ".json");
			File bridge_left = new File(location + "/models/block/stair/stone/" + nameMaterial + "_left" + ".json");
			File bridge_right = new File(location + "/models/block/stair/stone/" + nameMaterial + "_right" + ".json");
			File bridge_torch = new File(location + "/models/block/stair/stone/" + nameMaterial + "_torch" + ".json");

			if(!bridge_base.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_base);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/base\",\r\n"
							+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_base.createNewFile();
					System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_double.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_double);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/double\",\r\n"
							+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_double.createNewFile();
					System.out.println("Le fichier " + bridge_double + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/left\",\r\n"
							+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_left.createNewFile();
					System.out.println("Le fichier " + bridge_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_right.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_right);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/right\",\r\n"
								+ "\"textures\":{\"1\": \""+TextureLocationFormodid+"/"+textureFloor+"\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_right.createNewFile();
						System.out.println("Le fichier " + bridge_right + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				
				if(!bridge_torch.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_torch);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/stair/stone/parent/torch\",\r\n"
								+ "\"textures\":{\"3\": \"minecraft:block/torch\",\r\n"
								+ "\"1_1\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
						
						buffer.close();
						writer.close();
						bridge_torch.createNewFile();
						System.out.println("Le fichier " + bridge_torch + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	
		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bridge_stair" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/stair/stone/"+mat+"_double\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class PierWood
	{
			public static void createBlockstate(String location, String modid, String woodMat)
			{
				File file = new File(location + "/blockstates/" + woodMat + "_bridge_pier" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"multipart\": [{ \"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_middle\", \"y\": 90}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_middle\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_single\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\"}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\", \"y\": 90}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\", \"y\": 180}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_corner\", \"y\": 270}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\", \"y\": 90}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\", \"y\": 180}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\", \"y\": 270}},{\r\n"
							+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
							+ "\"apply\": { \"model\": \""+modid+":block/support_pier/wooden/"+woodMat+"_pillar_side\"}}]}");
					
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
			public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
			File bridge_pillar_corner = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_corner" + ".json");
			File bridge_pillar_middle = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_middle" + ".json");
			File bridge_pillar_side = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_side" + ".json");
			File bridge_pillar_single = new File(location + "/models/block/support_pier/wooden/" + nameMaterial + "_pillar_single" + ".json");

			if(!bridge_pillar_corner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_corner);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_corner\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "_top\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_corner.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_corner + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_pillar_middle.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_middle);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_middle\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "_top\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_middle.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_middle + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_pillar_side.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_side);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_side\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "_top\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_side.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_side + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				if(!bridge_pillar_single.exists())
				{
					try
					{
						FileWriter writer = new FileWriter(bridge_pillar_single);
						BufferedWriter buffer = new BufferedWriter(writer);				
						
						buffer.write("{\"parent\": \"mcwbridges:block/support_pier/wooden/parent/pillar_single\",\r\n"
								+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
								+ "\"1\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "_top\",\r\n"
								+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
								+ "\"particle\": \""+TextureLocationFormodid+"/" + nameMaterial + (isStemTexture ? "_stem" : "_log") + "\"}}");
						
						buffer.close();
						writer.close();
						bridge_pillar_single.createNewFile();
						System.out.println("Le fichier " + bridge_pillar_single + " Vient d'être générer à l'emplacement : " + location);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}

			public static void createModelItem(String location, String modid, String mat)
			{
				File file = new File(location + "/models/item/" + mat + "_bridge_pier" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\"parent\": \""+modid+":block/support_pier/wooden/"+mat+"_pillar_single\"}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class PierStone
	{
		public static void createBlockstate(String location, String modid, String blockstateName)
	{
		File file = new File(location + "/blockstates/" + blockstateName + "_bridge_pier" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"multipart\":[{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_middle\", \"y\": 90}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_middle\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"true\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_single\"}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"false\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_side\", \"y\": 90}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_side\", \"y\": 180}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"false\",\"south\": \"true\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_side\", \"y\": 270}},{\r\n"
						+ "\"when\": { \"AND\": [  {\"north\": \"false\",\"east\": \"false\",\"west\": \"true\",\"south\": \"false\"} ]},\r\n"
						+ "\"apply\": { \"model\": \""+modid+":block/support_pier/stone/"+blockstateName+"_pillar_side\"}}]}");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, String textureWall)
		{
			File bridge_pillar_middle = new File(location + "/models/block/support_pier/stone/" + nameMaterial + "_pillar_middle" + ".json");
			File bridge_pillar_side = new File(location + "/models/block/support_pier/stone/" + nameMaterial + "_pillar_side" + ".json");
			File bridge_pillar_single = new File(location + "/models/block/support_pier/stone/" + nameMaterial + "_pillar_single" + ".json");
		
		if(!bridge_pillar_middle.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_pillar_middle);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/support_pier/stone/parent/pillar_middle\",\r\n"
						+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
				
				buffer.close();
				writer.close();
				bridge_pillar_middle.createNewFile();
				System.out.println("Le fichier " + bridge_pillar_middle + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		if(!bridge_pillar_side.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_pillar_side);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/support_pier/stone/parent/pillar_side\",\r\n"
						+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
				
				buffer.close();
				writer.close();
				bridge_pillar_side.createNewFile();
				System.out.println("Le fichier " + bridge_pillar_side + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			if(!bridge_pillar_single.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_pillar_single);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/support_pier/stone/parent/pillar_single\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+textureWall+"\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+textureWall+"\"}}");
					
					buffer.close();
					writer.close();
					bridge_pillar_single.createNewFile();
					System.out.println("Le fichier " + bridge_pillar_single + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_bridge_pier" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\""+modid+":block/support_pier/stone/"+mat+"_pillar_single\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	}
	
	public static class BridgeRailWood
	{
		public static void createBlockstate(String location, String modid, String blockstateName)
		{
			File file = new File(location + "/blockstates/" + blockstateName + "_rail_bridge" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"multipart\": [\r\n"
						+ "\r\n"
						+ "    {   \"when\": { \"OR\": [\r\n"
						+ "        { \"facing\": \"north|south\"}\r\n"
						+ "        ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_base\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{   \"when\": { \"OR\": [\r\n"
						+ "        { \"facing\": \"east|west\"}\r\n"
						+ "        ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_base\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"south\": \"true\",\"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_core\", \"y\": 0}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\", \"north_west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\", \"north_east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\", \"south_east\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\"}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\", \"south_west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\", \"north_west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\", \"north_east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\", \"south_east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\"}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\", \"south_west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_corner\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "		\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\"} \r\n"
						+ "    },		\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\", \"y\": 180} \r\n"
						+ "    },	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\", \"y\": 90} \r\n"
						+ "    },	\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_side\", \"y\": 270} \r\n"
						+ "    },	\r\n"
						+ "		\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 180}\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\"}\r\n"
						+ "    },\r\n"
						+ "    {\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 270}\r\n"
						+ "    },\r\n"
						+ "  	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\"}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"north|south\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\", \"y\": 90}\r\n"
						+ "    },\r\n"
						+ "	{\r\n"
						+ "      \"when\": { \"AND\": [  {\"facing\": \"east|west\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
						+ "      \"apply\": { \"model\": \""+modid+":block/bridge/rail/"+blockstateName+"_middle\"}\r\n"
						+ "    }\r\n"
						+ "  ]\r\n"
						+ "}	\r\n"
						+ "");
				
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
		File bridge_base = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_base" + ".json");
		File bridge_base_torch = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_core" + ".json");
		File bridge_corner = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_corner" + ".json");
		File bridge_inventory = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_inventory" + ".json");
		File bridge_middle = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_middle" + ".json");
		File bridge_side = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_side" + ".json");
		File bridge_side_left = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_side_left" + ".json");
		File bridge_side_right = new File(location + "/models/block/bridge/rail/" + nameMaterial + "_side_right" + ".json");

		if(!bridge_base.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwbridges:block/bridge/rail/parent/base\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
				
				buffer.close();
				writer.close();
				bridge_base.createNewFile();
				System.out.println("Le fichier " + bridge_base + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!bridge_base_torch.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_base_torch);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/core\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
				
				buffer.close();
				writer.close();
				bridge_base_torch.createNewFile();
				System.out.println("Le fichier " + bridge_base_torch + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		if(!bridge_corner.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(bridge_corner);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/corner\",\r\n"
						+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
						+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
						+ "\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"_top\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
				
				buffer.close();
				writer.close();
				bridge_corner.createNewFile();
				System.out.println("Le fichier " + bridge_corner + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			if(!bridge_inventory.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_inventory);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/inventory\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"_top\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
					
					buffer.close();
					writer.close();
					bridge_inventory.createNewFile();
					System.out.println("Le fichier " + bridge_inventory + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_middle.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_middle);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/middle\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"_top\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
					
					buffer.close();
					writer.close();
					bridge_middle.createNewFile();
					System.out.println("Le fichier " + bridge_middle + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\": \"mcwbridges:block/bridge/rail/parent/side\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"2\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"3\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"_top\",\r\n"
							+ "\"particle\": \""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
					
					buffer.close();
					writer.close();
					bridge_side.createNewFile();
					System.out.println("Le fichier " + bridge_side + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!bridge_side_left.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_left);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/side_left\",\r\n"
							+ "\"textures\":{\"0\":\""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"2\":\""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"3\":\""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"_top\",\r\n"
							+ "\"particle\":\""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_left.createNewFile();
					System.out.println("Le fichier " + bridge_side_left + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!bridge_side_right.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(bridge_side_right);
					BufferedWriter buffer = new BufferedWriter(writer);				
					
					buffer.write("{\"parent\":\"mcwbridges:block/bridge/rail/parent/side_right\",\r\n"
							+ "\"textures\":{\"0\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"\",\r\n"
							+ "\"2\":\""+TextureLocationFormodid+"/"+nameMaterial+"_planks\",\r\n"
							+ "\"3\":\""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log")+"_top\",\r\n"
							+ "\"particle\":\""+TextureLocationFormodid+"/"+nameMaterial+"_planks\"}}");
					
					buffer.close();
					writer.close();
					bridge_side_right.createNewFile();
					System.out.println("Le fichier " + bridge_side_right + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
		{
			File file = new File(location + "/models/item/" + mat + "_rail_bridge" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\":\""+modid+":block/bridge/rail/"+mat+"_inventory\"}");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	}
	
}