package OrderReceipt.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;

public class OrderReceipt extends TestBaseClass
{
	@FindBy(xpath = "//a[text()='Continue shopping']")
	protected WebElement linkContinueShopping;
	
	public void clickOnContinueShopping()
	{	
		waitForElementToBeVisible(linkContinueShopping);
		
		clickAndWait(linkContinueShopping);	
	}
}
