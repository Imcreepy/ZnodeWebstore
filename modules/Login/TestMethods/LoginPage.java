package Login.TestMethods;

import Classes.LoginBaseClass;

public class LoginPage extends LoginBaseClass {

	public void GoToLoginPage()
	{
		clickAndWait(linkLogin);
	}
	
	public void login(String userName, String password)
	{
		setText(inputUserName, userName);
		
		setText(inputPassword, password);
		
		clickAndWait(buttonLogin);
		
//		if(messageBoxContainer.isDisplayed())
//		{
//			objCreateAccount.createNewAccount(userName, password);
//		}
	}
}
