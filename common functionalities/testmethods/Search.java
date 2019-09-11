package testmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import common.Click;
import common.GlobalVariables;
import common.SendKeys;
import common.VerifyElementStatus;

public class Search extends Click
{

	@FindBy(xpath = "//input[@id='searchTextBox']")
	@CacheLookup
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@data-test-selector='btnSearchTerm']")
	@CacheLookup
	private WebElement btnSearch;
	
	public void searchProduct(String searchText)
	{
		VerifyElementStatus.isElementPresent(GlobalVariables.FindByXpath, "//input[@id='searchTextBox']");
		
		SendKeys.setText(txtSearch, searchText);
		
		clickAndWait(btnSearch);
	}
}
