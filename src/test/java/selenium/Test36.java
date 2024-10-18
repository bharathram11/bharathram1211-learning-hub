package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.amazon.in");
		Thread.sleep(5000);
		//get count of all elements in page source
		List<WebElement> l=driver.findElements(By.xpath("//*")); //In xpath, "*" means any tag in HTML
		System.out.println(l.size());
		//Close site
		driver.quit();
	}
}
