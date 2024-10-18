package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.BrowserWindowUtility.*;
import static utilities.WebSiteUtility.*;

public class Test137
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
		//Move focus to "Forgot email" button via tabs
		driver.findElement(By.id("identifierId")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		//after focus
		String y1=e.getCssValue("color");
		System.out.println(y1);
		String y2=e.getCssValue("background-color");
		System.out.println(y2);
		//border is coming as pseudo-element
		String y3=(String) ((ChromiumDriver) driver).executeScript(
				"var ps=window.getComputedStyle(arguments[0],'::after');" + 
				"var s=ps.getPropertyValue('color');" + 
				"return(s);",e);
		System.out.println(y3);
		//close site
		closeSite(driver);
	}
}