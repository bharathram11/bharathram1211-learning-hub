package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

public class Test103ExplicitWait
{
	public static void main(String[] args) throws Exception 
	{
		//Open browser, maximize browser, define explicit wait and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome"); 
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> w=WebSiteUtility.defineExplicitWait(driver,20,1000);
		WebSiteUtility.launchSite(driver,"https://www.facebook.com");
		//do login and give wait condition for every element separately
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("abdul");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass"))).sendKeys("kalam");
		w.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
		try
		{
			w.until(ExpectedConditions.textToBe(By.name("tryanotherway"),"Try another way"));
			System.out.println("Test passed");
			w.until(ExpectedConditions.elementToBeClickable(By.name("tryanotherway"))).click();
		}
		catch(TimeoutException e)
		{
			System.out.println("Test failed");
		}
		//close site
		WebSiteUtility.closeSite(driver);
	}
}







