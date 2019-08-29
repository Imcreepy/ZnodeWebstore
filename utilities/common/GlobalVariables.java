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
	
	// Login Page Credentials Sheet Keys
	public static final String KeyStoreUserEmail = "StoreUser";
	public static final String KeyStoreUserPassword = "StoreUserPassword";
	public static final String KeyB2BUserEmail = "B2BUser";
	public static final String KeyB2BUserPassword = "B2BUserPassword";
	public static final String KeyAdminUserEmail = "AdminUser";
	public static final String KeyAdminUserPassword = "AdminUserPassword";

	//Checkout Page Data File (Excel) path and its sheets name
	public static final String CheckoutPageDataFilePath = "\\Modules\\CheckoutPage\\DataFiles\\CheckoutPage.xlsx";
	public static final String AddressSheet = "Address";
	public static final String PaymentOptionsSheet = "PaymentOptions";
	public static final String ShippingOptionsSheet = "ShippingOptions";
	public static final String CreditCardDetailsSheet = "CreditCardDetails";
	
	//Checkout Page Address Sheet Keys
	public static final String KeyShippingDisplayName = "ShippingDisplayName";
	public static final String KeyShippingFirstName = "ShippingFirstName";
	public static final String KeyShippingLastName = "ShippingLastName";
	public static final String KeyShippingStreetAddress1 = "ShippingStreetAddress1";
	public static final String KeyShippingStreetAddress2 = "ShippingStreetAddress2";
	public static final String KeyShippingPhoneNumber = "ShippingPhoneNumber";
	public static final String KeyShippingCompanyName = "ShippingCompanyName";
	public static final String KeyShippingCity = "ShippingCity";
	public static final String KeyShippingState = "ShippingState";
	public static final String KeyShippingStateCode = "ShippingStateCode";
	public static final String KeyShippingPostalCode = "ShippingPostalCode";
	public static final String KeyShippingCountry = "ShippingCountry";
	public static final String KeyShippingCountryCode = "ShippingCountryCode";
	public static final String KeyBillingDisplayName = "BillingDisplayName";
	public static final String KeyBillingFirstName = "BillingFirstName";
	public static final String KeyBillingLastName = "BillingLastName";
	public static final String KeyBillingStreetAddress1 = "BillingStreetAddress1";
	public static final String KeyBillingStreetAddress2 = "BillingStreetAddress2";
	public static final String KeyBillingPhoneNumber = "BillingPhoneNumber";
	public static final String KeyBillingCompanyName = "BillingCompanyName";
	public static final String KeyBillingCity = "BillingCity";
	public static final String KeyBillingState = "BillingState";
	public static final String KeyBillingStateCode = "BillingStateCode";
	public static final String KeyBillingPostalCode = "BillingPostalCode";
	public static final String KeyBillingCountry = "BillingCountry";
	public static final String KeyBillingCountryCode = "BillingCountryCode";
	
	// Checkout Page PaymentOptions Sheet Keys
	public static final String KeyCOD = "COD";
	public static final String KeyCashOnDelivery = "CashOnDelivery";
	public static final String KeyPaypalExpress = "PaypalExpress";
	public static final String KeyPayflow = "Payflow";
	public static final String KeyWorldPay = "WorldPay";
	public static final String KeyPurchaseOrder = "PurchaseOrder";
	public static final String KeyBraintree = "Braintree";
	
	// Checkout Page CreditCardDetails Sheet Keys
	public static final String KeyVisaCreditCardType = "VisaCreditCardType";
	public static final String KeyVisaCardHolderName = "VisaCardHolderName";
	public static final String KeyVisaCardNumber = "VisaCardNumber";
	public static final String KeyVisaCardExpDate = "VisaCardExpDate";
	public static final String KeyVisaCardExpYear = "VisaCardExpYear";
	public static final String KeyVisaCardCVVNumber = "VisaCardCVVNumber";
	public static final String KeyMasterCardCreditCardType = "MasterCardCreditCardType";
	public static final String KeyMasterCardCardHolderName = "MasterCardCardHolderName";
	public static final String KeyMasterCardCardNumber = "MasterCardCardNumber";
	public static final String KeyMasterCardCardExpDate = "MasterCardCardExpDate";
	public static final String KeyMasterCardCardExpYear = "MasterCardCardExpYear";
	public static final String KeyMasterCardCardCVVNumber = "MasterCardCardCVVNumber";
	public static final String KeyAmericanExpressCreditCardType = "AmericanExpressCreditCardType";
	public static final String KeyAmericanExpressCardHolderName = "AmericanExpressCardHolderName";
	public static final String KeyAmericanExpressCardNumber = "AmericanExpressCardNumber";
	public static final String KeyAmericanExpressCardExpDate = "AmericanExpressCardExpDate";
	public static final String KeyAmericanExpressCardExpYear = "AmericanExpressCardExpYear";
	public static final String KeyAmericanExpressCVVNumber = "AmericanExpressCVVNumber";
	public static final String KeyDiscoverCreditCardType = "DiscoverCreditCardType";
	public static final String KeyDiscoverCardHolderName = "DiscoverCardHolderName";
	public static final String KeyDiscoverCardNumber = "DiscoverCardNumber";
	public static final String KeyDiscoverCardExpDate = "DiscoverCardExpDate";
	public static final String KeyDiscoverCardExpYear = "DiscoverCardExpYear";
	public static final String KeyDiscoverCVVNumber = "DiscoverCVVNumber";
}
