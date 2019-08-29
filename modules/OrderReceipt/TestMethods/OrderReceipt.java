package OrderReceipt.TestMethods;

import Classes.OrderReceiptBaseClass;
import common.MyWait;

public class OrderReceipt extends OrderReceiptBaseClass
{
	public void clickOnContinueShopping()
	{	
		MyWait.waitTill("verylong", "isvisible", linkContinueShopping);
		
		clickAndWait(linkContinueShopping);	
	}
}
