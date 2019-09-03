package CheckoutPage.TestMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;

public class ShippingOption extends TestBaseClass
{
	@FindBy(xpath = "//img[@alt='Loading']")
	private WebElement loadingShippingOptions;
	
	@FindBy(xpath = "//label[@data-test-selector='lblShipping']")
	private WebElement chkShippingOption;
	
	public void selectShippingOption()
	{
		waitForElementToBeInvisible(loadingShippingOptions);

//		VerifyElementStatus.isElementNotVisible(GlobalVariables.FindByXpath, GlobalVariables.Loader);
			
		clickAndWait(chkShippingOption);
	}
}
