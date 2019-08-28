package CheckoutPage.TestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Classes.TestBaseClass;
import OrderReceipt.TestMethods.OrderReceipt;
import CheckoutPage.TestMethods.CheckOutPage;
import driver.DriverManager;

public class AddDetailsOnCheckoutPage extends TestBaseClass
{
	CheckOutPage checkoutpage;
	
	OrderReceipt orderreceipt;
	
	String dataFilePath;
	
	@BeforeClass
	private void initiateCheckoutPage()
	{
		checkoutpage = PageFactory.initElements(DriverManager.getDriver().webDriver, CheckOutPage.class);
		
		orderreceipt = PageFactory.initElements(DriverManager.getDriver().webDriver, OrderReceipt.class);
		
		dataFilePath = getProperty("config.properties", "checkoutPageDataFilePath");
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
		setDataFile(dataFilePath, "PaymentOptions");
		
		checkoutpage.selectPaymentOption(getData("Braintree", "Options"));
	} 
	
	@Test(priority = 4)
	void enterPaymentDetails()
	{
		setDataFile(dataFilePath, "CreditCardDetails");
		
		checkoutpage.addPaymentDetails(getData("Visa", "CreditCardType"), getData("Visa", "CardHolderName"), 
		getData("Visa", "CardNumber"), getData("Visa", "CardExpDate"), getData("Visa", "CardExpYear"), 
		getData("Visa", "CardCVVNumber"));
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
