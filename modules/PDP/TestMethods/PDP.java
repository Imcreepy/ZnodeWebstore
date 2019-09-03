package PDP.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;
import common.GlobalVariables;
import common.VerifyElementStatus;

public class PDP extends TestBaseClass
{
	@FindBy(xpath = "//button[@data-test-selector='btnAddToCart']")
	private WebElement btnAddToCart;
	
	@FindBy(xpath = "//input[@data-test-selector='txtQuantity']")
	private WebElement txtQuantity;
	
	public void addToCart(String quantity)
	{
		VerifyElementStatus.isElementPresent(GlobalVariables.FindByXpath, "//button[@data-test-selector='btnAddToCart']");
		
		txtQuantity.clear();
		
		txtQuantity.sendKeys(quantity);
		
		VerifyElementStatus.isElementClickable(btnAddToCart);
		
		clickAndWait(btnAddToCart);
	}
}
