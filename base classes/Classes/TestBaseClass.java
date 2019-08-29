package Classes;

import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import common.Click;
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

	protected Map<String,String> loadPropertyFile(String propFileName)
	{
		PropertyFile file = new PropertyFile();
		
		return file.loadPropertyFile(propFileName);
	}
	
	DataFile file = new DataFile();
	
	protected Map<String, String> setDataFile(String filePath, String sheetName)
	{
		return file.dataFile(filePath, sheetName);
	}

//	protected String getData(String key)
//	{
//		return file.getData(key);
//	}
	
	protected void setText(WebElement element, String inputText)
	{
		scrollToElement(element);
		
		SendKeys.setText(element, inputText);
	}
	
	
	
	protected void clickAndWait(WebElement element)
	{
		Click click = new Click();
		
		click.clickAndWait(element);
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

