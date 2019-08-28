package OrderReceipt.TestMethods;

import Classes.OrderReceiptBaseClass;
import common.Click;
import common.MyWait;
import common.VerifyElementStatus;

public class OrderReceipt extends OrderReceiptBaseClass
{
	public void clickOnContinueShopping()
	{	
		MyWait.waitTill("long", "isvisible", linkContinueShopping);
		
		Click.clickAndWait(linkContinueShopping);	
	}
}
