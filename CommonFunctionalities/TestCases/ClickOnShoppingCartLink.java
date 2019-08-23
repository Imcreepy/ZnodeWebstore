package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import TestMethods.Navigate;
import Driver.DriverManager;

public class ClickOnShoppingCartLink {

	Navigate objCart;
	
	@Test(priority=0)
	void goToShoppingCart()
	{
		objCart = PageFactory.initElements(DriverManager.getDriver().webDriver, Navigate.class);
		
		objCart.navigateToShoppingCart();
	}
}
