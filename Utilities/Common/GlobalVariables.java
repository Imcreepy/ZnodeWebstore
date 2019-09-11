package common;

public class GlobalVariables 
{
	//Delay time
	public static final int delayVeryLow = 2;
	public static final int delayLow = 5;
	public static final int delayMedium = 10;
	public static final int delayHigh = 15;
	public static final int delayVeryHigh = 20;
	public static final int pageLoadingTime = 40;
	
	// Locators or Objects Find By operators
	public static final String FindByXpath = "xpath";
	public static final String FindById = "id";
	
	// Objects xpath
	public static final String Loader = "//div[@id='loading']";

	//Login Page Data File (Excel) sheets name
	public static final String loginPageDataFilePath = "\\Modules\\Login\\DataFiles\\Login.xlsx";
	public static final String LoginCredentials = "Credentials";
	
	//Checkout Page Data File (Excel) path and its sheets name
	public static final String CheckoutPageDataFilePath = "\\Modules\\CheckoutPage\\DataFiles\\CheckoutPage.xlsx";
	public static final String AddressSheet = "Address";
	public static final String PaymentOptionsSheet = "PaymentOptions";
	public static final String ShippingOptionsSheet = "ShippingOptions";
	public static final String CreditCardDetailsSheet = "CreditCardDetails";
	
}
