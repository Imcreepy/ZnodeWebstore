package CheckoutPage.TestMethods;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;
import common.Loader;

public class ShippingOption extends TestBaseClass
{
	@FindBy(xpath = "//img[@alt='Loading']")
	@CacheLookup
	private WebElement loadingShippingOptions;
	
	@FindBy(xpath = "//label[@data-test-selector='lblShipping']")
	@CacheLookup
	private WebElement chkShippingOption;
	
	Logger logger = Logger.getLogger(ShippingOption.class);
	
	public void selectShippingOption()
	{
		try
		{
			waitForElementToBeVisible(chkShippingOption);
			logger.info("Verified that Shipping Option is visible");
			
			Loader.waitForPageLoad();
			
			Thread.sleep(500);
			logger.info("delayed by 500 millisec");
			
			clickAndWait(chkShippingOption);
			logger.info("Selected shipping Option");	
		}
		
		catch (NoSuchElementException ex)
		{
			logger.error("Element of shipping option is not present");
			ex.printStackTrace();
		}
		
		catch (Exception ex)
		{
			logger.error("Something went wrong while selecting shipping option");
			ex.printStackTrace();
		}
	}
}
