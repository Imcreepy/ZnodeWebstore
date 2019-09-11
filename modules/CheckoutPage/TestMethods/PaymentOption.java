package CheckoutPage.TestMethods;

import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


import Classes.TestBaseClass;
import common.GlobalVariables;
import common.Loader;
import common.VerifyElementStatus;
 
public class PaymentOption extends TestBaseClass
{
	@FindBy(xpath = "//label[@for='COD1']")
	@CacheLookup
	private WebElement chkPaymentOption_COD;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDAuthorize']")
	@CacheLookup
	private WebElement chkPaymentOption_AUTHORIZE;
	
	@FindBy(xpath = "//label[@for='PAYPAL_EXPRESSPaypalExpress']")
	@CacheLookup
	private WebElement chkPaymentOption_PAYPAL;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDBraintree']")
	@CacheLookup
	private WebElement chkPaymentOption_BRAINTREE;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDPayFlow']")
	@CacheLookup
	private WebElement chkPaymentOption_PAYFLOW;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDWorldPay']")
	@CacheLookup
	private WebElement chkPaymentOption_WORLDPAY;
	
	@FindBy(xpath = "//label[@for='PURCHASE_ORDERPurchaseOrder']")
	@CacheLookup
	private WebElement chkPaymentOption_PO;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCardHolderName']")
	@CacheLookup 
	private WebElement txtCardHolderName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCreditCardNumber']")
	@CacheLookup 
	private WebElement txtCreditCardNumber;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardExpMonth']")
	@CacheLookup 
	private WebElement txtCreditCardExpMonth;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardExpYear']")
	@CacheLookup
	private WebElement txtCreditCardExpYear;
	
	@FindBy(xpath = "//input[@data-test-selector='txtCredidCardCVCNumber']")
	@CacheLookup
	private WebElement txtCreditCardCVVNumber;
	
	Map<String, String> paymentMethod = mapDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.PaymentOptionsSheet);
	
	Logger logger = Logger.getLogger(PaymentOption.class);
	
	public void selectPaymentOption(String paymentOption)
	{
		try
		{
			logger.info("Selecting payment option...........");
			
			Loader.waitForPageLoad();
			
			scrollToElement(chkPaymentOption_PAYFLOW);
			logger.info("Scrolled to payment option");
			
			if (paymentOption.equalsIgnoreCase(paymentMethod.get("COD")))
			{
				clickAndWait(chkPaymentOption_COD);
				logger.info("Selected COD as payment option");
			}
			
			else if (paymentOption.equalsIgnoreCase(paymentMethod.get("Authorize")))
			{
				clickAndWait(chkPaymentOption_AUTHORIZE);
				logger.info("Selected Authorize.Net Credit Card as payment option");
			}
			
			else if (paymentOption.equalsIgnoreCase(paymentMethod.get("PaypalExpress")))
			{
				clickAndWait(chkPaymentOption_PAYPAL);
				logger.info("Selected Paypal as payment option");
			}
			
			else if (paymentOption.equalsIgnoreCase(paymentMethod.get("Braintree")))
			{
				clickAndWait(chkPaymentOption_BRAINTREE);
				logger.info("Selected Braintree Credit Card as payment option");
			}
			
			else if (paymentOption.equalsIgnoreCase(paymentMethod.get("Payflow")))
			{
				clickAndWait(chkPaymentOption_PAYFLOW);
				logger.info("Selected PAYFLOW Credit Card as payment option");
			}
			
			else if (paymentOption.equalsIgnoreCase(paymentMethod.get("WorldPay")))
			{
				clickAndWait(chkPaymentOption_WORLDPAY);
				logger.info("Selected WORLDPAY Credit Card as payment option");
			}
			
			else if (paymentOption.equalsIgnoreCase(paymentMethod.get("PurchaseOrder")))
			{
				clickAndWait(chkPaymentOption_PO);
				logger.info("Selected Purchase order as payment option");
			}
			
			else
			{
				logger.error("No payment option selected. Please verify that condition is written for required payment option");
			}
		}
		
		catch (NullPointerException ex)
		{
			logger.error("Getting payment method as null");
		}
	}
	
	public void addPaymentDetails(String cardType, String holderName, String CCNumber, String CCExpMonth, String CCExpYear, String CVV)
	{
		try
		{
			logger.info("Adding payment details..............");
			
	//		WebElement cardOption = Browser.webDriver.findElement(By.xpath("//input[@value='"+cardType.toUpperCase()+"']/parent::label[@class='input-radio_label']"));
			
	//		clickAndWait(cardOption);
	
			setText(txtCardHolderName, holderName);
			logger.info("Card holder name entered successfully");
			
			setText(txtCreditCardNumber, CCNumber);
			logger.info("Card card number entered successfully");
			
			setText(txtCreditCardExpMonth, CCExpMonth);
			logger.info("Card card expiration month entered successfully");
			
			setText(txtCreditCardExpYear, CCExpYear);
			logger.info("Card card expiration year entered successfully");
			
			setText(txtCreditCardCVVNumber, CVV);
			logger.info("Card card CVV number entered successfully");
		}
		
		catch (NullPointerException ex)
		{
			logger.error("Getting null values in payment details");
		}
		
	}
}
