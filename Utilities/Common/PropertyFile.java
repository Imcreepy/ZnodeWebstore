package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {

	public static Properties loadPropertyFile(String fileName)
	{
		File file = new File(System.getProperty("user.dir") + "//Configs//" + fileName);
		
		FileInputStream fileInput = null;
		
		try 
		{
			fileInput = new FileInputStream(file);
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		//load properties file
		try 
		{
			prop.load(fileInput);
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return prop;
	}
}
