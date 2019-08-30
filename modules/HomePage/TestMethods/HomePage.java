package HomePage.TestMethods;

import Classes.HomePageBaseClass;

public class HomePage extends HomePageBaseClass
{
	public void ClickOnProductImage()
	{
		waitForElementToBeVisible(imgProduct);
		
		clickAndWait(imgProduct);
	}
}
