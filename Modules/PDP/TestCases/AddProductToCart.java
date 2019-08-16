package PDP.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilities.Browser;
import PDP.TestMethods.PDP;
import TestMethods.Navigate;

public class AddProductToCart {

	PDP objAddProduct;
	
	@Test(priority=0)
	void addAProductToCart()
	{
		objAddProduct = PageFactory.initElements(Browser.webDriver, PDP.class);
		
		objAddProduct.addToCart(3);
	}
}
