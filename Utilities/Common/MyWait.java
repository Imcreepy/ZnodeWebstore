package common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverManager;

public class MyWait {
	
	static WebDriverWait wait;
	private final static int defaultWaitTime = 10;
	private final static int miniWaitTime = 5; 
	private final static int shortWaitTime = 10;
	private final static int MediumWaitTime = 15;
	private final static int longWaitTime = 20;
	private final static int veryLongWaitTime = 30;


	public static WebDriverWait getDriverWait(int time)
	{
		int waittime = defaultWaitTime;
		
		if(time != 0 )
			waittime = time;
		
		if(wait == null)
			wait = new WebDriverWait(DriverManager.getDriver().webDriver, waittime);
		return wait;	
	}
	
	// Overloaded method , this one is just to get the Driver wait object and provide until as per need
	public static WebDriverWait getDriverWait()
	{
		int waittime = defaultWaitTime;
		if(wait == null)
			wait = new WebDriverWait(DriverManager.getDriver().webDriver, waittime);
		return wait;	
	}
	
	//Implicit wait for the driver accepts time and unit as parameters
	public static void waitFor(double waitTime, String unit)
	{
		int waittime = (int) waitTime;
		switch(unit.toLowerCase())
		{
			case "sec":
				DriverManager.getDriver().webDriver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
				break;
			case "mili":
				DriverManager.getDriver().webDriver.manage().timeouts().implicitlyWait(waittime, TimeUnit.MILLISECONDS);
				break;
			case "micro":
				DriverManager.getDriver().webDriver.manage().timeouts().implicitlyWait(waittime, TimeUnit.MICROSECONDS);
				break;
			default:
				DriverManager.getDriver().webDriver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
		}// End of switch
	}// End of Implicit wait method

	//Method that will except the wait time and string condition and checks for the element
	public static void waitTill(String waitType, String condition, WebElement element)
	{
		WebDriverWait wait;
		switch(waitType.toLowerCase())
		{
			case "mini":
				wait =  getDriverWait(miniWaitTime);
				break;
			case "medium":
				wait =  getDriverWait(MediumWaitTime);
				break;
			case "long":
				wait =  getDriverWait(longWaitTime);
				break;
			case "short":
				wait =  getDriverWait(shortWaitTime);
				break;
			case "verylong":
				wait =  getDriverWait(veryLongWaitTime);
				break;
			default:
				wait =  getDriverWait(shortWaitTime);
		}// End of switch case for selecting the wait

		
		switch(condition.toLowerCase())
		{
			case "isvisible":
				wait.until(ExpectedConditions.visibilityOf(element));
				break;
			case "isnotvisible":
				wait.until(ExpectedConditions.invisibilityOf(element));
				break;
			case "isclickable":
				wait.until(ExpectedConditions.elementToBeClickable(element));
				break;
			default:
				wait.until(ExpectedConditions.visibilityOf(element));
		}
	}// End of waitTill method
}
