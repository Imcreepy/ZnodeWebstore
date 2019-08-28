package PDP.TestMethods;

import Classes.PDPBaseClass;
import common.Click;
import common.VerifyElementStatus;


public class PDP extends PDPBaseClass 
{
	public void addToCart(String quantity)
	{
		VerifyElementStatus.isElementPresent("xpath", "//button[@data-test-selector='btnAddToCart']");
		
		txtQuantity.clear();
		
		txtQuantity.sendKeys(quantity);
		
		VerifyElementStatus.isElementClickable(btnAddToCart);
		
		Click.clickAndWait(btnAddToCart);
	}
}
