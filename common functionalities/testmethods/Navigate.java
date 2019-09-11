package testmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.Click;
import common.VerifyElementStatus;

public class Navigate extends Click{

	@FindBy(xpath = "//i[@data-test-selector='linkCart']")
	private WebElement linkCart;
	
	@FindBy(xpath = "//a[@data-test-selector='linkZfHome']")
	private WebElement linkHome;
	
	@FindBy(xpath = "//a[@data-test-selector='linkCheckout']")
	private WebElement linkCheckout;
	
	public void navigateToShoppingCart()
	{
		VerifyElementStatus.isElementVisible(linkCart);
		
		VerifyElementStatus.isElementClickable(linkCart);
		
		clickAndWait(linkCart);
	}
	
	public void navigateToHomePage()
	{
		VerifyElementStatus.isElementClickable(linkHome);
		
		clickAndWait(linkHome);
	}
	
	public void navigateToCheckoutPage()
	{
		VerifyElementStatus.isElementClickable(linkCheckout);
		
		clickAndWait(linkCheckout);
	}
}
