package Login.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Classes.LoginBaseClass;
import Common.Click;
import CreateAnAccount.TestMethods.CreateAnAccount;

public class LoginPage extends LoginBaseClass {

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
	
	CreateAnAccount objCreateAccount = new CreateAnAccount();
	
	public void GoToLoginPage()
	{
		Click.clickAndWait(linkLogin);
	}
	
	public void login(String userName, String password)
	{
		inputUserName.sendKeys(userName);
		
		inputPassword.sendKeys(password);
		
		Click.clickAndWait(buttonLogin);
		
//		if(messageBoxContainer.isDisplayed())
//		{
//			objCreateAccount.createNewAccount(userName, password);
//		}
	}
}
