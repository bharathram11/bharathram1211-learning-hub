package selenium;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test49
{
	public static void main(String[] args) throws Exception
	{
		//Get product type to search from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product type to search");
		String pro=sc.nextLine();
		sc.close();
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//Close login banner if exist
		try
		{
			driver.findElement(By.xpath("//span[@role='button']")).click();
		}
		catch(Exception ex)
		{
			System.out.println("No banner exists");
		}
		//Search for a product
		driver.findElement(By.name("q")).sendKeys(pro, Keys.ENTER);
		Thread.sleep(5000);
		//collect all results page by page
		int trc=0;
		while(true) //infinite loop for pagination
		{
			//Collect results in current page
			List<WebElement> results=driver.findElements(By.xpath(
		                             "//div[contains(@data-tkid,'SEARCH')]")); 
			int cprc=results.size();
			trc=trc+cprc; //add to total results count
			//click on "Next" link to go to next page if exist
			try
			{
			  driver.findElement(By.xpath("//span[text()='Next']/parent::a")).click();
			  Thread.sleep(3000);
			}
			catch(Exception ex)
			{
			  break;  //terminate from loop when next link disabled or not available
			}
		}
		System.out.println("count of all results in all pages is "+trc);
		//close site
		//driver.close();
	}
}
