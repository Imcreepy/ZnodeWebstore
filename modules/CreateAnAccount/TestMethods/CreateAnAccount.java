package CreateAnAccount.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;

public class CreateAnAccount extends TestBaseClass
{	
	@FindBy(xpath = "//a[@data-test-selector='linkLoginLink']")
	private WebElement linkLogin;
	
	@FindBy(xpath = "//a[@data-test-selector='btnGetAnAccount']")
	private WebElement linkGetAnAccount;
	
	@FindBy(xpath = "//input[@data-test-selector='txtUsername']")
	private WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='ReTypePassword']")
	private WebElement txtReTypePassword;
	
	@FindBy(xpath = "//button[@id='user-register']")
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
