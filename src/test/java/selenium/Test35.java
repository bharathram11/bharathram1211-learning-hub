package selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test35
{
	public static void main(String[] args) throws Exception
	{
		//Get innings number and batter number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter match url");
		String url=sc.nextLine();
		System.out.println("Enter Innings number like 1 or 2 ...etc upto 4");
		int inum=sc.nextInt();
		System.out.println("Enter batter number like 1 or 2 or ...etc upto 11");
		int bnum=sc.nextInt();
		sc.close();
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get(url);
		Thread.sleep(5000);
		//Get runs of 1st bater in 1st innings
		try {
			String x=driver.findElement(By.xpath(
					"(//div[contains(@id,'scard') and contains(@id,'innings-"+inum+"')]//div[@class='text-xs']/div[contains(@class,'scorecard-bat')])["+bnum+"]/div[2]"))
					.getText();
			System.out.println(x);
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("No given innings or no given batter found in page source");
		}
		//Close site
		driver.quit();
	}
}
