package CheckoutPage.TestCases;

import java.util.Map;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import OrderReceipt.TestMethods.OrderReceipt;
import common.DataFile;
import common.GlobalVariables;
import CheckoutPage.TestMethods.AddAddress;
import CheckoutPage.TestMethods.PaymentOption;
import CheckoutPage.TestMethods.ShippingOption;
import driver.DriverManager;

public class AddDetailsOnCheckoutPage extends DataFile
{
	AddAddress addaddress;
	
	PaymentOption paymentoption;
	
	ShippingOption shippingoption;
	
	OrderReceipt orderreceipt;
	
	Map<String, String> paymentOption = mapDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.PaymentOptionsSheet);
	
	Map<String, String> creditCardDetails = mapDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.CreditCardDetailsSheet);

	@BeforeClass
	@Test (groups= {"checkoutAsGuest"})
	private void initiateCheckoutPage()
	{
		addaddress = PageFactory.initElements(DriverManager.getDriver().webDriver, AddAddress.class);
		
		paymentoption = PageFactory.initElements(DriverManager.getDriver().webDriver, PaymentOption.class);
		
		shippingoption = PageFactory.initElements(DriverManager.getDriver().webDriver, ShippingOption.class);
		
		orderreceipt = PageFactory.initElements(DriverManager.getDriver().webDriver, OrderReceipt.class);
	}
	
	@Test(priority=1, groups= {"checkoutAsGuest"})
	private void addShippingAddress()
	{
		addaddress.addShippingAddrForRegUser();
	}
	
	@Test(priority=2, groups= {"checkoutAsGuest"})
	private void selectShippingOption()
	{
		shippingoption.selectShippingOption();
	} 
	
	@Test(priority=3, groups= {"checkoutAsGuest"})
	private void selectPaymentOption()
	{
		paymentoption.selectPaymentOption(paymentOption.get("Payflow"));
	} 
	
	@Test(priority=4, groups= {"checkoutAsGuest"})
	private void enterPaymentDetails()
	{
		String visaExpDate = creditCardDetails.get("VisaCardExpDate").substring(0, creditCardDetails.get("VisaCardExpDate").indexOf("."));
		String visaExpYear = creditCardDetails.get("VisaCardExpYear").substring(0, creditCardDetails.get("VisaCardExpYear").indexOf("."));
		String visaCVVNo = creditCardDetails.get("VisaCardCVVNumber").substring(0, creditCardDetails.get("VisaCardCVVNumber").indexOf("."));
		
		paymentoption.addPaymentDetails(creditCardDetails.get("VisaCreditCardType"), creditCardDetails.get("VisaCardHolderName"), 
				creditCardDetails.get("VisaCardNumber"), visaExpDate, visaExpYear, visaCVVNo);
	} 
	
	@Test(priority=5, groups= {"checkoutAsGuest"})
	private void clickOnPlaceOrder()
	{
		addaddress.clickOnPlaceOrderButton();
	}
	
	@Test(priority=6, groups= {"checkoutAsGuest"})
	private void clickOnContinueShopping()
	{
		orderreceipt.clickOnContinueShopping();
	}
}
