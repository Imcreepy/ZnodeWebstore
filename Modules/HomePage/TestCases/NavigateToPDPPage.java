package HomePage.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import HomePage.TestMethods.HomePage;
import TestMethods.Search;
import Driver.DriverManager;


public class NavigateToPDPPage {

	HomePage nav;	
	Search search;
	
	@Test(priority=0)
	public void searchForProduct()
	{
		search = PageFactory.initElements(DriverManager.getDriver().webDriver, Search.class);
		
		search.searchProduct("Cherries");
	}
	
	@Test(priority=1)
	public void clickOnAProductImage()
	{
		nav = PageFactory.initElements(DriverManager.getDriver().webDriver, HomePage.class);
		
		nav.ClickOnProductImage();
	}
}
