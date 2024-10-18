package selenium;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test131 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.facebook.com/");
		//Get accessible name of an element, which developed using HTML with ARIA
		String x=wait.until(visibilityOfElementLocated(By.name("email"))).getAccessibleName();
		System.out.println(x);
		//Get aria role of an element
		String y=wait.until(visibilityOfElementLocated(By.name("email"))).getAriaRole();
		System.out.println(y);
		String z=wait.until(visibilityOfElementLocated(By.name("email"))).getTagName();
		System.out.println(z);
		//close site
		closeSite(driver);
	}
}
