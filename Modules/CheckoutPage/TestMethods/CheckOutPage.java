package CheckoutPage.TestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtilities.Browser;
import CommonUtilities.Click;
import CommonUtilities.DataFile;
import CommonUtilities.DropdownOptionSelection;
import CommonUtilities.Loader;
import CommonUtilities.VerifyElementStatus;

public class CheckOutPage {

	@FindBy(xpath = "//input[@id='address_name']")
	private WebElement displayName;
	
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
	
	@FindBy(xpath = "//input[@data-payment-type='COD']")
	private WebElement chkPaymentOption_COD;
	
	@FindBy(xpath = "//input[@data-payment-type='PAYPAL_EXPRESS']")
	private WebElement chkPaymentOption_PAYPAL;
	
	@FindBy(xpath = "//input[@data-test-selector='CREDIT_CARDPayflow']")
	private WebElement chkPaymentOption_PAYFLOW;
	
	@FindBy(xpath = "//input[@data-test-selector='CREDIT_CARDWorldPay']")
	private WebElement chkPaymentOption_WORLDPAY;
	
	@FindBy(xpath = "//input[@data-test-selector='PURCHASE_ORDERPurchaseOrder']")
	private WebElement chkPaymentOption_PO;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCardHolderName']")
	private WebElement txtCardHolderName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCreditCardNumber']")
	private WebElement txtCreditCardNumber;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardExpMonth']")
	private WebElement txtCreditCardExpMonth;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardExpYear']")
	private WebElement txtCreditCardExpYear;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardCVCNumber']")
	private WebElement txtCreditCardCVVNumber;
	
	@FindBy(xpath = "//button[@id='btnCompleteCheckout']")
	private WebElement btnPlaceOrder;
	
	@FindBy(xpath = "//a[@id='default-shipping-address']")
	private WebElement btnEditShippingAddress;
	
	@FindBy(xpath = "//a[@data-test-selector='linkCreateNewAddress']")
	private WebElement linkCreateNewAddress;
	
	DataFile objdatafile = new DataFile();
	
	DropdownOptionSelection select = new DropdownOptionSelection();
	
	Loader loader;
	
	public void addValidShippingAddressForRegisteredUser()
	{
		try
		{
			if(displayName.isDisplayed())
			{
				objdatafile.dataFile("\\Modules\\CheckoutPage\\DataFiles\\CheckoutPage.xls", "Address");
				
				displayName.sendKeys(objdatafile.getData("DisplayName", "ValidShippingAddress"));
				
				txtAddressFirstname.sendKeys(objdatafile.getData("FirstName", "ValidShippingAddress"));
				
				txtAddressLastname.sendKeys(objdatafile.getData("LastName", "ValidShippingAddress"));
				
				txtAddressStreet1.sendKeys(objdatafile.getData("StreetAddress1", "ValidShippingAddress"));
				
				txtPhoneNumber.sendKeys(objdatafile.getData("PhoneNumber", "ValidShippingAddress"));
				
				txtCompanyName.sendKeys(objdatafile.getData("CompanyName", "ValidShippingAddress"));
				
				txtCityName.sendKeys(objdatafile.getData("City", "ValidShippingAddress"));
				
				select.selectOptionByName(drpState, objdatafile.getData("State", "ValidShippingAddress"));
				
				select.selectOptionByName(drpCountryName, objdatafile.getData("Country", "ValidShippingAddress"));
				
				txtPostalCode.sendKeys(objdatafile.getData("PostalCode", "ValidShippingAddress"));
				
				Click.clickAndWait(btnSaveAddress);
			}
		}
		
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
		}
		
		catch(ElementNotVisibleException ex)
		{
			ex.printStackTrace();
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void selectShippingOption()
	{
		try
		{
			VerifyElementStatus.isElementClickable(chkShippingOption);
			
			Click.clickAndWait(chkShippingOption);
		}
		
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void selectPaymentOption(String paymentOption)
	{
		objdatafile.dataFile("\\Modules\\CheckoutPage\\DataFiles\\CheckoutPage.xlsx", "PaymentOptions");
		
		if(paymentOption.equalsIgnoreCase(objdatafile.getData("COD", "Options")))
			Click.clickAndWait(chkPaymentOption_COD);
		
		else if(paymentOption.equalsIgnoreCase(objdatafile.getData("PaypalExpress", "Options")))
			Click.clickAndWait(chkPaymentOption_PAYPAL);
		
		else if(paymentOption.equalsIgnoreCase(objdatafile.getData("Payflow", "Options")))
			Click.clickAndWait(chkPaymentOption_PAYFLOW);
		
		else if(paymentOption.equalsIgnoreCase(objdatafile.getData("WorldPay", "Options")))
			Click.clickAndWait(chkPaymentOption_WORLDPAY);
		
		else if(paymentOption.equalsIgnoreCase(objdatafile.getData("PurchaseOrder", "Options")))
			Click.clickAndWait(chkPaymentOption_PO);
	}
	
	public void addPaymentDetails(String cardType, String holderName, String CCNumber, String CCExpMonth, String CCExpYear, String CVV)
	{
		WebElement cardOption = Browser.webDriver.findElement(By.xpath("//input[@value="+cardType.toUpperCase()+"]"));
		
		Click.clickAndWait(cardOption);
		
		VerifyElementStatus.isElementVisible(txtCardHolderName);
		
		txtCardHolderName.sendKeys(holderName);
		
		txtCreditCardNumber.sendKeys(CCNumber);
		
		txtCreditCardExpMonth.sendKeys(CCExpMonth);
		
		txtCreditCardExpYear.sendKeys(CCExpYear);
		
		txtCreditCardCVVNumber.sendKeys(CVV);
	}
	
	public void clickOnPlaceOrderButton()
	{
		Click.clickAndWait(btnPlaceOrder);
	}
	
}
