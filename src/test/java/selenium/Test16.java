package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test16
{
	public static void main(String[] args) throws Exception 
	{
		//cross-browser code for all site
		//open any browser
		WebDriver driver = null;//declare any object(inplace of driver)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=sc.nextLine();
		System.out.println("Enter complete URL of target site");
		String url=sc.nextLine();
		if(browser.equalsIgnoreCase("Chrome"))
		{
			//define object using concrete class's class
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter the correct browser name to display");
			System.exit(0);
		}
		Thread.sleep(5000);
		driver.get(url);
		sc.close();
	}
}
