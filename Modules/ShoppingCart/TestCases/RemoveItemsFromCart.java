package ShoppingCart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ShoppingCart.TestMethods.ShoppingCart;
import driver.DriverManager;

public class RemoveItemsFromCart {

	ShoppingCart shoppingCart;
	
	@BeforeClass
	public void initiateShoppingCartPage()
	{
		shoppingCart = PageFactory.initElements(DriverManager.getDriver().webDriver, ShoppingCart.class);
	}
	
	@Test
	private void removeItemsFromCart()
	{
		shoppingCart.removeAllItemsFromCart();
	}
}
