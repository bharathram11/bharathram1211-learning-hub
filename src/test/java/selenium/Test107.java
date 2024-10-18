package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test107
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 40, 1000);
		launchSite(driver,"https://www.google.co.in");
		//Define wait conditions
		ExpectedCondition<WebElement> ec1=elementToBeClickable(By.name("q"));
		ExpectedCondition<WebElement> ec2=elementToBeClickable(By.linkText("Gmail"));
		ExpectedCondition<Boolean> ec3=titleContains("Google");
		ExpectedCondition<Boolean> ec4=urlContains("https");
		wait.until(and(ec1,ec2,ec3,ec4)); //wait until all conditions should be true
		//close site
		closeSite(driver);
	}
}
