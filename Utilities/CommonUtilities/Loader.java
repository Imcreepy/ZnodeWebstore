package CommonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loader {

	@FindBy(id = "loading")
	private WebElement backgroundLoader;
	
	WebDriverWait wait = new WebDriverWait(Browser.webDriver, GlobalVariables.delayHigh);
	
	public void waitForPageLoad()
	{
		try
		{
			wait.until(ExpectedConditions.invisibilityOf(backgroundLoader));
//			while(backgroundLoader.isDisplayed())
//					continue;
		}
	
		catch(NullPointerException ex)
		{
			ex.getStackTrace();
		}
		
		catch(ElementNotVisibleException ex)
		{
			ex.getStackTrace();
		}
		
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
	}
}
