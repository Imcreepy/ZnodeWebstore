package HomePage.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import HomePage.TestMethods.HomePage;
import driver.DriverManager;
import testmethods.Search;

public class NavigateToPDPPage {

	HomePage homepage;
	
	Search search;
	
	@BeforeClass
	@Test( groups= {"checkoutAsGuest"})
	private void initiateHomePage()
	{
		search = PageFactory.initElements(DriverManager.getDriver().webDriver, Search.class);
		
		homepage = PageFactory.initElements(DriverManager.getDriver().webDriver, HomePage.class);
	}
	
	@Test(priority = 1, groups= {"checkoutAsGuest"})
	private void searchForProduct()
	{
		search.searchProduct("AS 1011A034_021_090D");
	}
	
	@Test(priority = 2, groups= {"checkoutAsGuest"})
	private void clickOnAProductImage()
	{
		homepage.ClickOnProductImage();
	}
}
