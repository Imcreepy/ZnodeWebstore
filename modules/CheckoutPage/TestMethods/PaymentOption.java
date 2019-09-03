package CheckoutPage.TestMethods;

import java.util.Map;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import Classes.CheckOutBaseClass;
import Classes.TestBaseClass;
import common.GlobalVariables;
import common.MyWait;
import common.VerifyElementStatus;

public class PaymentOption extends TestBaseClass
{
	@FindBy(xpath = "//label[@for='COD1']")
	 private WebElement chkPaymentOption_COD;
	
	@FindBy(xpath = "//label[@for='PAYPAL_EXPRESSPaypalExpress']")
	 private WebElement chkPaymentOption_PAYPAL;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDBraintree']")
	 private WebElement chkPaymentOption_BRAINTREE;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDPayFlowNew']")
	 private WebElement chkPaymentOption_PAYFLOW;
	
	@FindBy(xpath = "//label[@for='CREDIT_CARDWorldPay']")
	 private WebElement chkPaymentOption_WORLDPAY;
	
	@FindBy(xpath = "//label[@for='PURCHASE_ORDERPurchaseOrder']")
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
	
	Map<String, String> mapdatafile;
	
	@BeforeClass
	private void initializeDataFile()
	{
		mapdatafile = setDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.PaymentOptionsSheet);
	}
	
	public void selectPaymentOption(String paymentOption)
	{
		VerifyElementStatus.isElementNotVisible(GlobalVariables.FindByXpath, GlobalVariables.Loader);
		
		scrollToElement(chkPaymentOption_WORLDPAY);
		
		if (paymentOption.equalsIgnoreCase(getValueOf("COD")))
			clickAndWait(chkPaymentOption_COD);
		
		else if (paymentOption.equalsIgnoreCase(getValueOf("PaypalExpress")))
			clickAndWait(chkPaymentOption_PAYPAL);
		
		else if (paymentOption.equalsIgnoreCase(getValueOf("Braintree")))
			clickAndWait(chkPaymentOption_BRAINTREE);
		
		else if (paymentOption.equalsIgnoreCase(getValueOf("Payflow")))
			clickAndWait(chkPaymentOption_PAYFLOW);
		
		else if (paymentOption.equalsIgnoreCase(getValueOf("WorldPay")))
			clickAndWait(chkPaymentOption_WORLDPAY);
		
		else if (paymentOption.equalsIgnoreCase(getValueOf("PurchaseOrder")))
			clickAndWait(chkPaymentOption_PO);
	}
	
	public void addPaymentDetails(String cardType, String holderName, String CCNumber, String CCExpMonth, String CCExpYear, String CVV)
	{
//		WebElement cardOption = Browser.webDriver.findElement(By.xpath("//input[@value='"+cardType.toUpperCase()+"']/parent::label[@class='input-radio_label']"));
		
		MyWait.getDriverWait(GlobalVariables.delayVeryLow);
		
//		clickAndWait(cardOption);

		setText(txtCardHolderName, holderName);
		
		setText(txtCreditCardNumber, CCNumber);
		
		setText(txtCreditCardExpMonth, CCExpMonth);
		
		setText(txtCreditCardExpYear, CCExpYear);
		
		setText(txtCreditCardCVVNumber, CVV);
	}
}
