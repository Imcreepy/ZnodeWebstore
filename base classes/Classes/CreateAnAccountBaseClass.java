package Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountBaseClass extends TestBaseClass{

	@FindBy(xpath = "//a[@data-test-selector='linkLoginLink']")
	protected WebElement linkLogin;
	
	@FindBy(xpath = "//a[@data-test-selector='btnGetAnAccount']")
	protected WebElement linkGetAnAccount;
	
	@FindBy(xpath = "//input[@data-test-selector='txtUsername']")
	protected WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='Password']")
	protected WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='ReTypePassword']")
	protected WebElement txtReTypePassword;
	
	@FindBy(xpath = "//button[@id='user-register']")
	protected WebElement btnCreateAccount;
}
