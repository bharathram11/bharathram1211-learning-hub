

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WithoutSwitchtoAlert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(3000);
	
		//1using switchTo()
		//driver.switchTo().alert().accept();
		 //2 using explicitwait
		/*FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(40));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.until(ExpectedConditions.alertIsPresent()).accept();*/
		//3javasrciptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		try
		{
				js.executeScript("window.alert=function{};");
		}
		catch(Exception ex)
		{
			
		}
	}
}
