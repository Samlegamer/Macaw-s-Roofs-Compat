package fr.samlegamer.mods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MacawsFences
{
	public static void InitFolders(String location)
	{
		
	}
	
	public static class HighleyGate
	{
		public static void createBlockstate(String location, String modid, String material)
		{
			File file = new File(location + "/blockstates/" + material + "_highley_gate" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"variants\": {\r\n"
						+ "    \"facing=east,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=east,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=east,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=east,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 270,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=north,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 180,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=south,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=false,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=false,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=true,open=false\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate\"\r\n"
						+ "    },\r\n"
						+ "    \"facing=west,in_wall=true,open=true\": {\r\n"
						+ "      \"uvlock\": false,\r\n"
						+ "      \"y\": 90,\r\n"
						+ "      \"model\": \""+modid+":block/highley_gate/"+material+"_highley_gate_open\"\r\n"
						+ "    }\r\n"
						+ "  }\r\n"
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

		public static void createModelBlock(String location, String TextureLocationFormodid, String nameMaterial, boolean isStemTexture)
		{
		File p1 = new File(location + "/models/block/highley_gate/" + nameMaterial + "_highley_gate" + ".json");
		File p2 = new File(location + "/models/block/highley_gate/" + nameMaterial + "_highley_gate_open" + ".json");

		if(!p1.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p1);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/highley_gate\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
				
				buffer.close();
				writer.close();
				p1.createNewFile();
				System.out.println("Le fichier " + p1 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(!p2.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(p2);
				BufferedWriter buffer = new BufferedWriter(writer);				
				
				buffer.write("{\"parent\": \"mcwfences:block/parent/highley_gate_open\",\r\n"
						+ "\"textures\":{\"2\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"particle\": \""+TextureLocationFormodid+"/"+ nameMaterial +"_planks\",\r\n"
						+ "\"texture\": \""+TextureLocationFormodid+"/"+ nameMaterial + (isStemTexture ? "_stem" : "_log") +"\"}}");
				
				buffer.close();
				writer.close();
				p2.createNewFile();
				System.out.println("Le fichier " + p2 + " Vient d'être générer à l'emplacement : " + location);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

		public static void createModelItem(String location, String modid, String mat)
	{
		File file = new File(location + "/models/item/" + mat + "_highley_gate" + ".json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\"parent\": \""+modid+":block/inventory/"+mat+"_highley_gate\"}");
				
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