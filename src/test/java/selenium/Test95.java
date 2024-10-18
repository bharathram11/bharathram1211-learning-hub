package selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test95
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriver driver=WebSiteUtility.openBrowser("edge");
		BrowserWindowUtility.browserMaximize(driver);
		//Launch site
		WebSiteUtility.launchSite(driver, "http://www.flipkart.com");
		Thread.sleep(5000);
		//Get cookies and display details
		List<String> results1=CookiesUtility.getCookiesDetailsList(driver);
		System.out.println(results1.size());
		for(String result:results1)
		{
			System.out.println(result);
		}
		//Display types of cookies(if no super domain to our site, just give "null")  
		List<String> results2=CookiesUtility.getCookiesTypes(driver, "flipkart.com", null);   //there is no .in domain for flipkart
		for(String result:results2)
		{
			System.out.println(result);
		}
		//Close site
		WebSiteUtility.closeSite(driver);
	}
}
