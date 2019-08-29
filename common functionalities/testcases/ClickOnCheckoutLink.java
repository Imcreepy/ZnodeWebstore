package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import driver.DriverManager;
import testmethods.Navigate;

public class ClickOnCheckoutLink {

	Navigate objCart;
	
	@Test(priority=0)
	void goToCheckoutPage()
	{
		objCart = PageFactory.initElements(DriverManager.getDriver().webDriver, Navigate.class);
		
		objCart.navigateToCheckoutPage();
	}
}
