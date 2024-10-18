package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		WebDriver driver=new ChromeDriver(); //define that object using concrete class's class
		//wait for few seconds
		Thread.sleep(5000);
		//Launch site
		driver.get("http://www.google.co.in");
		//wait for few seconds
		Thread.sleep(5000);
		//Get page source
		String s=driver.getPageSource();
		System.out.println("Page source is:"+"\n"+s);
	}
}
