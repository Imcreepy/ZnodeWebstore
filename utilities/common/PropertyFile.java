package common;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertyFile {

	public Map<String,String> loadPropertyFile(String fileName)
	{
		Properties prop = new Properties();
		
        Map<String,String>map = new HashMap<String,String>();
        
        try
        {
            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "//Configs//" + fileName);
            prop.load(inputStream);
        }
        
        catch (Exception e) 
        {
            e.printStackTrace();
            System.out.println("Some issue finding or loading file....!!! " + e.getMessage());
        }
        
        for (final Entry<Object, Object> entry : prop.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        
        return map;
        
//		File file = new File(System.getProperty("user.dir") + "//Configs//" + fileName);
//		
//		FileInputStream fileInput = null;
//		
//		try 
//		{
//			fileInput = new FileInputStream(file);
//		} 
//		
//		catch (FileNotFoundException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Properties prop = new Properties();
//		
//		//load properties file
//		try 
//		{
//			prop.load(fileInput);
//		} 
//		
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
//		
//		return prop;
	}
}
