package HomePage.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtilities.VerifyElementStatus;

public class HomePage {

	@FindBy(xpath = "//img[@data-test-selector='imgProductImage']")
	private WebElement imgProduct;
	
	public void ClickOnProductImage()
	{
		VerifyElementStatus.isElementVisible(imgProduct);
		
		imgProduct.click();
	}
}
