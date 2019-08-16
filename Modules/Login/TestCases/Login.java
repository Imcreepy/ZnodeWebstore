package Login.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import CommonUtilities.Browser;
import CommonUtilities.DataFile;
import Login.TestMethods.LoginPage;


public class Login {

	LoginPage loginPage;
	DataFile loginData = new DataFile();
	
	@Test(priority=0)	
	public void clickOnLoginLink()
	{
		loginPage = PageFactory.initElements(Browser.webDriver,LoginPage.class);
		
		loginPage.GoToLoginPage();
	}
	
	@Test(priority=1)	
	public void enterLoginCredentials()
	{
		loginPage = PageFactory.initElements(Browser.webDriver,LoginPage.class);
		
		loginData.dataFile("\\Modules\\Login\\Data Files\\Login Credentials.xls", "Sheet1");
		
		loginPage.login(loginData.getData("StoreUser", "Username"), loginData.getData("StoreUser", "Password"));
	}
}
