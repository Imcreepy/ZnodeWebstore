package Login.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Classes.TestBaseClass;
import Login.TestMethods.LoginPage;
import common.BrowserFunctionality;
import driver.DriverManager;


public class Login extends TestBaseClass
{

	LoginPage loginPage = new LoginPage();
	
	String dataFilePath;
	
	@BeforeClass
	public void initiateLoginPage()
	{
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		dataFilePath = getProperty("config.properties", "loginPageDataFilePath");
	}
	
	@Test(priority=0)	
	public void clickOnLoginLink()
	{
		loginPage.GoToLoginPage();
	}
	
	@Test(priority=1)	
	public void enterLoginCredentials()
	{
		setDataFile(dataFilePath, "Credentials");
		
		loginPage.login(getData("StoreUser", "Username"), getData("StoreUser", "Password"));
	}
}
