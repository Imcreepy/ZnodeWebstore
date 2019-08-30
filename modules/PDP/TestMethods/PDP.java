package PDP.TestMethods;

import Classes.PDPBaseClass;
import common.GlobalVariables;
import common.VerifyElementStatus;

public class PDP extends PDPBaseClass 
{
	public void addToCart(String quantity)
	{
		VerifyElementStatus.isElementPresent(GlobalVariables.FindByXpath, "//button[@data-test-selector='btnAddToCart']");
		
		txtQuantity.clear();
		
		txtQuantity.sendKeys(quantity);
		
		VerifyElementStatus.isElementClickable(btnAddToCart);
		
		clickAndWait(btnAddToCart);
	}
}
