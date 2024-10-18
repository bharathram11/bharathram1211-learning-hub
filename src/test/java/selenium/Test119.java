package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Test119
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver,
				"https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		//Challenge-2: element found in page source and present on page but disabled.
		//So, no reaction and no exception
		wait.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		wait.until(visibilityOfElementLocated(By.name("lname"))).click();
	}
}