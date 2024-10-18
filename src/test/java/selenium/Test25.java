package selenium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25
{

	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		WebDriver driver=new ChromeDriver();
		//Way-1: Launch site using get() method
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Way-2: Launch another site using navigate().to() method with url as String
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(5000);
		//Way-3: Launch another site using navigate().to() method with url as URL object
		URL obj=new URL("http://www.gmail.com");
		driver.navigate().to(obj);
		Thread.sleep(5000);
		//Back to previous
		driver.navigate().back();
		Thread.sleep(5000);
		//Forward to next
		driver.navigate().forward();
		Thread.sleep(5000);
		//Reload page once again
		driver.navigate().refresh();
		Thread.sleep(5000);
		//Close site by avoiding Network socket exceptions
		driver.quit();
	}
}
