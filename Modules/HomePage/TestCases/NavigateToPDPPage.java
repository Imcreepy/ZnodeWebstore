package HomePage.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import HomePage.TestMethods.HomePage;
import driver.DriverManager;
import testmethods.Search;


public class NavigateToPDPPage {

	HomePage home;
	
	Search search;
	
	@BeforeClass
	private void initiatePDPPage()
	{
		search = PageFactory.initElements(DriverManager.getDriver().webDriver, Search.class);
		
		home = PageFactory.initElements(DriverManager.getDriver().webDriver, HomePage.class);
	}
	
	@Test(priority=0)
	private void searchForProduct()
	{
		search.searchProduct("Cherries");
	}
	
	@Test(priority=1)
	private void clickOnAProductImage()
	{
		home.ClickOnProductImage();
	}
}
