package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void selectOptionByName(WebElement element, String option)
	{
		Select select = new Select(element);
		
		select.selectByVisibleText(option);
	}
	
	public static void selectOptionByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		
		select.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		
		select.selectByValue(value);
	}
}
