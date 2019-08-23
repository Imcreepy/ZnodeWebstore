package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import TestMethods.Navigate;
import TestMethods.RemoveItemsFromCart;
import Driver.DriverManager;

public class RemoveAllItemsFromCart {

	RemoveItemsFromCart objRemoveItems;
	Navigate nav;
	
	@Test(priority=0)
	void removeAllItems()
	{
		objRemoveItems = PageFactory.initElements(DriverManager.getDriver().webDriver, RemoveItemsFromCart.class);
		
		objRemoveItems.removeAllItemsFromCart();
	}
	
	@Test(priority=1)
	void navigateToHomePage() throws InterruptedException
	{
		nav = PageFactory.initElements(DriverManager.getDriver().webDriver, Navigate.class);
		
		Thread.sleep(3000);
		
		nav.navigateToHomePage();
	}
}
