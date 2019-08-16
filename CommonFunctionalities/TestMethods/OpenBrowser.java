package TestMethods;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonUtilities.Browser;

public class OpenBrowser {

	@Test(priority=0)
	@Parameters({"browser","url"})
	public void openBrowser(String browser, String url)
	{	
		CommonUtilities.Browser.openBrowser(browser, url);
		System.out.println("browser opened");
		Browser.maximizeBrowser();
	}// End of Open browser test
}
