package CheckoutPage.TestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import CheckoutPage.TestMethods.CheckOutPage;
import Classes.TestBaseClass;
import Common.BrowserCapability;
import OrderReceipt.TestMethods.OrderReceipt;
import Driver.DriverManager;

public class AddDetailsOnCheckoutPage extends TestBaseClass
{
	CheckOutPage objPage;
	
	OrderReceipt objOrdRec;
	
	String dataFilePath;
	
	AddDetailsOnCheckoutPage()
	{
		dataFilePath = getProperty("config.properties", "checkoutPageDataFilePath");
	}
	
	@Test(priority = 1)
	private void addShippingAddress()
	{
		objPage = PageFactory.initElements(DriverManager.getDriver().webDriver, CheckOutPage.class);
		
		objPage.addShippingAddrForRegUser();
	}
	
	@Test(priority = 2)
	private void selectShippingOption()
	{
//		objPage = PageFactory.initElements(Browser.webDriver, CheckOutPage.class);
		
		objPage.selectShippingOption();
	} 
	
	@Test(priority = 3)
	private void selectPaymentOption()
	{
		setDataFile(dataFilePath, "PaymentOptions");
		
		objPage.selectPaymentOption(getData("WorldPay", "Options"));
	} 
	
	@Test(priority = 4)
	void enterPaymentDetails()
	{
//		objPage = PageFactory.initElements(Browser.webDriver, CheckOutPage.class);
		
		setDataFile(dataFilePath, "CreditCardDetails");
		
		objPage.addPaymentDetails(getData("Visa", "CreditCardType"), getData("Visa", "CardHolderName"), 
		getData("Visa", "CardNumber"), getData("Visa", "CardExpDate"), getData("Visa", "CardExpYear"), 
		getData("Visa", "CardCVVNumber"));
	} 
	
	
	@Test(priority = 5)
	private void clickOnPlaceOrder()
	{
		objPage.clickOnPlaceOrderButton();
	}
	
	@Test(priority = 6)
	private void clickOnContinueShopping()
	{
		objOrdRec = PageFactory.initElements(DriverManager.getDriver().webDriver, OrderReceipt.class);
		
		objOrdRec.clickOnContinueShopping();
	}
}
