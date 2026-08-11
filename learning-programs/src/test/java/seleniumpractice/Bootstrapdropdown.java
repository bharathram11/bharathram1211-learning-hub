package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
		//driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		/*List<WebElement>all=driver.findElements(By.xpath("//div[contains(@class,'auto-complete-drop-down')]//div[@class=' col']"));
		System.err.println(all.size());
		for(WebElement a:all)
		{
			String name=a.getText();
			if(name.equals("Chennai"))
			{
				a.click();
			}
		}*/
	}

}
