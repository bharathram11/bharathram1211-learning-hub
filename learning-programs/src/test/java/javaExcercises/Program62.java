package javaExcercises;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program62
{
	public static void main(String[] args) throws Exception
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the innings number");
		int ing=sc.nextInt();
		System.out.println("enter the batsman number");
		int bno=sc.nextInt();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.cricbuzz.com/live-cricket-scorecard/87878/rsa-vs-ind-final-icc-mens-t20-world-cup-2024");
		Thread.sleep(3000);
		List<WebElement> ele=driver.findElements(By.xpath("(//div[contains(@id,'innings-"+ing+"')]/descendant::div[@class='text-xs']/child::div[contains(@class,'scorecard-bat-grid')])["+bno+"]/child::div[2]"));
		for(WebElement element:ele)
		{
			String name=element.findElement(By.xpath("preceding-sibling::div/child::a")).getText();
			System.out.print("batsman name "+name);
			String score=element.getText();
			System.out.print("he did "+score+" runs");
		}
	}
}






