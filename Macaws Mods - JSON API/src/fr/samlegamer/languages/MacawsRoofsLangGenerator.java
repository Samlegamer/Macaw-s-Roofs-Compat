package fr.samlegamer.languages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MacawsRoofsLangGenerator
{
	public static void init(String location)
	{
		File folderLang = new File(location + "lang/");

		if(!folderLang.exists())
		{
			folderLang.mkdir();
		}		
	}
	
	public static void Log_Roof(String location, String CompatModid, String MatName, String MatNameMaj, int tours)
	{
		File file = new File(location + "/lang/" + "EnglishLangLogRoof.json");

		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
					
				for(int i = 0; i <= tours; i++)
				{
					buffer.write("\"block."+CompatModid+"."+MatName+"_roof\":\""+MatNameMaj+" Roof\",");
					buffer.newLine();
				}
				
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