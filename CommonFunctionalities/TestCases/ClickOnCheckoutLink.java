package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Common.BrowserCapability;
import TestMethods.Navigate;
import Driver.DriverManager;

public class ClickOnCheckoutLink {

	Navigate objCart;
	
	@Test(priority=0)
	void goToCheckoutPage()
	{
		objCart = PageFactory.initElements(DriverManager.getDriver().webDriver, Navigate.class);
		
		objCart.navigateToCheckoutPage();
	}
}
