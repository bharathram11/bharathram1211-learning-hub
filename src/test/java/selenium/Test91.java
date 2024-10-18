package selenium;


import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test91
{
	public static void main(String[] args) throws Exception
	{
		
		/*Logs in the context of web browsers and web automation frameworks like Selenium WebDriver
		  are records of events, actions, or errors that occur during the execution of a web application
		  or browser session. They provide valuable information for debugging, performance monitoring, 
		  and understanding how the application behaves under different conditions. */
		
		//open chrome browser and launch site
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
		Thread.sleep(5000); 
		//collect logs
		Set<String> s=driver.manage().logs().getAvailableLogTypes();
		System.out.println(s);
		//Get browser logs
		System.out.println("Browser logs:");
		LogEntries bl=driver.manage().logs().get("browser");
		for(LogEntry l:bl)
		{
			System.out.println(l.getMessage());
		}
		//Get browser driver software logs
		System.out.println("Browser driver software logs:");
		LogEntries dl=driver.manage().logs().get("driver");
		for(LogEntry l:dl)
		{
			System.out.println(l.getMessage());
		}
		//Get client logs(OS, N/W, Memory and other resources)
		System.out.println("client logs:");
		LogEntries cl=driver.manage().logs().get("client");
		for(LogEntry l:cl)
		{
			System.out.println(l.getMessage());
		}
		driver.quit();
	}
}
