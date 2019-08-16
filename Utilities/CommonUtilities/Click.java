package CommonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Click {

	static Loader loader = new Loader();
	
	// To click on respective element and wait until page loads using WebElement
	public static void clickAndWait(WebElement element)
	{
		element.click();
		
		loader.waitForPageLoad();
	}
	
	// To click on respective element and wait until page loads using Locator
	public static void clickAndWait(String locator)
	{
		WebElement element = Browser.webDriver.findElement(By.xpath(locator));
		
		element.click();
		
		loader.waitForPageLoad();
	}
}
