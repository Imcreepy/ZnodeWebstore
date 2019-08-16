package CheckoutPage.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CheckoutPage.TestMethods.CheckOutPage;
import CommonUtilities.Browser;
import CommonUtilities.DataFile;

public class AddDetailsOnCheckoutPage {

	CheckOutPage objPage = new CheckOutPage();
	
	DataFile objdatafile = new DataFile();
	
	@Test(priority = 1)
	void addShippingAddress()
	{
		objPage = PageFactory.initElements(Browser.webDriver, CheckOutPage.class);
		
		objPage.addValidShippingAddressForRegisteredUser();
	}
	
	@Test(priority = 2)
	void selectShippingOption()
	{
		objPage = PageFactory.initElements(Browser.webDriver, CheckOutPage.class);
		
		objPage.selectShippingOption();
	} 
	
	@Test(priority = 3)
	void selectPaymentOption()
	{
		objPage = PageFactory.initElements(Browser.webDriver, CheckOutPage.class);
		
		objdatafile.dataFile("\\Modules\\CheckoutPage\\DataFiles\\CheckoutPage.xls", "PaymentOptions");
		
		objPage.selectPaymentOption(objdatafile.getData("PaypalExpress", "Options"));
	} 
	
	@Test(priority = 4)
	void enterPaymentDetails()
	{
		objPage = PageFactory.initElements(Browser.webDriver, CheckOutPage.class);
		
		objdatafile.dataFile("\\Modules\\CheckoutPage\\DataFiles\\CheckoutPage.xls", "CreditCardDetails");
		
		objPage.addPaymentDetails(objdatafile.getData("Visa", "CreditCardType"), objdatafile.getData("Visa", "CardHolderName"), 
				objdatafile.getData("Visa", "CardNumber"), objdatafile.getData("Visa", "CardExpDate"),
				objdatafile.getData("Visa", "CardExpYear"), objdatafile.getData("Visa", "CardCVVNumber"));
	} 
}
