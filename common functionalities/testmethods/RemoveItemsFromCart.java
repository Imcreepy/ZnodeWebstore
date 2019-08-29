package testmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Classes.TestBaseClass;
import common.Click;
import common.GlobalVariables;
import common.VerifyElementStatus;

public class RemoveItemsFromCart extends Click{

	final String xpathOfRemoveAllCartItems  = "//a[@data-test-selector='linkRemoveAllCartItem']";
	
	@FindBy(xpath = "//span[@data-test-selector='linkCartCount']")
	private WebElement cartCount;
	
	@FindBy(xpath = xpathOfRemoveAllCartItems)
	private WebElement linkRemoveAllCartItem;
	
	public void removeAllItemsFromCart()
	{
		try
		{
			VerifyElementStatus.isElementVisible(cartCount);
			
			int count = Integer.parseInt(cartCount.getText());
			
			if(count != 0)
			{
				clickAndWait(cartCount);
				
				VerifyElementStatus.isElementPresent(GlobalVariables.FindByXpath, xpathOfRemoveAllCartItems);
				
				VerifyElementStatus.isElementClickable(linkRemoveAllCartItem);
				
				clickAndWait(linkRemoveAllCartItem);
			}
		}
		
		catch(NumberFormatException ex)
		{
			ex.printStackTrace();
		}
	}
}
