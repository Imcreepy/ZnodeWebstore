package Login.TestMethods;

import Classes.LoginBaseClass;
import CreateAnAccount.TestMethods.CreateAnAccount;
import common.Click;

public class LoginPage extends LoginBaseClass {

	public void GoToLoginPage()
	{
		Click.clickAndWait(linkLogin);
	}
	
	public void login(String userName, String password)
	{
		setText(inputUserName, userName);
		
		setText(inputPassword, password);
		
		Click.clickAndWait(buttonLogin);
		
//		if(messageBoxContainer.isDisplayed())
//		{
//			objCreateAccount.createNewAccount(userName, password);
//		}
	}
}
