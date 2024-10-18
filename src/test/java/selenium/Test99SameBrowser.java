package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test99SameBrowser
{
	public static void main(String[] args) throws Exception
	{
		//Part-1
		//Open browser, maximize browser and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		WebSiteUtility.launchSite(driver,"http://www.yahoomail.com");
		Thread.sleep(5000);
		//Do login to get Mailbox table
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-username")).sendKeys("testsedt12@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("Sdet@1211,12");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		List<String>x=CookiesUtility.getCookiesDetailsList(driver);
		for(String y:x)
		{
			System.out.println(y);
		}
				
		//Part-2
		//Take new window/tab and switch to it
		BrowserWindowUtility.getNewWindoworTab(driver,"tab");
		List<String> whs=BrowserWindowUtility.getAllBrowserWindowHandlesList(driver);
		BrowserWindowUtility.switchToDesiredBrowser(driver, whs.get(1));
		WebSiteUtility.launchSite(driver, "http://www.yahoomail.com");
		Thread.sleep(5000);
		System.out.println("-----------------------------------");
		List<String>y=CookiesUtility.getCookiesDetailsList(driver);
		for(String z:y)
		{
			System.out.println(z);
		}
		try
		{
			if(driver.findElement(By.xpath("//a[@aria-label='Compose']")).isDisplayed())
			{
				System.out.print("Yahoo Login Session cookie is working for same type browser");
			}
		}
		catch(Exception ex)
		{
			System.out.print("Yahoo Login Session cookie is not working for same type browser");
		}
		//Do logout
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		driver.close();
		//Back to 1st window/tab and Do logout
		BrowserWindowUtility.switchToDesiredBrowser(driver, whs.get(0));
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
