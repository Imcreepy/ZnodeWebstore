package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilities.Browser;
import TestMethods.Navigate;

public class ClickOnCheckoutLink {

	Navigate objCart;
	
	@Test(priority=0)
	void goToCheckoutPage()
	{
		objCart = PageFactory.initElements(Browser.webDriver, Navigate.class);
		
		objCart.navigateToCheckoutPage();
	}
}
