package CheckoutPage.TestMethods;

import java.util.Map;
import java.util.NoSuchElementException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;

import Classes.TestBaseClass;
import common.SelectOption;
import common.GlobalVariables;


public class AddAddress extends TestBaseClass 
{

	@FindBy(xpath = "//input[@data-test-selector='txtAddressFirstname']")
	 private WebElement txtAddressFirstname;
	
	@FindBy(xpath = "//input[@data-test-selector='txtAddressLastname']")
	 private WebElement txtAddressLastname;
	
	@FindBy(xpath = "//input[@data-test-selector='txtAddressStreet1']")
	 private WebElement txtAddressStreet1;
	
	@FindBy(xpath = "//input[@id='address_street2']")
	 private WebElement txtAddressStreet2;
	
	@FindBy(xpath = "//input[@id='CompanyName']")
	 private WebElement txtCompanyName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCityName']")
	 private WebElement txtCityName;
	
	@FindBy(xpath = "//select[@id='SelectStateName']")
	 private WebElement drpState;
	
	@FindBy(xpath = "//select[@data-test-selector='txtCountryName']")
	 private WebElement drpCountryName;
	
	@FindBy(xpath = "//input[@id='address_postalcode']")
	 private WebElement txtPostalCode;
	
	@FindBy(xpath = "//input[@id='address_phoneno']")
	private WebElement txtPhoneNumber;
	
	@FindBy(xpath = "//input[@id='address_name']")
	private WebElement displayName;
	
	@FindBy(xpath = "//input[@id='use_same_as_shipping_address']")
	 private WebElement chkUseSameAsBillingAddress;
	
	@FindBy(xpath = "//input[@id='asdefault_shipping']")
	 private WebElement chkSetAsDefault;
	
	@FindBy(xpath = "//input[@id='is_addupdate_address']")
	 private WebElement chkDontSaveForFuture;
	
	@FindBy(xpath = "//button[@id='btnSaveAddress']")
	 private WebElement btnSaveAddress;
	
	@FindBy(xpath = "//button[@id='btnCancelAddress']")
	 private WebElement btnCancelAddress;
	
	@FindBy(xpath = "//label[@data-test-selector='lblShipping']")
	 private WebElement chkShippingOption;
	
	@FindBy(xpath = "//button[@id='btnCompleteCheckout']")
	 private WebElement btnPlaceOrder;
	
	@FindBy(xpath = "//a[@id='default-shipping-address']")
	 private WebElement btnEditShippingAddress;
	
	@FindBy(xpath = "//a[@data-test-selector='linkCreateNewAddress']")
	 private WebElement linkCreateNewAddress;
	
	
	// End of private WebElements initialization
	Map<String, String> mapdatafile;
	
	@BeforeClass
	private void initialization()
	{
		mapdatafile = mapDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.AddressSheet);
	}
	
	public void addShippingAddrForRegUser()
	{
		try
		{
			if (displayName.isDisplayed())
			{
				setText(displayName, getValueOf("ShippingDisplayName"));
				
				addShippingAddress();
				
				clickAndWait(btnSaveAddress);
			}
		}
		
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
		
		catch (NoSuchElementException ex)
		{
			ex.printStackTrace();
		}
		
		catch (ElementNotVisibleException ex)
		{
			ex.printStackTrace();
		}
		
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private void addShippingAddress()
	{
		try
		{
			setText(txtAddressFirstname, getValueOf("ShippingFirstName"));
			
			setText(txtAddressLastname, getValueOf("ShippingLastName"));
			
			setText(txtAddressStreet1, getValueOf("ShippingStreetAddress1"));
			
			setText(txtPhoneNumber, getValueOf("ShippingPhoneNumber"));
			
			setText(txtCompanyName, getValueOf("ShippingCompanyName"));
			
			setText(txtCityName, getValueOf("ShippingCity"));
			
			SelectOption.selectOptionByName(drpState, getValueOf("ShippingState"));
			
			SelectOption.selectOptionByName(drpCountryName, getValueOf("ShippingCountry"));
			
			setText(txtPostalCode, getValueOf("ShippingPostalCode"));
		}
		
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
		
		catch (NoSuchElementException ex)
		{
			ex.printStackTrace();
		}
		
		catch (ElementNotVisibleException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void clickOnPlaceOrderButton()
	{
		scrollToElement(btnPlaceOrder);
		
		clickAndWait(btnPlaceOrder);
	}
	
	
}
