package HomePage.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Classes.HomePageBaseClass;
import Classes.TestBaseClass;

public class HomePage extends TestBaseClass
{
	@FindBy(xpath = "//img[@data-test-selector='imgProductImage']")
	private WebElement imgProduct;
	
	public void ClickOnProductImage()
	{
		waitForElementToBeVisible(imgProduct);
		
		clickAndWait(imgProduct);
	}
}
