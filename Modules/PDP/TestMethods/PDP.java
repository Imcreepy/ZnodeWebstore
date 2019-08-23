package PDP.TestMethods;

import Classes.PDPBaseClass;
import Common.Click;
import Common.VerifyElementStatus;


public class PDP extends PDPBaseClass 
{
	public void addToCart(int quantity)
	{
		VerifyElementStatus.isElementPresent("xpath", "//button[@data-test-selector='btnAddToCart']");
		
		txtQuantity.clear();
		
		String quantityInCart = Integer.toString(quantity);
		
		txtQuantity.sendKeys(quantityInCart);
		
		VerifyElementStatus.isElementClickable(btnAddToCart);
		
		Click.clickAndWait(btnAddToCart);
	}
}
