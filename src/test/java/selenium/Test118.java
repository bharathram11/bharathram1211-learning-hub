package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Test118
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 30, 1000);
		WebSiteUtility.launchSite(driver,"http://www.gmail.com"); 
		//Challenge-1: element found in Page source but not present on page.
		//So, we get "ElementNotInteractableException" when we click on hidden element.
		WebElement e=wait.until(presenceOfElementLocated(By.xpath("//input[@type='password']")));
		e.click();
	}
}
