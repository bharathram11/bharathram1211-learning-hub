package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test28
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("chrome://settings/");
		Thread.sleep(5000);
		//fill search box
		driver.findElement(By.id("searchInput")).sendKeys("kalam");
		//"NoSuchElementException" in above statement because our element is under shadow-root
	}
}
