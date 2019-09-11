package Login.TestMethods;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CheckoutPage.TestMethods.AddAddress;
import Classes.TestBaseClass;
import CreateAnAccount.TestMethods.CreateAnAccount;
import driver.DriverManager;

public class LoginPage extends TestBaseClass 
{
	@FindBy(xpath = "//a[@data-test-selector='linkLoginLink']")
	@CacheLookup
	private WebElement linkLogin;
	
	@FindBy(xpath = "//input[@data-test-selector='txtUserName']")
	@CacheLookup
	private WebElement inputUserName;
	
	@FindBy(xpath = "//input[@data-test-selector='txtLoginPassword']")
	@CacheLookup
	private WebElement inputPassword;
	
	@FindBy(xpath = "//button[@data-test-selector='btnLoginButton']")
	@CacheLookup
	private WebElement buttonLogin;
	
	@FindBy(xpath = "//*[@id='messageBoxContainerId']")
	@CacheLookup
	private WebElement messageBoxContainer;
	
	@FindBy(className = "zf-checkout")
	@CacheLookup
	private WebElement linkCheckoutAsGuest;
	
	Logger logger = Logger.getLogger(LoginPage.class); 
	
	public void GoToLoginPage()
	{
		try
		{
			clickAndWait(linkLogin);
			logger.info("Clicked on login link");
		}
		
		catch (ElementClickInterceptedException ex)
		{
			logger.error("Unable to click on login link");
		}
		
		catch (ElementNotInteractableException ex)
		{
			logger.error("login link is not interactable");
		}
		
		catch (Exception ex)
		{
			logger.error("Something went wrong while clicking on login link");
		}
	}
	
	public void login(String userName, String password)
	{
		try
		{
			setText(inputUserName, userName);
			logger.info("Username entered successfully");
			
			setText(inputPassword, password);
			logger.info("Password entered successfully");
			
			clickAndWait(buttonLogin);
			logger.info("Clicked on login button");
			
			if(DriverManager.getDriver().webDriver.findElements(By.id("messageBoxContainerId")).size() == 1)
			{
				CreateAnAccount createAnAccount = PageFactory.initElements(DriverManager.getDriver().webDriver, CreateAnAccount.class);
				
				createAnAccount.createNewAccount(userName, password);
			}
		}
		
		catch (NullPointerException ex)
		{
			logger.error("Getting null values");
			ex.getMessage();
		}
		
		catch (ElementNotVisibleException ex)
		{
			logger.error("Element is not visible");
			ex.getMessage();
		}
		
		catch (NoSuchElementException ex)
		{
			logger.error("messageBoxContainerId is not visible");
			ex.getMessage();
		}
	}
	
	public void clickCheckoutAsGuest()
	{
		clickAndWait(linkCheckoutAsGuest);
		logger.info("Clicked on Checkout as a guest link");
	}
}
