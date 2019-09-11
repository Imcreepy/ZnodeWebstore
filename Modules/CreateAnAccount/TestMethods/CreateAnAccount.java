package CreateAnAccount.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;

public class CreateAnAccount extends TestBaseClass
{	
	@FindBy(xpath = "//a[@data-test-selector='linkLoginLink']")
	@CacheLookup
	private WebElement linkLogin;
	
	@FindBy(xpath = "//a[@data-test-selector='btnGetAnAccount']")
	@CacheLookup
	private WebElement linkGetAnAccount;
	
	@FindBy(xpath = "//input[@data-test-selector='txtUsername']")
	@CacheLookup
	private WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='Password']")
	@CacheLookup
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='ReTypePassword']")
	@CacheLookup
	private WebElement txtReTypePassword;
	
	@FindBy(xpath = "//button[@id='user-register']")
	@CacheLookup
	private WebElement btnCreateAccount;
	
	public void createNewAccount(String userName, String password)
	{
//		Click.clickAndWait(linkLogin);
		
		clickAndWait(linkGetAnAccount);
		
		waitForElementToBeVisible(txtUsername);
		
		setText(txtUsername, userName);
		
		setText(txtPassword, password);
		
		setText(txtReTypePassword, password);
		
		clickAndWait(btnCreateAccount);
	}
}
