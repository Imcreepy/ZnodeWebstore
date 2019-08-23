package Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Driver.DriverClass;
import Driver.DriverFactory;
import Driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass {

	public  RemoteWebDriver webDriver; 
	private final static String dev = "http://admin.qa.znode.amla.io:801/";
	private final static String qa = "http://admin.qa.znode.amla.io:801/";
	private final static String stage = "http://admin.qa.znode.amla.io:801/";

	
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
			case "stage":
				webDriver.get(stage);
				break;
			case "dev":
				webDriver.get(dev);
				break;
			case "qa":
				webDriver.get(qa);
				break;
			default:
				System.out.println("Unable to match the condition for the Environment");
		}// End of switch: environment
		
		System.out.println(webDriver);
		DriverClass driver = DriverFactory.createInstance();
		driver.webDriver = webDriver;
        DriverManager.setDriver(driver);
		// maximizing the Browser
//		BrowserCapabilities.maximize();
		
	}// End of openBrowser Method
}// End of Driver Class
