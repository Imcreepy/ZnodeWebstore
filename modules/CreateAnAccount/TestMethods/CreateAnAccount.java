package CreateAnAccount.TestMethods;

import Classes.CreateAnAccountBaseClass;
import common.Click;
import common.VerifyElementStatus;

public class CreateAnAccount extends CreateAnAccountBaseClass
{	
	public void createNewAccount(String userName, String password)
	{
//		Click.clickAndWait(linkLogin);
		
		clickAndWait(linkGetAnAccount);
		
		VerifyElementStatus.isElementVisible(txtUsername);
		
		txtUsername.sendKeys(userName);
		
		txtPassword.sendKeys(password);
		
		txtReTypePassword.sendKeys(password);
		
		clickAndWait(btnCreateAccount);
	}
}
