package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Test120
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver,"https://www.magnitia.com/");
		//Challenge-3: our target element is covered by another element like banner.
		//So, target element is not clickable and we get "ElementClickInterceptedException"
		wait.until(visibilityOfElementLocated(By.partialLinkText("About Us"))).click();
	}
}
