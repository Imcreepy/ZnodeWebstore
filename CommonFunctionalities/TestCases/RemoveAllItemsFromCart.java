package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilities.Browser;
import TestMethods.Navigate;
import TestMethods.RemoveItemsFromCart;

public class RemoveAllItemsFromCart {

	RemoveItemsFromCart objRemoveItems;
	Navigate nav;
	
	@Test(priority=0)
	void removeAllItems()
	{
		objRemoveItems = PageFactory.initElements(Browser.webDriver, RemoveItemsFromCart.class);
		
		objRemoveItems.removeAllItemsFromCart();
	}
	
	@Test(priority=1)
	void navigateToHomePage() throws InterruptedException
	{
		nav = PageFactory.initElements(Browser.webDriver, Navigate.class);
		
		Thread.sleep(3000);
		
		nav.navigateToHomePage();
	}
}
