

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestMatchwww {
	public static void main(String[] args) throws Exception {		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the innings number");
		int ing=sc.nextInt();
		System.out.println("Enter the batsman number");
		int bn=sc.nextInt();
		Thread.sleep(3000);

		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/76507/eng-vs-sl-1st-test-sri-lanka-tour-of-england-2024");
		Thread.sleep(3000);
		try
		{
		String x=driver.findElement(By.xpath("(//div[@id='innings_"+ing+"']/div[1]/div[contains(@class,'cb-scrd-itms')]//a[@class='cb-text-link'])["+bn+"]/following::div[2]")).getText();
		System.out.println(x);
		}
		catch(Exception ex)
		{
			System.out.println("No such innings or No such batsman exists");
		}
		driver.quit();
	}
}
