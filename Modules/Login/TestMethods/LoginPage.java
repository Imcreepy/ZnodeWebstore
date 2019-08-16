package Login.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import CommonUtilities.Click;
import CommonUtilities.VerifyElementStatus;

public class LoginPage {

	@FindBy(xpath = "//a[@data-test-selector='linkLoginLink']")
	private WebElement linkLogin;
	
	@FindBy(xpath = "//input[@data-test-selector='txtUserName']")
	private WebElement inputUserName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtLoginPassword']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//button[@data-test-selector='btnLoginButton']")
	private WebElement buttonLogin;
	
	public void GoToLoginPage()
	{
		Click.clickAndWait(linkLogin);
	}
	
	public void login(String userName, String password)
	{
		inputUserName.sendKeys(userName);
		
		inputPassword.sendKeys(password);
		
		Click.clickAndWait(buttonLogin);
	}
}
