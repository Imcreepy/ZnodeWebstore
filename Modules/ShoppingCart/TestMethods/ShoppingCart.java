package ShoppingCart.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;
import common.GlobalVariables;
import common.VerifyElementStatus;

public class ShoppingCart extends TestBaseClass
{

	final String xpathOfRemoveAllCartItems  = "//a[@data-test-selector='linkRemoveAllCartItem']";
	
	@FindBy(xpath = "//span[@data-test-selector='linkCartCount']")
	@CacheLookup
	private WebElement cartCount;
	
	@FindBy(xpath = xpathOfRemoveAllCartItems)
	@CacheLookup
	private WebElement linkRemoveAllCartItem;
	
	@FindBy(xpath = "//a[@data-test-selector='linkCheckout']")
	@CacheLookup
	private WebElement linkCheckout;
	
	public void removeAllItemsFromCart()
	{
		try
		{
			waitForElementToBeVisible(cartCount);
			
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
	
	public void clickOnCheckoutButton()
	{
		clickAndWait(linkCheckout);
	}
}
