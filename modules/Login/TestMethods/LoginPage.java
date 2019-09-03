package Login.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;

public class LoginPage extends TestBaseClass 
{
	@FindBy(xpath = "//a[@data-test-selector='linkLoginLink']")
	private WebElement linkLogin;
	
	@FindBy(xpath = "//input[@data-test-selector='txtUserName']")
	private WebElement inputUserName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtLoginPassword']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//button[@data-test-selector='btnLoginButton']")
	private WebElement buttonLogin;
	
	@FindBy(xpath = "//*[@id='messageBoxContainerId']")
	private WebElement messageBoxContainer;
	
	public void GoToLoginPage()
	{
		clickAndWait(linkLogin);
	}
	
	public void login(String userName, String password)
	{
		setText(inputUserName, userName);
		
		setText(inputPassword, password);
		
		clickAndWait(buttonLogin);
		
//		if(messageBoxContainer.isDisplayed())
//		{
//			objCreateAccount.createNewAccount(userName, password);
//		}
	}
}
