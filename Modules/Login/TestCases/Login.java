package Login.TestCases;

import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Login.TestMethods.LoginPage;
import common.DataFile;
import common.GlobalVariables;
import driver.DriverManager;

public class Login extends DataFile
{
	LoginPage loginPage;
	
	Map<String, String> loginCredentials;
	
	@BeforeClass
	public void initiateLoginPage()
	{
		loginPage = PageFactory.initElements(DriverManager.getDriver().webDriver, LoginPage.class);
		
		loginCredentials = mapDataFile(GlobalVariables.loginPageDataFilePath, GlobalVariables.LoginCredentials);
	}
	
	@Test(priority=0)	
	public void clickOnLoginLink()
	{
		loginPage.GoToLoginPage();
	}
	
	@Test(priority=1)	
	public void enterLoginCredentials()
	{
		loginPage.login(loginCredentials.get("StoreUser"), loginCredentials.get("StoreUserPassword"));
	}
	

	public void clickOnCheckoutAsGuestLink()
	{
		loginPage.clickCheckoutAsGuest();
	}
}
