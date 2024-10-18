package selenium;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static utilities.BrowserWindowUtility.*;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import static utilities.WebSiteUtility.*;

public class Test114StaleSolutionWithoutPOM 
{
	public static void main(String[] args) throws Exception 
	{
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
		username.sendKeys("amod"); //wrong username
		pass.sendKeys("143"); //wrong password
		sub.click();
		//Wait for error msg
		Pattern p=Pattern.compile("Incorrect username or password");
		wait.until(textMatches(By.xpath("//div[@role='alert']"),p));
		//Do relogin with correct details
		if(wait.until(stalenessOf(username)))
		{
			//Relocate element if that element is staled
			username=wait.until(refreshed(visibilityOfElementLocated(By.id("login_field"))));
			username.clear();
			username.sendKeys("kalamgit143"); //correct username
		} 
		if(wait.until(stalenessOf(pass)))
		{
			//Relocate element if that element is staled
			pass=wait.until(refreshed(visibilityOfElementLocated(By.id("password"))));
			pass.clear();
			pass.sendKeys("Magnitia@263264"); //correct password
		}
		if(wait.until(stalenessOf(sub)))
		{
			//Relocate element if that element is staled
			sub=wait.until(refreshed(elementToBeClickable(By.xpath("//input[@value='Sign in']"))));
			sub.click();
		}
		//further code
	}

}
