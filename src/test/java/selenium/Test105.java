package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//to minimize the length of the code, we have to import static     .*
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test105
{
	public static void main(String[] args) throws Exception
	{
		
		//WebDriver driver=WebSiteUtility.openBrowser("chrome");
		WebDriver driver=openBrowser("chrome");
		
		//BrowserWindowUtility.browserMaximize(driver);
		browserMaximize(driver);
		
		//FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 40, 1000);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 40, 1000);
		
		//WebSiteUtility.launchSite(driver, "http://www.gmail.com");
		launchSite(driver,"http://www.gmail.com");
		
		//waiting for home page
		ExpectedCondition<Boolean> ec1=titleIs("Gmail");
		ExpectedCondition<Boolean> ec2=urlContains("https");
		wait.until(and(ec1,ec2));
		
		//Do login and then close site
		wait.until(visibilityOfElementLocated(By.name("identifier"))).sendKeys("magnitiait");
		wait.until(elementToBeClickable(By.xpath("//*[text()='Next']/parent::*"))).click();
		
	}
}
