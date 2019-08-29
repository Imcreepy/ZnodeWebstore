package common;

import driver.DriverManager;

public class BrowserCapability {

	public static void maximize() 
	{
		DriverManager.getDriver().webDriver.manage().window().maximize();
	}
	
}
