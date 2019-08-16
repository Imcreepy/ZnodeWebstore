package PDP.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtilities.Click;
import CommonUtilities.VerifyElementStatus;


public class PDP {

	@FindBy(xpath = "//button[@data-test-selector='btnAddToCart']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath = "//input[@data-test-selector='txtQuantity']")
	private WebElement txtQuantity;
	
	public void addToCart(int quantity)
	{
		VerifyElementStatus.isElementPresent("xpath", "//button[@data-test-selector='btnAddToCart']");
		
		txtQuantity.clear();
		
		txtQuantity.sendKeys(Integer.toString(quantity));
		
		VerifyElementStatus.isElementClickable(btnAddToCart);
		
		Click.clickAndWait(btnAddToCart);
	}
}
