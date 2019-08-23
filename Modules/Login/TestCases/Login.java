package Login.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Classes.TestBaseClass;
import Common.BrowserCapability;
import Login.TestMethods.LoginPage;
import Driver.DriverManager;


public class Login extends TestBaseClass
{

	LoginPage loginPage;
	
	String dataFilePath;
	
//	Login()
//	{
//		dataFilePath = getProperty("config.properties", "loginPageDataFilePath");
//	}
	
	@BeforeClass
	public void initiateDashboardPage()
	{
		loginPage = PageFactory.initElements(DriverManager.getDriver().webDriver, LoginPage.class);
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
