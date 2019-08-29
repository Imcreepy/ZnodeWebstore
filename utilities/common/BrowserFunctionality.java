package common;

import org.testng.annotations.AfterSuite;

import driver.DriverManager;


public class BrowserFunctionality {

	public static void maximizeBrowser()
	{
		 DriverManager.getDriver().webDriver.manage().window().maximize();
		
	}// End of maximizeBrowser
	

	@AfterSuite
	//Test cleanup
	public void TeardownTest()
	{
		DriverManager.getDriver().webDriver.quit();
	}
	
}
