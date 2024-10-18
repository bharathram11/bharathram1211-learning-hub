package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.BrowserWindowUtility;
import utilities.CookiesUtility;
import utilities.WebSiteUtility;

public class Test97
{
	public static void main(String[] args) throws Exception
	{
		//Get a word to search from keyboard
		System.out.println("Enter a word to search");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		sc.close();
		//Open browser, maximize browser and launch a site
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		BrowserWindowUtility.browserMaximize(driver);
		WebSiteUtility.launchSite(driver,"http://www.google.co.in");
		Thread.sleep(5000);
		System.out.println("Cookies after Launching site:");
		System.out.println("-------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		List<String> launch=CookiesUtility.getCookiesDetailsList(driver);
		for(String lan:launch)
		{
			System.out.println(lan);
		}
		
		List<String> types1=CookiesUtility.getCookiesTypes(driver,"google.co.in","google.com");
		for(String type:types1)
		{
			System.out.println(type);
		}
		//Do Search
		driver.findElement(By.name("q")).sendKeys(word,Keys.ENTER); 
		Thread.sleep(5000);
		System.out.println("Cookies after searching a word:");
		System.out.println("-------------------------------");
		System.out.println(CookiesUtility.getCookiesCount(driver));
		//System.out.println(CookiesUtility.getCookiesDetailsList(driver));
		List<String> launch2=CookiesUtility.getCookiesDetailsList(driver);
		for(String lan:launch2)
		{
			System.out.println(lan);
		}
		List<String> types2=CookiesUtility.getCookiesTypes(driver,"google.co.in","google.com");
		for(String type:types2)
		{
			System.out.println(type);
		}
		//Close site
		WebSiteUtility.closeSite(driver);
	}
}
