package Classes;

import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import Common.BrowserCapability;
import Common.DataFile;
import Common.PropertyFile;
import Common.SendKeys;
import Driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	
	String dataFilePath;
	
	protected String getProperty(String propFileName, String getProperty)
	{
		Properties prop = PropertyFile.loadPropertyFile(propFileName);
		
		dataFilePath = prop.getProperty(getProperty);
		
		return dataFilePath;
	}
	
	protected void setDataFile(String filePath, String sheetName)
	{
		DataFile.dataFile(filePath, sheetName);
	}

	protected String getData(String rowName, String columnName)
	{
		String text =  DataFile.getData(rowName, columnName);
		
		return text;
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
	
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver().webDriver;
	
	protected void scrollToElement(WebElement element)
	{
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
} // End of class

