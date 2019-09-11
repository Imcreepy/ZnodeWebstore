package HomePage.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Classes.HomePageBaseClass;

public class HomePage extends HomePageBaseClass
{
	@FindBy(xpath = "//img[@data-test-selector='imgProductImage']")
	private WebElement imgProduct;
	
	public void ClickOnProductImage()
	{
		waitForElementToBeVisible(imgProduct);
		
		clickAndWait(imgProduct);
	}
}
