package CheckoutPage.TestMethods;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import Classes.CheckOutBaseClass;
import common.Click;
import common.GlobalVariables;
import common.MyWait;
import common.VerifyElementStatus;
import driver.DriverManager;

public class CheckOutPage extends CheckOutBaseClass 
{
	public void addShippingAddrForRegUser()
	{
		try
		{
			setDataFile(dataFilePath, "Address");
			
			if (displayName.isDisplayed())
			{
				setText(displayName, getData("DisplayName", "ValidShippingAddress"));
				
				addShippingAddress();
				
				Click.clickAndWait(btnSaveAddress);
			}
		}
		
		catch (NullPointerException ex)
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
		setText(txtAddressFirstname, getData("FirstName", "ValidShippingAddress"));
		
		setText(txtAddressLastname, getData("LastName", "ValidShippingAddress"));
		
		setText(txtAddressStreet1, getData("StreetAddress1", "ValidShippingAddress"));
		
		setText(txtPhoneNumber, getData("PhoneNumber", "ValidShippingAddress"));
		
		setText(txtCompanyName, getData("CompanyName", "ValidShippingAddress"));
		
		setText(txtCityName, getData("City", "ValidShippingAddress"));
		
		select.selectOptionByName(drpState, getData("State", "ValidShippingAddress"));
		
		select.selectOptionByName(drpCountryName, getData("Country", "ValidShippingAddress"));
		
		setText(txtPostalCode, getData("PostalCode", "ValidShippingAddress"));
	}
	
	public void selectShippingOption()
	{
		VerifyElementStatus.isElementNotVisible("xpath", "//div[@id='loading']");
		
		MyWait.waitTill("verylong", "isvisible", chkShippingOption);
			
		Click.clickAndWait(chkShippingOption);
	}
	
	public void selectPaymentOption(String paymentOption)
	{
		VerifyElementStatus.isElementNotVisible("xpath", "//div[@id='loading']");
		
		setDataFile(dataFilePath, "PaymentOptions");
		
		scrollToElement(chkPaymentOption_WORLDPAY);
		
		if (paymentOption.equalsIgnoreCase(getData("COD", "Options")))
			Click.clickAndWait(chkPaymentOption_COD);
		
		else if (paymentOption.equalsIgnoreCase(getData("PaypalExpress", "Options")))
			Click.clickAndWait(chkPaymentOption_PAYPAL);
		
		else if (paymentOption.equalsIgnoreCase(getData("Braintree", "Options")))
			Click.clickAndWait(chkPaymentOption_BRAINTREE);
		
		else if (paymentOption.equalsIgnoreCase(getData("Payflow", "Options")))
			Click.clickAndWait(chkPaymentOption_PAYFLOW);
		
		else if (paymentOption.equalsIgnoreCase(getData("WorldPay", "Options")))
			Click.clickAndWait(chkPaymentOption_WORLDPAY);
		
		else if (paymentOption.equalsIgnoreCase(getData("PurchaseOrder", "Options")))
			Click.clickAndWait(chkPaymentOption_PO);
	}
	
	public void addPaymentDetails(String cardType, String holderName, String CCNumber, String CCExpMonth, String CCExpYear, String CVV)
	{
//		WebElement cardOption = Browser.webDriver.findElement(By.xpath("//input[@value='"+cardType.toUpperCase()+"']/parent::label[@class='input-radio_label']"));
		
		MyWait.getDriverWait(GlobalVariables.delayVeryLow);
		
//		Click.clickAndWait(cardOption);

		setText(txtCardHolderName, holderName);
		
		setText(txtCreditCardNumber, CCNumber);
		
		setText(txtCreditCardExpMonth, CCExpMonth);
		
		setText(txtCreditCardExpYear, CCExpYear);
		
		setText(txtCreditCardCVVNumber, CVV);
	}
	
	public void clickOnPlaceOrderButton()
	{
		scrollToElement(btnPlaceOrder);
		
		Click.clickAndWait(btnPlaceOrder);
	}
	
}
