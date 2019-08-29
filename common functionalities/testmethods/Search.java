package testmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.Click;
import common.GlobalVariables;
import common.VerifyElementStatus;

public class Search extends Click{

	@FindBy(xpath = "//input[@id='searchTextBox']")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@data-test-selector='btnSearchTerm']")
	private WebElement btnSearch;
	
	public void searchProduct(String searchText)
	{
		VerifyElementStatus.isElementPresent(GlobalVariables.FindByXpath, "//input[@id='searchTextBox']");
		
		txtSearch.sendKeys(searchText);
		
		clickAndWait(btnSearch);
	}
}
