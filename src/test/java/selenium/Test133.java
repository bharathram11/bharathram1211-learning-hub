package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.BrowserWindowUtility.*;
import static utilities.WebSiteUtility.*;

public class Test133
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://www.gmail.com");
		//Locate element
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				                                          "//button[text()='Forgot email?']")));
		//use getAttribute() to get HTML attribute value
		//null will come when no given HTML attribute in element source.
		String x=e.getAttribute("type"); //"type" is HTML attribute
		System.out.println(x);
		//use getCssValue() to get CSS attribute value
		//empty value will come when no given CSS attribute in element source.
		String y=e.getCssValue("color"); //"color" is CSS property
		System.out.println(y);
		//close site
		closeSite(driver);
	}
}
