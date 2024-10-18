package selenium;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test113StaleIssueWithoutPOM
{
	public static void main(String[] args) throws Exception 
	{
		//Log W3C WebDriver protocol commands in between "SWD" and "BrowserDriver S/W", in a text file
		System.setProperty("webdriver.chrome.logfile", "target\\TestLog1.txt");
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://github.com/login");
		// locate all elements
		WebElement username=wait.until(visibilityOfElementLocated(By.id("login_field")));
		WebElement pass=wait.until(visibilityOfElementLocated(By.id("password")));
		WebElement sub=wait.until(elementToBeClickable(By.xpath("//input[@value='Sign in']")));
		//Do login with wrong details
		username.sendKeys("Jessy");
		pass.sendKeys("143"); 
		sub.click();
		Pattern p=Pattern.compile("Incorrect username or password");
		wait.until(textMatches(By.xpath("//div[@role='alert']"),p));
		//Do relogin with correct details
		username.clear();
		username.sendKeys("kalamgit143"); //correct username
		pass.clear();
		pass.sendKeys("Magnitia@263264"); //correct password
		sub.click();
		//further code
	}
}
