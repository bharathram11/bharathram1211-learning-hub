package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test100differentBrowser
{
	public static void main(String[] args) throws Exception
	{
		//Part-1
		//Open browser, maximize browser and launch a site
		WebDriver driver1=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver1);
		WebSiteUtility.launchSite(driver1,"http://www.yahoomail.com");
		Thread.sleep(5000);
		//Do login to get Mailbox table
		driver1.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("login-username")).sendKeys("testsedt12@yahoo.com");
		driver1.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("login-passwd")).sendKeys("Sdet@1211,12");
		driver1.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		//Collect all cookies of chrome belongs to Yahoomail
		List<Cookie> cl=CookiesUtility.getCookiesList(driver1);
		for(Cookie x:cl)
		{
			System.out.println(x);
		}
		//Part-2
		//Take new firefox window/tab and switch to it
		WebDriver driver2=WebSiteUtility.openBrowser("firefox");
		Thread.sleep(5000);
		//add all chrome cookies to firefox
		for(Cookie c:cl)
		{
			try
			{
				driver2.manage().addCookie(c);
			}
			catch(Exception ex)
			{
			}
		}
		WebSiteUtility.launchSite(driver2, "http://www.yahoomail.com");
		Thread.sleep(5000);
		System.out.println("-------------------------");
		List<Cookie> bl=CookiesUtility.getCookiesList(driver2);
		for(Cookie x:bl)
		{
			System.out.println(x);
		}
		try
		{
			if(driver2.findElement(By.xpath("//a[@aria-label='Compose']")).isDisplayed())
			{
				System.out.print(
					"Yahoo Login Session cookie is working for different type browsers");
				//Do logout in firefox
				driver2.findElement(By.id("ybarAccountMenuOpener")).click();
				Thread.sleep(5000);
				driver2.findElement(By.id("profile-signout-link")).click();
				Thread.sleep(5000);
			}
		}
		catch(Exception ex)
		{
			System.out.print(
				"Yahoo Login Session cookie is not working for different type browsers");
		}
		driver2.close();
		//Do logout in chrome
		driver1.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		driver1.close();
		driver1.quit();
	}
}
