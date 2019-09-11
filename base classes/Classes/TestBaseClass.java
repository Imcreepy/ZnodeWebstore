package Classes;

import java.util.Map;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import common.Click;
import common.DataFile;
import common.PropertyFile;
import common.Scroll;
import common.SendKeys;
import common.VerifyElementStatus;
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
	
	protected Map<String, String> mapDataFile(String filePath, String sheetName)
	{
		return file.mapDataFile(filePath, sheetName);
	}

//	protected String getValueOf(String key)
//	{
//		return file.getValueOf(key);
//	}
	
	protected void setText(WebElement element, String inputText)
	{
//		scrollToElement(element);
		
//		element.clear();
		
		SendKeys.setText(element, inputText);
//		element.sendKeys(inputText);
	}
	
	protected void clickAndWait(WebElement element)
	{
		Click.clickAndWait(element);
	}
	
	protected void pressTabKey(WebElement element)
	{
		SendKeys.pressTab(element);
	}

	protected void scrollToElement(WebElement element)
	{
		Scroll.scrollToElement(element);
	}
	
	protected void waitForElementToBeVisible(WebElement element)
	{
		VerifyElementStatus.isElementVisible(element);
	}
	
	protected void waitForElementToBeInvisible(WebElement element)
	{
		VerifyElementStatus.isElementNotVisible(element);
	}
	
	
//	protected <T> Logger configureLogger(Class<T> className)
//	{
//		Logger logger = Logger.getLogger(className);
//		
//		return logger;
//	}
} // End of class

