package javaExcercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program98_2
{
	public static void main(String[] args) throws Exception
	{
		//open browser and Launch site
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		String x=driver.findElement(By.name("identifier")).getText();
		if(x.equals(""))
		{
			Exception e=new Exception("Null Value");
			throw e; //raise own exception and stops execution
		}
		else
		{
			System.out.println(x);
		}
		//close site
		driver.close();
	}
}
