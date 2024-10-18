package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.BrowserWindowUtility.*;
import static utilities.WebSiteUtility.*;

public class Test134
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.google.co.in");
		//Locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		//get details before focus
		String x=e.getCssValue("text-decoration");
		System.out.println(x);
		//get focus
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(5000);
		//get details after focus
		String y=e.getCssValue("text-decoration");
		System.out.println(y);
		if(y.contains("underline"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed due to no underline");
		}
		//close site
		closeSite(driver);
	}
}
