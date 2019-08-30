package OrderReceipt.TestMethods;

import Classes.OrderReceiptBaseClass;
import common.MyWait;
import common.VerifyElementStatus;

public class OrderReceipt extends OrderReceiptBaseClass
{
	public void clickOnContinueShopping()
	{	
		waitForElementToBeVisible(linkContinueShopping);
		
		clickAndWait(linkContinueShopping);	
	}
}
