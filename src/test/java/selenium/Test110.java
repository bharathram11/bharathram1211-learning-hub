package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test110
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 40, 1000);
		launchSite(driver,"https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		//waiting for home page
		wait.until(titleIs("W3Schools Tryit Editor"));
		//switch to frame and click on "tryit" button
		wait.until(frameToBeAvailableAndSwitchToIt("iframeResult"));
		wait.until(elementToBeClickable(By.tagName("button"))).click();
		//switch to alert and close
		System.out.println(wait.until(alertIsPresent()).getText());
		//close site
		closeSite(driver);
	}
}
