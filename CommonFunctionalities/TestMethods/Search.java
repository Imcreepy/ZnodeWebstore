package testmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.Click;
import common.VerifyElementStatus;

public class Search {

	@FindBy(xpath = "//input[@id='searchTextBox']")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@data-test-selector='btnSearchTerm']")
	private WebElement btnSearch;
	
	public void searchProduct(String searchText)
	{
		VerifyElementStatus.isElementPresent("xpath", "//input[@id='searchTextBox']");
		
		txtSearch.sendKeys(searchText);
		
		Click.clickAndWait(btnSearch);
	}
}
