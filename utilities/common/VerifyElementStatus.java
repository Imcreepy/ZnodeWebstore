package common;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverManager;

public class VerifyElementStatus {

	static WebDriverWait wait = new WebDriverWait(DriverManager.getDriver().webDriver, GlobalVariables.delayHigh);
	
	// To verify that element is present on web page using locator
	public static void isElementPresent(String condition, String locator)
	{
		try
		{
			switch (condition)
			{
				case "xpath":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
					break;
					
				case "id":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
					break;
					
				case "name":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));
					break;
					
				case "class":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
					break;
					
				default:
					System.out.println("No Such Element Found.............");
					break;
			}
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getMessage();
		}
		
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	
	// To verify that element is visible on web page using locator
	public static void isElementVisible(String condition, String locator)
	{
		try
		{
			switch (condition)
			{
				case "xpath":
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
					break;
					
				case "id":
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
					break;
					
				case "name":
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
					break;
					
				case "class":
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
					break;
					
				default:
					System.out.println("No Such Element Found.............");
					break;
			}
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getMessage();
		}
		
		catch (ElementNotVisibleException ex) 
		{
			ex.getMessage();
		}
		
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	
	// To verify that element is visible on web page using WebElement
	public static void isElementVisible(WebElement element)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));	
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getMessage();
		}
		
		catch (ElementNotVisibleException ex) 
		{
			ex.getMessage();
		}
		
		catch (StaleElementReferenceException ex) 
		{
			ex.getMessage();
		}
		
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	
	// To verify that element is clickable on web page using locator
	public static void isElementClickable(String condition, String locator)
	{
		try
		{
			switch (condition)
			{
				case "xpath":
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
					break;
					
				case "id":
					wait.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
					break;
					
				case "name":
					wait.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
					break;
					
				case "class":
					wait.until(ExpectedConditions.elementToBeClickable(By.className(locator)));
					break;
					
				default:
					System.out.println("No Such Element Found.............");
					break;
			}
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getMessage();
		}
		
		catch (ElementNotVisibleException ex) 
		{
			ex.getMessage();
		}
		
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	
	// To verify that element is clickable on web page using WebElement
		public static void isElementClickable(WebElement element)
		{
			try
			{
				wait.until(ExpectedConditions.elementToBeClickable(element));
			}
			
			catch(NoSuchElementException ex)
			{
				ex.getMessage();
			}
			
			catch (ElementNotVisibleException ex) 
			{
				ex.getMessage();
			}
			
			catch(Exception ex)
			{
				ex.getMessage();
			}
		}
	
		// To verify that element is clickable on web page using Locator
	public static void isElementNotVisible(String condition, String locator)
	{
		try
		{
			switch (condition)
			{
				case "xpath":
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
					break;
					
				case "id":
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(locator)));
					break;
					
				case "name":
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(locator)));
					break;
					
				case "class":
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(locator)));
					break;
					
				default:
					System.out.println("No Such Element Found.............");
					break;
			}
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getMessage();
		}
		
		catch (ElementNotVisibleException ex) 
		{
			ex.getMessage();
		}
		
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
	
	// To verify that element is clickable on web page using WebElement
	public static void isElementNotVisible(WebElement element)
	{
		try
		{
			wait.until(ExpectedConditions.invisibilityOf(element));
		}
		
		catch(NoSuchElementException ex)
		{
			ex.getMessage();
		}
		
		catch (ElementNotVisibleException ex) 
		{
			ex.getMessage();
		}
		
		catch(Exception ex)
		{
			ex.getMessage();
		}
	}
}
