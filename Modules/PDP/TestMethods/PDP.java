package PDP.TestMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;
import common.GlobalVariables;
import common.VerifyElementStatus;

public class PDP extends TestBaseClass
{
	@FindBy(xpath = "//button[@data-test-selector='btnAddToCart']")
	@CacheLookup
	private WebElement btnAddToCart;
	
	@FindBy(id = "Quantity")
	@CacheLookup
	private WebElement txtQuantity;
	
	@FindBy(xpath = "//span[@data-test-selector='linkCartCount']")
	@CacheLookup
	private WebElement cartCount;
	
	@FindBy(id = "product-image")
	@CacheLookup
	private WebElement imgProductImage;
	
	@FindBy(xpath = "//*[@data-test-selector='hdgProductName']")
	@CacheLookup
	private WebElement hdgProductName;
	
	Logger logger = Logger.getLogger(PDP.class); 
	
	public void addToCart(String quantity)
	{
		VerifyElementStatus.isElementPresent(GlobalVariables.FindByXpath, "//button[@data-test-selector='btnAddToCart']");
		logger.info("Verified that add to cart button is present");
		
		setText(txtQuantity, quantity);
		logger.info("Quantity entered successfully");
		
//		VerifyElementStatus.isElementClickable(btnAddToCart);
//		logger.info("Verified that add to cart button is clickable");
		
		scrollToElement(hdgProductName);
		
		clickAndWait(btnAddToCart);
		logger.info("Clicked on add to cart button");
		
		clickAndWait(cartCount);
		logger.info("Clicked on cart count link");
	}
}
