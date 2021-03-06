package common;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import driver.DriverManager;

public class Click {

	
	// To click on respective element and wait until page loads using WebElement
	public static void clickAndWait(WebElement element)
	{
		element.click();
		 
		Loader.waitForPageLoad();
	}
	
	// To click on respective element and wait until page loads using Locator
	public static void clickAndWait(String locator)
	{
		try
		{
			WebElement element = DriverManager.getDriver().webDriver.findElement(By.xpath(locator));
			
			element.click();
			
			Loader.waitForPageLoad();
		}
		
		catch(ElementClickInterceptedException ex)
		{
			ex.printStackTrace();
		}
		
		catch(ElementNotInteractableException ex)
		{
			ex.printStackTrace();
		}
	}
}
