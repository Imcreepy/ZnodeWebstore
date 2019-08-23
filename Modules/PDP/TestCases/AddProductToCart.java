package PDP.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import PDP.TestMethods.PDP;
import Driver.DriverManager;

public class AddProductToCart 
{

	PDP objAddProduct;
	
	@Test(priority=0)
	void addAProductToCart()
	{
		objAddProduct = PageFactory.initElements(DriverManager.getDriver().webDriver, PDP.class);
		
		objAddProduct.addToCart(3);
	}
}
