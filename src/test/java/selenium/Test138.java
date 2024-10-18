package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.BrowserWindowUtility.*;
import static utilities.WebSiteUtility.*;

public class Test138
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.w3schools.com/css/tryit.asp?filename=trycss_before");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
		//Locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                         By.xpath("(//h1[text()='This is a heading'])[1]")));
		String x=(String) ((JavascriptExecutor) driver).executeScript(
				"var ps=window.getComputedStyle(arguments[0],'::before');" + 
				"var s=ps.getPropertyValue('content');" + 
				"return(s);",e);
		System.out.println(x);
		driver.switchTo().defaultContent();
		//close site
		//closeSite(driver);
	}
}