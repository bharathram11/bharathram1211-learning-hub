package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.BrowserWindowUtility.*;
import static utilities.WebSiteUtility.*;

public class Test136
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.gmail.com");
		//Locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                                 By.xpath("//button[text()='Forgot email?']")));
		//before right click
		String x1=e.getCssValue("color");
		System.out.println(x1);
		String x2=e.getCssValue("background-color");
		System.out.println(x2);
		//right click
		Actions act=new Actions(driver);
		act.contextClick(e).perform();
		Thread.sleep(5000);
		//after right click
		String y1=e.getCssValue("color");
		System.out.println(y1);
		String y2=e.getCssValue("background-color");
		System.out.println(y2);
		if(!x1.equals(y1) && !x2.equals(y2))
		{
			System.out.println("Test passed because of changes after right click");
		}
		else
		{
			System.out.println("Test failed due to same after right click also");
		}
		//close site
		//closeSite(driver);
	}
}