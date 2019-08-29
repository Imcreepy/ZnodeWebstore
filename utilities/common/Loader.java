package common;

import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import driver.DriverManager;

public class Loader {

	@FindBy(xpath = "//*[@id='loading']")
	private WebElement backgroundLoader;
	
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver().webDriver;
	
	public void waitForPageLoad()
	{
		try 
		{
			for(int index=0;index<40;index++) 
			{
				String loader= (String) js.executeScript("return $('#loading').attr('style')");
				
				if(loader=="display: none;") 
				{
					break;
				}
				
				else
				{
					MyWait.waitFor(1, "sec");
				}
			}
//			MyWait.waitTill("short", "isvisible", backgroundLoader);
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
