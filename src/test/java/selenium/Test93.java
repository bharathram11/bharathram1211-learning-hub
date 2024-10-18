package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test93 
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser(Fresh browser window will be opened without any history and cookies)
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//1.Collect cookies from that empty browser
		Set<Cookie> cs=driver.manage().getCookies();
		int cc=cs.size();
		System.out.println(cc); //0
		//Launch yahoo site
		driver.get("http://www.yahoomail.com");
		Thread.sleep(5000);
		//2. collect cookies after launching site
		cs=driver.manage().getCookies();
		cc=cs.size();
		System.out.println(cc);
		//Click on "Sign In"
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		//3. Collect cookies after clicking on "Sign In"
		cs=driver.manage().getCookies();
		cc=cs.size();
		System.out.println(cc);
		//Enter user name
		driver.findElement(By.id("login-username")).sendKeys("testsedt12@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		//4. Collect cookies after enter user name
		cs=driver.manage().getCookies();
		cc=cs.size();
		System.out.println(cc);
		//Enter Password
		driver.findElement(By.id("login-passwd")).sendKeys("Sdet@1211,12");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		//5. Collect all cookies after enter password and login operation
		cs=driver.manage().getCookies();
		cc=cs.size();
		System.out.println(cc);
		//Close site
		driver.quit();
	}
}
