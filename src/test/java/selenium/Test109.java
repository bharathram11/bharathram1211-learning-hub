package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test109
{
	public static void main(String[] args)
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 40, 1000);
		launchSite(driver,"https://www.google.co.in");
		//Define wait conditions
		ExpectedCondition<Boolean> ec=invisibilityOfElementLocated(By.name("q"));
		wait.until(not(ec)); //wait until given condition is false
		//close site
		closeSite(driver);
	}
}
