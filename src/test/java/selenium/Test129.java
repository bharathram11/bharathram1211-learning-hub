package selenium;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static utilities.BrowserWindowUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test129
{
	public static void main(String[] args) throws Exception
	{
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://efuma.com/");
		//element covered by other element like banner
		//but sendKeys() is working successfully
		wait.until(visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Keyword or Item']"))).sendKeys("mobiles",Keys.ESCAPE);
		//clear that value using clear() method. It will work successfully. 
		//wait.until(visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Keyword or Item']"))).clear();
		//If clear() is not working, we go to use keyboard keys automation on element
		wait.until(visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Keyword or Item']"))).sendKeys(Keys.chord(Keys.CONTROL,"a"),
				                                                      Keys.BACK_SPACE,Keys.ESCAPE); 
	}
}
