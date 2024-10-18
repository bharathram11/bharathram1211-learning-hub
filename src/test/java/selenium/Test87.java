package selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test87
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//define implicit wait at top of the automation code to be used for waiting if required
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Launch site
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//automation code to be executed once page is ready
		driver.switchTo().frame("iframeResult"); 
		driver.findElement(By.name("fname")).clear(); //to remove existing value
		driver.findElement(By.name("fname")).sendKeys("abdul"); 
		driver.findElement(By.name("lname")).clear(); //to remove existing value
		driver.findElement(By.name("lname")).sendKeys("kalam sir");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.switchTo().defaultContent(); //back to page
		driver.close();
	}
}
//sometimes above code lead to errors and flakiness in our test, 
//because implicitlyWit() method is not consistent.


















