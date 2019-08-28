package PDP.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driver.DriverManager;
import PDP.TestMethods.PDP;

public class AddProductToCart 
{
	PDP pdp;
	
	@BeforeClass
	private void initializePDPPage()
	{
		pdp = PageFactory.initElements(DriverManager.getDriver().webDriver, PDP.class);
	}
	
	@Test(priority=1)
	private void addAProductToCart()
	{
		pdp.addToCart("3");
	}
}
