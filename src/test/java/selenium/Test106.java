package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test106
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 40, 1000);
		launchSite(driver, "http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/"
				                                      +"explicit-show-hide/defaultcs.aspx"); 
		//Define wait condition for calendar
		WebElement e=wait.until(visibilityOfElementLocated(
                                        By.xpath("//*[contains(@class,'RadCalendar')]")));
		//Get calendar in to top of desktop
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",e);
		//wait, locate and click on a day link
		wait.until(elementToBeClickable(By.linkText("22"))).click();
		//Define wait condition for visibility of loader(Spinner) icon
		wait.until(visibilityOfElementLocated(By.className("raDiv")));
		//Define wait condition for invisibility of loader(Spinner) icon
		wait.until(invisibilityOfElementLocated(By.className("raDiv")));
		//close site
		closeSite(driver);
	}
}
