package Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PDPBaseClass extends TestBaseClass
{
	@FindBy(xpath = "//button[@data-test-selector='btnAddToCart']")
	protected WebElement btnAddToCart;
	
	@FindBy(xpath = "//input[@data-test-selector='txtQuantity']")
	protected WebElement txtQuantity;
}
