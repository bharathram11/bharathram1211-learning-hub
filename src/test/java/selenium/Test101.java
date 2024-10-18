package selenium;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test101
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, maximize browser and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		WebSiteUtility.launchSite(driver,"https://www.google.com"); 
		Thread.sleep(5000);
		//Create any type of cookie(7 types) and add to the current WebDriver's cookies(way-1)
               String cookieName="session-id";
               String cookieValue="12345";
               String domain="google.com";
               String path="/"; //fixed value
               Date expiryDate=null; // Session cookie, no expiration date
               boolean isSecure=false;
               boolean isHttpOnly=true;
               String sameSite="Lax"; //either "Strict" or "Lax"
               CookiesUtility.addNewCookie(driver, cookieName, cookieValue, domain, path, expiryDate, 
        		                                   isSecure, isHttpOnly, sameSite);
		System.out.println("Count of cookies is "+CookiesUtility.getCookiesCount(driver));
		//Collect all loaded cookies along with added cookie
		List<String> cl=CookiesUtility.getCookiesDetailsList(driver);
		for(String c:cl)
		{
			System.out.println(c);
		}
		//Get specific cookie using cookie's name
		String x=CookiesUtility.getCookieByName(driver, "session-id");
		System.out.println(x);
		System.out.println("--------------------------");
		//Delete specific cookie using Cookie class's object
		CookiesUtility.deleteCookieByIndex(driver, 1); //delete 2nd cookie
		List<String> bl=CookiesUtility.getCookiesDetailsList(driver);
		for(String c:bl)
		{
			System.out.println(c);
		}
		System.out.println("Count of cookies After deleting by index "+CookiesUtility.getCookiesCount(driver));

		System.out.println("--------------------------");

		//Delete specific cookie using name
		CookiesUtility.deleteCookieByName(driver, "OGPC");
		List<String> cd=CookiesUtility.getCookiesDetailsList(driver);
		for(String c:cd)
		{
			System.out.println(c);
		}
		System.out.println("Count of cookies After deleting by name "+CookiesUtility.getCookiesCount(driver));

		System.out.println("--------------------------");

		//delete all cookies
		CookiesUtility.deleteCookies(driver);
		System.out.println("Count of cookies after deleteCookies "+CookiesUtility.getCookiesCount(driver));

		//Close site
		WebSiteUtility.closeSite(driver);
	}
}

