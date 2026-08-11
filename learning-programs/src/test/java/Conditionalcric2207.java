

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcric2207 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the innings number");
		int ing=sc.nextInt();
		sc.close();
		driver.get("https://m.cricbuzz.com/live-cricket-scorecard/87878/rsa-vs-ind-final-icc-mens-t20-world-cup-2024");
		List<WebElement> allbtsscores=driver.findElements(By.xpath(
	     "((//div[contains(@id,'scard') and contains(@id,'innings-"+ing+"')]//div[@class='text-xs']/div[contains(@class,'scorecard-bat')])/div[2])"));
		
		for(WebElement runsofall:allbtsscores)
		{

			String allbtsname=runsofall.findElement(By.xpath("preceding-sibling::div[1]/a")).getText();
			String output=runsofall.getText();              //9 is a string (text)
			int numberless=Integer.parseInt(output);        //9 is a integer
			if(numberless<10)
			{
				System.out.println("run is "+numberless+" batsman name is :"+allbtsname);
			}
		}
		driver.quit();
	} 
}