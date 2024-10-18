package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		WebDriver driver=new ChromeDriver(); 
		//wait for few seconds
		Thread.sleep(5000);
		//Launch site
		driver.get("http://httpforever.com/");
		//wait for few seconds
		Thread.sleep(5000);
		//check for secured
		String u=driver.getCurrentUrl();
		if(u.startsWith("https"))
		{
			System.out.println("Secured site");
		}
		else
		{
			System.out.println("Not secured site");
		}
	}
}
