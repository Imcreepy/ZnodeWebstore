package OrderReceipt.TestMethods;

import Classes.OrderReceiptBaseClass;
import Common.Click;
import Common.VerifyElementStatus;

public class OrderReceipt extends OrderReceiptBaseClass{

	public void clickOnContinueShopping()
	{	
		VerifyElementStatus.isElementVisible(linkContinueShopping);
		
		Click.clickAndWait(linkContinueShopping);	
	}
}
