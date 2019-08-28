package driver;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import common.BrowserFunctionality;
import common.PropertyFile;
import driver.DriverClass;
import driver.DriverFactory;
import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass {

	public RemoteWebDriver webDriver; 
	private final static String webstoreQAUrl = getProperty("config.properties", "webstoreQAUrl");
	private final static String webstoreautomationUrl = getProperty("config.properties", "webstoreautomationUrl");

	private static String getProperty(String propFileName, String getProperty)
	{
		String dataFilePath;
		
		Properties prop = PropertyFile.loadPropertyFile(propFileName);
		
		dataFilePath = prop.getProperty(getProperty);
		
		return dataFilePath;
	}
	
	// Method that will execute before all the execution to setup all the drivers
	@BeforeSuite
	public void driverSetup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
	}
	
	// Method that will execute before any of the test execution and invoke the browser
	@BeforeTest
	@Parameters( {"Browser","Environment"})
	public void openBrowser(String browser, String environment)
	{
		switch(browser.toLowerCase())
		{
			case "chrome":
				webDriver = new ChromeDriver();
				break;
			case "firefox":
				webDriver = new FirefoxDriver();
				break;
			case "ie":
				webDriver = new InternetExplorerDriver();
				break;
			default:
				System.out.println("Unable to match the condition for the Browser");
		}// End of switch: Browser
		
		switch(environment.toLowerCase())
		{
			case "automation":
				webDriver.get(webstoreautomationUrl);
				break;
			case "qa":
				webDriver.get(webstoreQAUrl);
				break;
			default:
				System.out.println("Unable to match the condition for the Environment");
		}// End of switch: environment
		
		System.out.println(webDriver);
		DriverClass driver = DriverFactory.createInstance();
		driver.webDriver = webDriver;
        DriverManager.setDriver(driver);
		// maximizing the Browser
		BrowserFunctionality.maximizeBrowser();
		
	}// End of openBrowser Method
}// End of Driver Class
