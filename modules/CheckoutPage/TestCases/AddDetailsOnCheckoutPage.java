package CheckoutPage.TestCases;

import java.util.Map;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Classes.TestBaseClass;
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
	
	Map<String, String> mapPaymentOptionSheet;
	
	Map<String, String> mapCreditCardDetailsSheet;

	@BeforeClass
	private void initiateCheckoutPage()
	{
		addaddress = PageFactory.initElements(DriverManager.getDriver().webDriver, AddAddress.class);
		
		paymentoption = PageFactory.initElements(DriverManager.getDriver().webDriver, PaymentOption.class);
		
		shippingoption = PageFactory.initElements(DriverManager.getDriver().webDriver, ShippingOption.class);
		
		orderreceipt = PageFactory.initElements(DriverManager.getDriver().webDriver, OrderReceipt.class);
		
		mapPaymentOptionSheet = mapDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.PaymentOptionsSheet);
		
		mapCreditCardDetailsSheet = mapDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.CreditCardDetailsSheet);
	}
	
	@Test(priority = 1)
	private void addShippingAddress()
	{
		addaddress.addShippingAddrForRegUser();
	}
	
	@Test(priority = 2)
	private void selectShippingOption()
	{
		shippingoption.selectShippingOption();
	} 
	
	@Test(priority = 3)
	private void selectPaymentOption()
	{
		paymentoption.selectPaymentOption(getValueOf("Payflow"));
	} 
	
	@Test(priority = 4)
	private void enterPaymentDetails()
	{
		String visaExpDate = getValueOf("VisaCardExpDate").substring(0, getValueOf("VisaCardExpDate").indexOf("."));
		String visaExpYear = getValueOf("VisaCardExpYear").substring(0, getValueOf("VisaCardExpYear").indexOf("."));
		String visaCVVNo = getValueOf("VisaCardCVVNumber").substring(0, getValueOf("VisaCardCVVNumber").indexOf("."));
		
		paymentoption.addPaymentDetails(getValueOf("VisaCreditCardType"), getValueOf("VisaCardHolderName"), 
				getValueOf("VisaCardNumber"), visaExpDate, visaExpYear, visaCVVNo);
	} 
	
	@Test(priority = 5)
	private void clickOnPlaceOrder()
	{
		addaddress.clickOnPlaceOrderButton();
	}
	
	@Test(priority = 6)
	private void clickOnContinueShopping()
	{
		orderreceipt.clickOnContinueShopping();
	}
}
