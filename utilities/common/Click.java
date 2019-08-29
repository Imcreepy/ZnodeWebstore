package common;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import driver.DriverManager;

public class Click {

	Loader loader = new Loader();
	
	// To click on respective element and wait until page loads using WebElement
	public void clickAndWait(WebElement element)
	{
		element.click();
		
		 MyWait.waitFor(1, "sec");
		 
		loader.waitForPageLoad();
	}
	
	// To click on respective element and wait until page loads using Locator
	public void clickAndWait(String locator)
	{
		try
		{
			WebElement element = DriverManager.getDriver().webDriver.findElement(By.xpath(locator));
			
			element.click();
			
			loader.waitForPageLoad();
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
