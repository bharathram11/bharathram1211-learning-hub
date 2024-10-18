package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import pages.LoginPage;

import static utilities.BrowserWindowUtility.*;
import static utilities.WebSiteUtility.*;

public class Test115StalesolutionWithPOM 
{
	public static void main(String[] args) throws Exception 
	{
		//Log W3C WebDriver protocol commands in between "SWD" and "BrowserDriver S/W", in a text file
		System.setProperty("webdriver.chrome.logfile", "target\\TestLog2.txt");
		
		
		//Open browser, Define wait object, and launch site
		WebDriver driver=openBrowser("chrome");
		browserMaximize(driver);
		FluentWait<WebDriver> wait=defineExplicitWait(driver, 30, 1000);
		launchSite(driver,"https://github.com/login");
		
		
		//create an object to page class
		LoginPage lp=new LoginPage(driver,wait);
		//Do login with wrong details
		lp.enterUsername("amod"); //wrong username
		lp.enterPassword("143"); //wrong password
		lp.clickLoginButton();
		if(lp.isErrorMsgDisplayed())
		{
			System.out.println("Test passed for wrong data");
		}
		
		
		//Do relogin with correct details
		lp.enterUsername("kalamgit143"); //correct username
		lp.enterPassword("Magnitia@263264"); //correct password
		lp.clickLoginButton();
		//close site
		closeSite(driver);
	}
}
