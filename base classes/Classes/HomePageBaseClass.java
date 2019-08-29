package Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageBaseClass extends TestBaseClass
{
	@FindBy(xpath = "//img[@data-test-selector='imgProductImage']")
	protected WebElement imgProduct;
}
