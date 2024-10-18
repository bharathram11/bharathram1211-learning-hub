package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test56
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://my.aidaform.com/signup"); 
		Thread.sleep(5000);
		//Collect button type elements
		List<WebElement> l=driver.findElements(By.xpath(
				"(//button)|(//input[@type='button' or @type='submit'])"));
		System.out.println(l.size());
		//close site
		driver.close();
	}
}






