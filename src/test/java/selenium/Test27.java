package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.name("fname")).sendKeys("abdul");
		driver.findElement(By.id("lname")).sendKeys("kalam");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(5000);
		//"NoSuchElementException" in above code because our elements are under a frame(Part of a page)
	}
}
