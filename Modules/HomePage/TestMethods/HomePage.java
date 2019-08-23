package HomePage.TestMethods;

import Classes.HomePageBaseClass;
import Common.VerifyElementStatus;

public class HomePage extends HomePageBaseClass
{
	public void ClickOnProductImage()
	{
		VerifyElementStatus.isElementVisible(imgProduct);
		
		imgProduct.click();
	}
}
