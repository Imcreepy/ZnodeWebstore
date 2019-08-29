package CheckoutPage.TestMethods;

import java.util.Map;
import java.util.NoSuchElementException;
import org.openqa.selenium.ElementNotVisibleException;
import Classes.CheckOutBaseClass;
import common.GlobalVariables;
import common.MyWait;
import common.VerifyElementStatus;

public class CheckOutPage extends CheckOutBaseClass 
{
	Map<String, String> mapdatafile;
	
	public void addShippingAddrForRegUser()
	{
		
		try
		{
			mapdatafile = setDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.AddressSheet);
			
			if (displayName.isDisplayed())
			{
				setText(displayName, mapdatafile.get(GlobalVariables.KeyShippingDisplayName));
				
				addShippingAddress();
				
				clickAndWait(btnSaveAddress);
			}
		}
		
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
		
		catch (NoSuchElementException ex)
		{
			ex.printStackTrace();
		}
		
		catch (ElementNotVisibleException ex)
		{
			ex.printStackTrace();
		}
	}
	
	private void addShippingAddress()
	{
		try
		{
			setText(txtAddressFirstname, mapdatafile.get(GlobalVariables.KeyShippingFirstName));
			
			setText(txtAddressLastname, mapdatafile.get(GlobalVariables.KeyShippingLastName));
			
			setText(txtAddressStreet1, mapdatafile.get(GlobalVariables.KeyShippingStreetAddress1));
			
			setText(txtPhoneNumber, mapdatafile.get(GlobalVariables.KeyShippingPhoneNumber));
			
			setText(txtCompanyName, mapdatafile.get(GlobalVariables.KeyShippingCompanyName));
			
			setText(txtCityName, mapdatafile.get(GlobalVariables.KeyShippingCity));
			
			selectOptionByName(drpState, mapdatafile.get(GlobalVariables.KeyShippingState));
			
			selectOptionByName(drpCountryName, mapdatafile.get(GlobalVariables.KeyShippingCountry));
			
			setText(txtPostalCode, mapdatafile.get(GlobalVariables.KeyShippingPostalCode));
		}
		
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
		
		catch (NoSuchElementException ex)
		{
			ex.printStackTrace();
		}
		
		catch (ElementNotVisibleException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void selectShippingOption()
	{
		VerifyElementStatus.isElementNotVisible(loadingShippingOptions);
		
		VerifyElementStatus.isElementNotVisible(GlobalVariables.FindByXpath, GlobalVariables.Loader);
			
		clickAndWait(chkShippingOption);
	}
	
	public void selectPaymentOption(String paymentOption)
	{
		mapdatafile = setDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.PaymentOptionsSheet);
		
		VerifyElementStatus.isElementNotVisible(GlobalVariables.FindByXpath, GlobalVariables.Loader);
		
		scrollToElement(chkPaymentOption_WORLDPAY);
		
		if (paymentOption.equalsIgnoreCase(mapdatafile.get(GlobalVariables.KeyCOD)))
			clickAndWait(chkPaymentOption_COD);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get(GlobalVariables.KeyPaypalExpress)))
			clickAndWait(chkPaymentOption_PAYPAL);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get(GlobalVariables.KeyBraintree)))
			clickAndWait(chkPaymentOption_BRAINTREE);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get(GlobalVariables.KeyPayflow)))
			clickAndWait(chkPaymentOption_PAYFLOW);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get(GlobalVariables.KeyWorldPay)))
			clickAndWait(chkPaymentOption_WORLDPAY);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get(GlobalVariables.KeyPurchaseOrder)))
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
	
	public void clickOnPlaceOrderButton()
	{
		scrollToElement(btnPlaceOrder);
		
		clickAndWait(btnPlaceOrder);
	}
	
}
