package Common;

import Driver.DriverManager;

public class BrowserCapability {

	public static void maximize() 
	{
		DriverManager.getDriver().webDriver.manage().window().maximize();
	}
	
}
