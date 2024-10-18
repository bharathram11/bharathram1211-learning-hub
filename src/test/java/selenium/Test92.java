package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test92 
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome/firefox/edge/safari browser using SWD-Java code
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Here, Fresh browser window opens without any history and cookies by default.
		//Collect cookies from an empty browser
		Set<Cookie> cs=driver.manage().getCookies();
		int cc=cs.size();
		System.out.println(cc);
		//Close Browser window
		driver.quit();
	}
}
