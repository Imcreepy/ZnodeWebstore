package Classes;

import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import common.DataFile;
import common.PropertyFile;
import common.Scroll;
import common.SendKeys;
import driver.DriverManager;


public class TestBaseClass 
{
	public RemoteWebDriver driver;
	
	@BeforeClass
	protected void initiatedDriver()
	{
		 driver = DriverManager.getDriver().webDriver;
	}

	protected String getProperty(String propFileName, String getProperty)
	{
		Properties prop = PropertyFile.loadPropertyFile(propFileName);
		
		return prop.getProperty(getProperty);
	}
	
	DataFile file = new DataFile();
	
	protected void setDataFile(String filePath, String sheetName)
	{
		file.dataFile(filePath, sheetName);
	}

	protected String getData(String rowName, String columnName)
	{
		return file.getData(rowName, columnName);
	}
	
	protected void setText(WebElement element, String inputText)
	{
		scrollToElement(element);
		
		SendKeys.setText(element, inputText);
	}
	
	protected void pressTabKey(WebElement element)
	{
		SendKeys.pressTab(element);
	}

	protected void scrollToElement(WebElement element)
	{
		Scroll.scrollToElement(element);
	}
} // End of class

