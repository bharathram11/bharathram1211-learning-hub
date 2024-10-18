package selenium;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test102
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, maximize browser and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		WebSiteUtility.launchSite(driver,"http://www.youtube.com");
		Thread.sleep(5000);
		//Create any type of cookie(7 types) using "Cookie.Builder" class(way-2)
	    Date today=new Date();
	    Date target=new Date(today.getTime()+(3000)); //cookie lifetime is 3 seconds
	    CookiesUtility.addNewCookieViaBuilder(driver,"session-id-time","magnitia","www.youtube.com",
	    		"/", target,true,false,"Strict"); //added a persistent cookie
		//Collect all cookies
	    System.out.println("Count of cookies is "+CookiesUtility.getCookiesCount(driver));
		List<String> cl1=CookiesUtility.getCookiesDetailsList(driver);
		for(String c:cl1)
		{
			System.out.println(c);
		}
		//waiting for 5 seconds
		Thread.sleep(5000); 
		//Collect all cookies after waiting
		System.out.println("Count of cookies is "+CookiesUtility.getCookiesCount(driver));
		List<String> cl2=CookiesUtility.getCookiesDetailsList(driver);
		for(String c:cl2)
		{
			System.out.println(c);
		}
		//Close site
		WebSiteUtility.closeSite(driver);
	}
}

