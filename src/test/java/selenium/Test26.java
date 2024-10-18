package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://my.aidaform.com/");
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.findElement(By.name("nickname")).sendKeys("batch268");
		driver.findElement(By.name("email")).sendKeys("batch268@sleepers.com");
		driver.findElement(By.name("password")).sendKeys("cheating@7AM");
		driver.findElement(By.name("confirm")).sendKeys("cheating@7AM");
		driver.findElement(By.xpath("//*[local-name()='svg' and contains(@class,'border')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Create My Free Account']")).click();
		Thread.sleep(5000);

	}
}
