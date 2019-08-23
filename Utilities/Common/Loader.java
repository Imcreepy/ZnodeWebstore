package Common;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.DriverManager;

public class Loader {

	@FindBy(xpath = "//div[@id='loading']")
	private WebElement backgroundLoader;
	
	WebDriverWait wait = new WebDriverWait(DriverManager.getDriver().webDriver, GlobalVariables.delayHigh);
	
	
	public void waitForPageLoad()
	{
		Boolean loader = null;
		
		try 
		{
			for(int i =1; i < 40; i++)
			{
				loader = wait.until(ExpectedConditions.invisibilityOf(backgroundLoader));
				
				if(loader == false)
					wait.wait(1000);
				
				else
					break;
			}
		}
	
		catch(NullPointerException ex)
		{
			ex.getStackTrace();
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getStackTrace();
		}
		
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
	}
}
