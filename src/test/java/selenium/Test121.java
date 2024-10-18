package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

public class Test121
{
	public static void main(String[] args) throws Exception
	{
		//Open broWebSiteUtilityer, Define wait object, and launch site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver,"http://www.facebook.com"); 
		//fill userID field
		wait.until(visibilityOfElementLocated(By.name("email"))).sendKeys("abdul");
		//Fill password and click on sign-in button via keyboard automation
		wait.until(visibilityOfElementLocated(By.name("email")))
	       .sendKeys(Keys.TAB,"kalam",Keys.TAB,Keys.TAB,Keys.ENTER);
	}
}








