package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import driver.DriverManager;

public class SendKeys
{
	public static void setText(WebElement element, String inputText)
	{
		String js = "arguments[0].setAttribute('value','"+inputText+"')";
		
		((JavascriptExecutor) DriverManager.getDriver().webDriver).executeScript(js, element);
		
//		element.sendKeys(inputText);
	}
	
	public static void setText(WebElement element, int inputText)
	{
		String js = "arguments[0].setAttribute('value','"+Integer.toString(inputText)+"')";
		
		((JavascriptExecutor) DriverManager.getDriver().webDriver).executeScript(js, element);
	}
	
	
	public static void pressTab(WebElement element)
	{
		element.sendKeys(Keys.TAB);
	}
}
