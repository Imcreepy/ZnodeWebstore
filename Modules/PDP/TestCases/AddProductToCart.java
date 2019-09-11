package PDP.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driver.DriverManager;
import PDP.TestMethods.PDP;
import ShoppingCart.TestMethods.ShoppingCart;

public class AddProductToCart 
{
	PDP pdp;
	ShoppingCart shoppingCart;
	
	@BeforeClass
	@Test (groups= {"checkoutAsGuest"})
	private void initializePDPPage()
	{
		pdp = PageFactory.initElements(DriverManager.getDriver().webDriver, PDP.class);
		
		shoppingCart = PageFactory.initElements(DriverManager.getDriver().webDriver, ShoppingCart.class);
	}
	
	@Test (priority = 1, groups= {"checkoutAsGuest"})
	private void addAProductToCart()
	{
		pdp.addToCart("3");
	}
	
	@Test (priority = 2, groups= {"checkoutAsGuest"})
	private void clickOnCheckoutButton()
	{
		shoppingCart.clickOnCheckoutButton();
	}
}
