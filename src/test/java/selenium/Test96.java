package selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test96
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, maximize browser and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		System.out.println("Cookies after open browser:");
		System.out.println(CookiesUtility.getCookiesCount(driver)); //0
		WebSiteUtility.launchSite(driver,"http://www.facebook.com");
		Thread.sleep(5000);
		System.out.println("-------------------------------");
		System.out.println("Cookies after Launching site:");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		List<String> details=CookiesUtility.getCookiesDetailsList(driver);
		for(String detail:details)
		{
			System.out.println(detail);
		}
		System.out.println();
		//No super domain to "facebook.com", so we used null for super domain
		List<String> types=CookiesUtility.getCookiesTypes(driver,"facebook.com",null);
		for(String type:types)
		{
			System.out.println(type);
		}
		//Close site
		WebSiteUtility.closeSite(driver);
	}
}
