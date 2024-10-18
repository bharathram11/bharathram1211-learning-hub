package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test98
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, maximize browser and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		WebSiteUtility.launchSite(driver,"http://www.yahoomail.com");
		Thread.sleep(5000);
		System.out.println("Cookies after Launching site:");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesDetailsList(driver));
		List<String> types1=CookiesUtility.getCookiesTypes(driver,"yahoomail.com","yahoo.com");
		for(String type:types1)
		{
			System.out.println(type);
		}
		//Do login
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-username")).sendKeys("testsedt12@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("Sdet@1211,12");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		System.out.println("-------------------------------");
		System.out.println("Cookies after Login to site:");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesDetailsList(driver));
		List<String> types2=CookiesUtility.getCookiesTypes(driver,"yahoomail.com","yahoo.com");
		for(String type:types2)
		{
			System.out.println(type);
		}
		//Do logout
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		System.out.println("-------------------------------");
		System.out.println("Cookies after Logout from site:");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		System.out.println(CookiesUtility.getCookiesDetailsList(driver));
		List<String> types3=CookiesUtility.getCookiesTypes(driver,"yahoomail.com","yahoo.com");
		for(String type:types3)
		{
			System.out.println(type);
		}
		//Close site
		WebSiteUtility.closeSite(driver);
	}
}
