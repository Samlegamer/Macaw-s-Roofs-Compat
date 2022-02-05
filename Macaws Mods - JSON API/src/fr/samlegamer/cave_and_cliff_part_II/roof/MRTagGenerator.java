package fr.samlegamer.cave_and_cliff_part_II.roof;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MRTagGenerator
{
	public static void AxeDataGen(String LOCATION, String Modid, ArrayList<String> Mat)
	{		
		File file = new File(LOCATION + "MineableAxeData.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				buffer.write("{\r\n"
						+ "  \"replace\": false,\r\n"
						+ "  \"values\": [");
				buffer.newLine();
				
				for(String i : Mat)
				{
					buffer.write("    \""+Modid+":"+i+"_cube_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_attic_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_top_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_steep_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_upper_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_upper_steep_roof\",\r\n"+ "");
					buffer.newLine();

					buffer.write("    \""+Modid+":"+i+"_planks_cube_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_attic_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_top_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_steep_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_upper_lower_roof\",\r\n"+ "");
					buffer.newLine();
					buffer.write("    \""+Modid+":"+i+"_planks_upper_steep_roof\",\r\n"+ "");
					buffer.newLine();
				}
				
				buffer.write("  ]\r\n" + "}");
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}
}