package CheckoutPage.TestCases;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Classes.TestBaseClass;
import OrderReceipt.TestMethods.OrderReceipt;
import common.GlobalVariables;
import CheckoutPage.TestMethods.CheckOutPage;
import driver.DriverManager;

public class AddDetailsOnCheckoutPage extends TestBaseClass
{
	CheckOutPage checkoutpage;
	
	OrderReceipt orderreceipt;
	
	Map<String, String> mapdatafile;

	@BeforeClass
	private void initiateCheckoutPage()
	{
		checkoutpage = PageFactory.initElements(DriverManager.getDriver().webDriver, CheckOutPage.class);
		
		orderreceipt = PageFactory.initElements(DriverManager.getDriver().webDriver, OrderReceipt.class);
	}
	
	@Test(priority = 1)
	private void addShippingAddress()
	{
		checkoutpage.addShippingAddrForRegUser();
	}
	
	@Test(priority = 2)
	private void selectShippingOption()
	{
		checkoutpage.selectShippingOption();
	} 
	
	@Test(priority = 3)
	private void selectPaymentOption()
	{
		mapdatafile = setDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.PaymentOptionsSheet);
		
		checkoutpage.selectPaymentOption(mapdatafile.get(GlobalVariables.KeyBraintree));
	} 
	
	@Test(priority = 4)
	void enterPaymentDetails()
	{
		mapdatafile = setDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.CreditCardDetailsSheet);
		
		checkoutpage.addPaymentDetails(mapdatafile.get(GlobalVariables.KeyVisaCreditCardType), mapdatafile.get(GlobalVariables.KeyVisaCardHolderName), 
				mapdatafile.get(GlobalVariables.KeyVisaCardNumber), mapdatafile.get(GlobalVariables.KeyVisaCardExpDate), mapdatafile.get(GlobalVariables.KeyVisaCardExpYear), 
				mapdatafile.get(GlobalVariables.KeyVisaCardCVVNumber));
	} 
	
	
	@Test(priority = 5)
	private void clickOnPlaceOrder()
	{
		checkoutpage.clickOnPlaceOrderButton();
	}
	
	@Test(priority = 6)
	private void clickOnContinueShopping()
	{
		orderreceipt.clickOnContinueShopping();
	}
}
