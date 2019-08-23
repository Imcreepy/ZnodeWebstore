package CreateAnAccount.TestMethods;

import Classes.CreateAnAccountBaseClass;
import Common.Click;
import Common.VerifyElementStatus;

public class CreateAnAccount extends CreateAnAccountBaseClass
{	
	public void createNewAccount(String userName, String password)
	{
//		Click.clickAndWait(linkLogin);
		
		Click.clickAndWait(linkGetAnAccount);
		
		VerifyElementStatus.isElementVisible(txtUsername);
		
		txtUsername.sendKeys(userName);
		
		txtPassword.sendKeys(password);
		
		txtReTypePassword.sendKeys(password);
		
		Click.clickAndWait(btnCreateAccount);
	}
}
