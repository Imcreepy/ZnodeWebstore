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
				setText(displayName, mapdatafile.get("ShippingDisplayName"));
				
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
		
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private void addShippingAddress()
	{
		try
		{
			setText(txtAddressFirstname, mapdatafile.get("ShippingFirstName"));
			
			setText(txtAddressLastname, mapdatafile.get("ShippingLastName"));
			
			setText(txtAddressStreet1, mapdatafile.get("ShippingStreetAddress1"));
			
			setText(txtPhoneNumber, mapdatafile.get("ShippingPhoneNumber"));
			
			setText(txtCompanyName, mapdatafile.get("ShippingCompanyName"));
			
			setText(txtCityName, mapdatafile.get("ShippingCity"));
			
			selectOptionByName(drpState, mapdatafile.get("ShippingState"));
			
			selectOptionByName(drpCountryName, mapdatafile.get("ShippingCountry"));
			
			setText(txtPostalCode, mapdatafile.get("ShippingPostalCode"));
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
		waitForElementToBeInvisible(loadingShippingOptions);

//		VerifyElementStatus.isElementNotVisible(GlobalVariables.FindByXpath, GlobalVariables.Loader);
			
		clickAndWait(chkShippingOption);
	}
	
	public void selectPaymentOption(String paymentOption)
	{
		mapdatafile = setDataFile(GlobalVariables.CheckoutPageDataFilePath, GlobalVariables.PaymentOptionsSheet);
		
		VerifyElementStatus.isElementNotVisible(GlobalVariables.FindByXpath, GlobalVariables.Loader);
		
		scrollToElement(chkPaymentOption_WORLDPAY);
		
		if (paymentOption.equalsIgnoreCase(mapdatafile.get("COD")))
			clickAndWait(chkPaymentOption_COD);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get("PaypalExpress")))
			clickAndWait(chkPaymentOption_PAYPAL);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get("Braintree")))
			clickAndWait(chkPaymentOption_BRAINTREE);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get("Payflow")))
			clickAndWait(chkPaymentOption_PAYFLOW);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get("WorldPay")))
			clickAndWait(chkPaymentOption_WORLDPAY);
		
		else if (paymentOption.equalsIgnoreCase(mapdatafile.get("PurchaseOrder")))
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
