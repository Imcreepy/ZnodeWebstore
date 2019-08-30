package common;

import driver.DriverManager;

public class BrowserFunctionality {

	public static void maximizeBrowser()
	{
		 DriverManager.getDriver().webDriver.manage().window().maximize();
		
	}// End of maximizeBrowser
	
}
