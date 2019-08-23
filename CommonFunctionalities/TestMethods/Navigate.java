package TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.Click;
import Common.VerifyElementStatus;

public class Navigate {

	@FindBy(xpath = "//i[@data-test-selector='linkCart']")
	private WebElement linkCart;
	
	@FindBy(xpath = "//a[@data-test-selector='linkZfHome']")
	private WebElement linkHome;
	
	@FindBy(xpath = "//a[@data-test-selector='linkCheckout']")
	private WebElement linkCheckout;
	
	public void navigateToShoppingCart()
	{
		VerifyElementStatus.isElementVisible(linkCart);
		
		Click.clickAndWait(linkCart);
	}
	
	public void navigateToHomePage()
	{
		VerifyElementStatus.isElementClickable(linkHome);
		
		Click.clickAndWait(linkHome);
	}
	
	public void navigateToCheckoutPage()
	{
		VerifyElementStatus.isElementClickable(linkCheckout);
		
		Click.clickAndWait(linkCheckout);
	}
}
