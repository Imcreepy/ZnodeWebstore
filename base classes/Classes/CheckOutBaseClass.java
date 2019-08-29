package Classes;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.DropdownOptionSelection;

public class CheckOutBaseClass extends TestBaseClass {

	//Initializing protected WebElements
	@FindBy(xpath = "//input[@data-test-selector='txtAddressFirstname']")
	 protected WebElement txtAddressFirstname;
	
	@FindBy(xpath = "//input[@data-test-selector='txtAddressLastname']")
	 protected WebElement txtAddressLastname;
	
	@FindBy(xpath = "//input[@data-test-selector='txtAddressStreet1']")
	 protected WebElement txtAddressStreet1;
	
	@FindBy(xpath = "//input[@id='address_street2']")
	 protected WebElement txtAddressStreet2;
	
	@FindBy(xpath = "//input[@id='CompanyName']")
	 protected WebElement txtCompanyName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCityName']")
	 protected WebElement txtCityName;
	
	@FindBy(xpath = "//select[@id='SelectStateName']")
	 protected WebElement drpState;
	
	@FindBy(xpath = "//select[@data-test-selector='txtCountryName']")
	 protected WebElement drpCountryName;
	
	@FindBy(xpath = "//input[@id='address_postalcode']")
	 protected WebElement txtPostalCode;
	
	@FindBy(xpath = "//input[@id='address_phoneno']")
	protected WebElement txtPhoneNumber;
	
	@FindBy(xpath = "//input[@id='address_name']")
	protected WebElement displayName;
	
	@FindBy(xpath = "//input[@id='use_same_as_shipping_address']")
	 protected WebElement chkUseSameAsBillingAddress;
	
	@FindBy(xpath = "//input[@id='asdefault_shipping']")
	 protected WebElement chkSetAsDefault;
	
	@FindBy(xpath = "//input[@id='is_addupdate_address']")
	 protected WebElement chkDontSaveForFuture;
	
	@FindBy(xpath = "//button[@id='btnSaveAddress']")
	 protected WebElement btnSaveAddress;
	
	@FindBy(xpath = "//button[@id='btnCancelAddress']")
	 protected WebElement btnCancelAddress;
	
	@FindBy(xpath = "//label[@data-test-selector='lblShipping']")
	 protected WebElement chkShippingOption;
	
	@FindBy(xpath = "//label[@for='COD1']")
	 protected WebElement chkPaymentOption_COD;
	
	@FindBy(xpath = "//label[@for='PAYPAL_EXPRESSPaypalExpress']")
	 protected WebElement chkPaymentOption_PAYPAL;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDBraintree']")
	 protected WebElement chkPaymentOption_BRAINTREE;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDPayflow']")
	 protected WebElement chkPaymentOption_PAYFLOW;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDWorldPay']")
	 protected WebElement chkPaymentOption_WORLDPAY;
	
	@FindBy(xpath = "//label[@for='PURCHASE_ORDERPurchaseOrder']")
	 protected WebElement chkPaymentOption_PO;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCardHolderName']")
	 protected WebElement txtCardHolderName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCreditCardNumber']")
	 protected WebElement txtCreditCardNumber;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardExpMonth']")
	 protected WebElement txtCreditCardExpMonth;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardExpYear']")
	protected WebElement txtCreditCardExpYear;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardCVCNumber']")
	protected WebElement txtCreditCardCVVNumber;
	
	@FindBy(xpath = "//button[@id='btnCompleteCheckout']")
	protected WebElement btnPlaceOrder;
	
	@FindBy(xpath = "//a[@id='default-shipping-address']")
	protected WebElement btnEditShippingAddress;
	
	@FindBy(xpath = "//a[@data-test-selector='linkCreateNewAddress']")
	protected WebElement linkCreateNewAddress;
	
	@FindBy(xpath = "//img[@alt='Loading']")
	protected WebElement loadingShippingOptions;
	// End of protected WebElements initialization
	
	protected void selectOptionByName(WebElement element, String option)
	{
		DropdownOptionSelection select = new DropdownOptionSelection();
		
		select.selectOptionByName(element, option);
	}
	
	// Excel file path
	Map<String, String> configPropertyFile = loadPropertyFile("config.properties");
	protected String dataFilePath = configPropertyFile.get("checkoutPageDataFilePath");
}
