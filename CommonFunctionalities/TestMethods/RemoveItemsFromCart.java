package TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtilities.Click;
import CommonUtilities.VerifyElementStatus;

public class RemoveItemsFromCart {

	final String xpathOfRemoveAllCartItems  = "//a[@data-test-selector='linkRemoveAllCartItem']";
	
	@FindBy(xpath = "//span[@data-test-selector='linkCartCount']")
	private WebElement cartCount;
	
	@FindBy(xpath = xpathOfRemoveAllCartItems)
	private WebElement linkRemoveAllCartItem;
	
	public void removeAllItemsFromCart()
	{
		VerifyElementStatus.isElementVisible(cartCount);
		
		int count = Integer.parseInt(cartCount.getText());
		
		if(count != 0)
		{
			Click.clickAndWait(cartCount);
			
			VerifyElementStatus.isElementPresent("xpath", xpathOfRemoveAllCartItems);
			
			VerifyElementStatus.isElementClickable(linkRemoveAllCartItem);
			
			Click.clickAndWait(linkRemoveAllCartItem);
		}
	}
}
