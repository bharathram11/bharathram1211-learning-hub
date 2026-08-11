package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

public class Test103ImplicitWait
{
	public static void main(String[] args) throws Exception 
	{
		//Open browser, maximize browser, define explicit wait and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome"); 
		BrowserWindowUtility.browserMaximize(driver);
		//Give implicit timeout value for entire script/program
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Launch site
		WebSiteUtility.launchSite(driver,"https://www.facebook.com");
		//do login
		driver.findElement(By.name("email")).sendKeys("adulkalam");
		driver.findElement(By.name("pass")).sendKeys("abdulkalam");
		driver.findElement(By.name("logn")).click();
		//Try another way
		driver.findElement(By.xpath("(//a[@name='tryanotherway']) | ((//a[@role='button'])[1]) |(//a[@role='button' and @name='tryanotherway'])| (//div[@role='button'])")).click();
		//This code will run successfully sometimes. In some cases, this code return an exception 
		//due inconsistency of implicitlyWait() concept.
		//WebSiteUtility.closeCurrentTab(driver);
		
	}
}







