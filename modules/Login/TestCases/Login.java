package Login.TestCases;

import java.util.Map;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Classes.TestBaseClass;
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
		loginPage.login(getValueOf("StoreUser"), getValueOf("StoreUserPassword"));
	}
}
