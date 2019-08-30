package Login.TestCases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Classes.TestBaseClass;
import Login.TestMethods.LoginPage;
import common.BrowserFunctionality;
import common.GlobalVariables;
import driver.DriverManager;


public class Login extends TestBaseClass
{
	LoginPage loginPage;
	
	Map<String, String> mapdatafile;
	
	@BeforeClass
	public void initiateLoginPage()
	{
		loginPage = PageFactory.initElements(DriverManager.getDriver().webDriver, LoginPage.class);
		
//		dataFilePath = loadPropertyFile("config.properties").get("loginPageDataFilePath");
	}
	
	@Test(priority=0)	
	public void clickOnLoginLink()
	{
		loginPage.GoToLoginPage();
	}
	
	@Test(priority=1)	
	public void enterLoginCredentials()
	{
		mapdatafile = setDataFile(GlobalVariables.loginPageDataFilePath, GlobalVariables.LoginCredentials);
		
		loginPage.login(mapdatafile.get("StoreUser"), mapdatafile.get("StoreUserPassword"));
	}
}
