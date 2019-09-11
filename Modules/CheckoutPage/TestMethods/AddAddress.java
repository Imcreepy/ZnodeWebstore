package CheckoutPage.TestMethods;

import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import Classes.TestBaseClass;
import common.GlobalVariables;
import common.Loader;
import common.SelectOption;
import driver.DriverManager;

public class AddAddress extends TestBaseClass
{
	@FindBy(xpath = "//input[@data-test-selector='txtAddressFirstname']")
	@CacheLookup
	private WebElement txtAddressFirstname;
	
	@FindBy(xpath = "//input[@data-test-selector='txtAddressLastname']")
	@CacheLookup
	private WebElement txtAddressLastname;
	
	@FindBy(xpath = "//input[@data-test-selector='txtAddressStreet1']")
	@CacheLookup
	private WebElement txtAddressStreet1;
	
	@FindBy(xpath = "//input[@id='address_street2']")
	@CacheLookup
	private WebElement txtAddressStreet2;
	
	@FindBy(xpath = "//input[@id='CompanyName']")
	@CacheLookup
	private WebElement txtCompanyName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCityName']")
	@CacheLookup
	private WebElement txtCityName;
	
	@FindBy(xpath = "//select[@id='SelectStateName']")
	@CacheLookup
	private WebElement drpState;
	
	@FindBy(xpath = "//select[@data-test-selector='txtCountryName']")
	@CacheLookup
	private WebElement drpCountryName;
	
	@FindBy(xpath = "//input[@id='address_postalcode']")
	@CacheLookup
	private WebElement txtPostalCode;
	
	@FindBy(xpath = "//input[@id='address_phoneno']")
	@CacheLookup
	private WebElement txtPhoneNumber;
	
	@FindBy(xpath = "//input[@id='address_name']")
	@CacheLookup
	private WebElement displayName;
	
	@FindBy(xpath = "//input[@id='use_same_as_shipping_address']")
	@CacheLookup
	private WebElement chkUseSameAsBillingAddress;
	
	@FindBy(xpath = "//input[@id='asdefault_shipping']")
	@CacheLookup
	private WebElement chkSetAsDefault;
	
	@FindBy(xpath = "//input[@id='is_addupdate_address']")
	@CacheLookup
	private WebElement chkDontSaveForFuture;
	
	@FindBy(xpath = "//button[@id='btnSaveAddress']")
	@CacheLookup
	private WebElement btnSaveAddress;
	
	@FindBy(xpath = "//button[@id='btnCancelAddress']")
	@CacheLookup
	private WebElement btnCancelAddress;
	
	@FindBy(xpath = "//label[@data-test-selector='lblShipping']")
	@CacheLookup
	private WebElement chkShippingOption;
	
	@FindBy(xpath = "//button[@id='btnCompleteCheckout']")
	@CacheLookup
	private WebElement btnPlaceOrder;
	
	@FindBy(xpath = "//a[@id='default-shipping-address']")
	@CacheLookup
	private WebElement btnEditShippingAddress;
	
	@FindBy(xpath = "//a[@data-test-selector='linkCreateNewAddress']")
	@CacheLookup
	private WebElement linkCreateNewAddress;
	
	Logger logger = Logger.getLogger(AddAddress.class); 
	
	Map<String, String> validAddress = mapDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.AddressSheet);
	
	public void addShippingAddrForRegUser()
	{
		try
		{
			if (DriverManager.getDriver().webDriver.findElements(By.id("address_name")).size() != 0)
			{
				logger.info("Adding shipping address..........");
				
				setText(displayName, validAddress.get("ShippingDisplayName"));
				logger.info("display name entered successfully");
				
				addShippingAddress();
				
				Loader.waitForPageLoad();
				
				clickAndWait(btnSaveAddress);
				logger.info("Clicked on save address link");
			}
			
			else
			{
				logger.info("Shipping address already present");
			}
		}
		
		catch (NullPointerException ex)
		{
			logger.error("Getting null values for shipping address");
			ex.printStackTrace();
		}
		
		catch (NoSuchElementException ex)
		{
			logger.error("Unable to find a element of the shipping address");
			ex.printStackTrace();
		}
		
		catch (ElementNotVisibleException ex)
		{
			logger.error("A element is not visible in the shipping address");
			ex.printStackTrace();
		}
		
		catch (Exception ex)
		{
			logger.error("Something went wrong while adding shipping address");
			ex.printStackTrace();
		}
	}
	
	
	private void addShippingAddress()
	{
		String postalCode = validAddress.get("ShippingPostalCode").substring(0, validAddress.get("ShippingPostalCode").indexOf("."));
		logger.info("Indexing of postal code");
		
		setText(txtAddressFirstname, validAddress.get("ShippingFirstName"));
		logger.info("First name entered successfully");
		
		setText(txtAddressLastname, validAddress.get("ShippingLastName"));
		logger.info("Last name entered successfully");
		
		setText(txtAddressStreet1, validAddress.get("ShippingStreetAddress1"));
		logger.info("Street address 1 entered successfully");
		
		setText(txtPhoneNumber, validAddress.get("ShippingPhoneNumber"));
		logger.info("Phone number entered successfully");
		
		setText(txtCompanyName, validAddress.get("ShippingCompanyName"));
		logger.info("Company name entered successfully");
		
		setText(txtCityName, validAddress.get("ShippingCity"));
		logger.info("City name entered successfully");
		
		SelectOption.selectOptionByName(drpState, validAddress.get("ShippingState"));
		logger.info("State selected successfully");
		
		SelectOption.selectOptionByName(drpCountryName, validAddress.get("ShippingCountry"));
		logger.info("Country selected successfully");
		
		setText(txtPostalCode, postalCode);
		logger.info("Postal code entered successfully");
	}
	
	public void clickOnPlaceOrderButton()
	{
		scrollToElement(btnPlaceOrder);
		logger.info("Scrolled to place order button");
		
		clickAndWait(btnPlaceOrder);
		logger.info("Clicked on place order button");
	}
	
	
	
	
}
