package CommonUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptionSelection {

	Select selectOption;
	
	public void selectOptionByName(WebElement element, String option)
	{
		selectOption = new Select(element);
		
		selectOption.selectByVisibleText(option);
	}
	
	public void selectOptionByIndex(WebElement element, int index)
	{
		selectOption = new Select(element);
		
		selectOption.selectByIndex(index);
	}
	
	public void selectOptionByValue(WebElement element, String value)
	{
		selectOption = new Select(element);
		
		selectOption.selectByValue(value);
	}
}
