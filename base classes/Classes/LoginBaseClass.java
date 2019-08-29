package Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBaseClass extends TestBaseClass{

	@FindBy(xpath = "//a[@data-test-selector='linkLoginLink']")
	protected WebElement linkLogin;
	
	@FindBy(xpath = "//input[@data-test-selector='txtUserName']")
	protected WebElement inputUserName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtLoginPassword']")
	protected WebElement inputPassword;
	
	@FindBy(xpath = "//button[@data-test-selector='btnLoginButton']")
	protected WebElement buttonLogin;
	
	@FindBy(xpath = "//*[@id='messageBoxContainerId']")
	protected WebElement messageBoxContainer;
}
