package CheckoutPage.TestCases;

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
		
		checkoutpage.selectPaymentOption(mapdatafile.get("Payflow"));
	} 
	
	@Test(priority = 4)
	void enterPaymentDetails()
	{
		mapdatafile = setDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.CreditCardDetailsSheet);
		
		String visaExpDate = mapdatafile.get("VisaCardExpDate").substring(0, mapdatafile.get("VisaCardExpDate").indexOf("."));
		String visaExpYear = mapdatafile.get("VisaCardExpYear").substring(0, mapdatafile.get("VisaCardExpYear").indexOf("."));
		String visaCVVNo = mapdatafile.get("VisaCardCVVNumber").substring(0, mapdatafile.get("VisaCardCVVNumber").indexOf("."));
		
		checkoutpage.addPaymentDetails(mapdatafile.get("VisaCreditCardType"), mapdatafile.get("VisaCardHolderName"), 
				mapdatafile.get("VisaCardNumber"), visaExpDate, visaExpYear, visaCVVNo);
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
