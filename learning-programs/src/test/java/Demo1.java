import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("naukri",Keys.ENTER);
		Thread.sleep(4000);
		List<WebElement>alllinks=driver.findElements(By.xpath("//div[@class='MjjYud']"));
		System.out.println(alllinks.size());
		for(WebElement a:alllinks)
		{
			System.out.println(a.getText());
		}
		//System.out.println(hyperlink);
//		driver.findElement(By.xpath("(//a[@jsname='UWckNb'])[1]")).click();
//		driver.findElement(By.xpath("//a[text()='Register']")).click();
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bharath");
//		driver.findElement(By.id("email")).sendKeys("bharathr211@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12321er");
//		driver.findElement(By.id("mobile")).sendKeys("6303384734");
//		driver.findElement(By.xpath("//div[@class='textWrap']/child::h2[contains(text(),'experienced')]")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'submitbtn')]")).click();
//		driver.close();
	}

}
