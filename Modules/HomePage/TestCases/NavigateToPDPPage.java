package HomePage.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilities.Browser;
import HomePage.TestMethods.HomePage;
import TestMethods.Search;


public class NavigateToPDPPage {

	HomePage nav;	
	Search search;
	
	@Test(priority=0)
	public void searchForProduct()
	{
		search = PageFactory.initElements(Browser.webDriver, Search.class);
		
		search.searchProduct("Pear");
	}
	
	@Test(priority=1)
	public void clickOnAProductImage()
	{
		nav = PageFactory.initElements(Browser.webDriver, HomePage.class);
		
		nav.ClickOnProductImage();
	}
}
