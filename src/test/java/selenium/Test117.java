package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import pages.CacheLookupPage;

import static utilities.BrowserWindowUtility.*;
import static utilities.WebSiteUtility.*;

public class Test117
{
	public static void main(String[] args) throws Exception 
	{
		//Open browser, Define wait object, and launch site
		System.setProperty("webdriver.chrome.logfile", "target\\TestLog4.txt");
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.google.com");
		//create an object to page class and call method
		CacheLookupPage cp=new CacheLookupPage(driver,wait);
		System.out.println(cp.getTimeWithCacheLookup()+".seconds");
		//close site
		closeSite(driver);
	}
}
