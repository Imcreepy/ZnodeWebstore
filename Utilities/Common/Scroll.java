package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import driver.DriverManager;

public class Scroll {

	public static void scrollToElement(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver().webDriver;
	
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
