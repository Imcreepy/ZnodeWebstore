package CreateAnAccount.TestMethods;

import Classes.CreateAnAccountBaseClass;

public class CreateAnAccount extends CreateAnAccountBaseClass
{	
	public void createNewAccount(String userName, String password)
	{
//		Click.clickAndWait(linkLogin);
		
		clickAndWait(linkGetAnAccount);
		
		waitForElementToBeVisible(txtUsername);
		
		setText(txtUsername, userName);
		
		setText(txtPassword, password);
		
		setText(txtReTypePassword, password);
		
		clickAndWait(btnCreateAccount);
	}
}
