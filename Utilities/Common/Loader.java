package common;

import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;

import driver.DriverManager;

public class Loader {

//	@FindBy(xpath = "//*[@id='loader-content-backdrop']")
//	private static WebElement backgroundLoader;
	
	static int waitTime = 100;
	
	static JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver().webDriver;
	
	public static void waitForPageLoad()
	{
		try 
		{
			for(int loadTime = 0; loadTime < 100; loadTime++) 
			{
				long loader = (long) js.executeScript("return $('#loader-content-backdrop').length");
				
				String singleLoader = (String) js.executeScript("return $('#Single-loader-content-backdrop').attr('style')");
				
				if(loader == 0 && singleLoader.equalsIgnoreCase("display: none;")) 
				{
					break;
				}
				
				else
				{
//					MyWait.waitFor(waitTime, "mili");
					Thread.sleep(waitTime);
				}
			}
		}
	
		catch(NullPointerException ex)
		{
			ex.getStackTrace();
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getStackTrace();
		}
		
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
	}
}
