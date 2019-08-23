package Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrderReceiptBaseClass extends TestBaseClass{

	@FindBy(xpath = "//a[text()='Continue shopping']")
	protected WebElement linkContinueShopping;
}
