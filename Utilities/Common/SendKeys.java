package Common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Driver.DriverManager;

public class SendKeys
{
	public static void setText(WebElement element, String inputText)
	{
		String js = "arguments[0].setAttribute('value','"+inputText+"')";
		
		((JavascriptExecutor) DriverManager.getDriver().webDriver).executeScript(js, element);
	}
	
	public static void pressTab(WebElement element)
	{
		element.sendKeys(Keys.TAB);
	}
}