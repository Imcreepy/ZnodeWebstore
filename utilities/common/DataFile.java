package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFile {

	Sheet sheet;
	int lastRow;
	private Workbook workbook;
	int colNum = 0;
	
	Map<String, String> dataMap;
	
	public Map<String, String> dataFile(String filePath, String sheetName)
	{
		dataMap = new HashMap<String, String>();
		
		String pathTillProject = System.getProperty("user.dir");
		
		FileInputStream fis;
		
		try {
				File file = new File(pathTillProject + filePath);
			
				fis = new FileInputStream(file);
				
				if (file.getName().endsWith(".xls"))
				{
				//If it is xlsx file then create object of XSSFWorkbook class
					workbook = new HSSFWorkbook(fis);
				}
				
				else if (file.getName().endsWith(".xlsx"))
				{
					workbook = new XSSFWorkbook(fis);
				}
					
				sheet = workbook.getSheet(sheetName);
					
				lastRow = sheet.getLastRowNum();
				
			   //Looping over entire row
				for(int i=1; i <= lastRow; i++)
				{

				Row row = sheet.getRow(i);
				String celldata = row.getCell(0).getStringCellValue();

				if(celldata == null || "".equals(celldata))
				{
					continue;
				}
				else
				{
					dataMap.put(row.getCell(0).toString(), row.getCell(1).toString());
//					dataMap.put(row.getCell(0).toString(),row.getCell(1).toString());
					
				} 
			}	
		}
	
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Returning excelFileMap
		return dataMap;
		
	}

	
//	public String getData(String key)
//	{
//		try 
//		{
//			 return dataMap.get(key);
//		} 
//		
//	
//		catch (NullPointerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return "";
//		}
//		
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return "";
//		}
		
//		finally
//		{
//			try {
//				workbook.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}



