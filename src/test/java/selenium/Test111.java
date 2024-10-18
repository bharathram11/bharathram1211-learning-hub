package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

public class Test111
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 40, 1000);
		WebSiteUtility.launchSite(driver,"http://www.gmail.com");
		//Locate and operate an element
		WebElement e=wait.until(visibilityOfElementLocated(By.name("identifier")));
		e.sendKeys("magnitiait");
		//goto next page(new DOM/page-source)
		wait.until(elementToBeClickable(
				By.xpath("//span[text()='Next']"))).click(); 
		wait.until(visibilityOfElementLocated(By.xpath("//a[@aria-label='Try again']")));
		//back to previous page(back to previous DOM/page-source)
		driver.navigate().back(); 
		//verify that element is staled or not due to DOM changes
		if(wait.until(stalenessOf(e)))
		{
			//Relocate element if that element is staled
			e=wait.until(refreshed(visibilityOfElementLocated(By.name("identifier"))));
		} 
		//Operate that element
		e.clear();
		e.sendKeys("abdulkalam");
	}
}
