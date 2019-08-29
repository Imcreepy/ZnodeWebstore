package HomePage.TestMethods;

import Classes.HomePageBaseClass;
import common.Click;
import common.VerifyElementStatus;

public class HomePage extends HomePageBaseClass
{
	public void ClickOnProductImage()
	{
		VerifyElementStatus.isElementVisible(imgProduct);
		
		clickAndWait(imgProduct);
	}
}
