package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import driver.DriverManager;
import testmethods.Navigate;

public class ClickOnShoppingCartLink {

	Navigate objCart;
	
	@Test(priority=0)
	void goToShoppingCart()
	{
		objCart = PageFactory.initElements(DriverManager.getDriver().webDriver, Navigate.class);
		
		objCart.navigateToShoppingCart();
	}
}
