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
<<<<<<< HEAD:Modules/HomePage/TestCases/NavigateToPDPPage.java
		search.searchProduct("AS 1011A034_021_090D");
=======
		search.searchProduct("Mushroom");
>>>>>>> fb5cf243d2db9ab19daca501b9b94d2374ba071e:modules/HomePage/TestCases/NavigateToPDPPage.java
	}
	
	@Test(priority = 2, groups= {"checkoutAsGuest"})
	private void clickOnAProductImage()
	{
		homepage.ClickOnProductImage();
	}
}
