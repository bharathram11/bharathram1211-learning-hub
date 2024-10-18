package selenium;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test126
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site  //clear method intro
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.gmail.com"); 
		//fill an element
		wait.until(visibilityOfElementLocated(By.name("identifier"))).sendKeys("magnitiait");
		Thread.sleep(5000);
		//clear data in an element
		wait.until(visibilityOfElementLocated(By.name("identifier"))).clear();	
	}
}
