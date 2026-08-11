import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Alertpractice {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
	     /*driver.get("https://www.facebook.com/");
	     driver.switchTo().activeElement().sendKeys("auomation@gmail.com",Keys.TAB);
	     driver.switchTo().activeElement().sendKeys("bharath",Keys.TAB,Keys.TAB);
	     driver.switchTo().activeElement().click();*/
		
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Set<String> x=driver.getWindowHandles();
		List<String> y=new ArrayList<String>(x);
		driver.switchTo().window(y.get(1));
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		String text=driver.findElement(By.xpath("//p[normalize-space()='This is a paragraph.']")).getText();
		System.out.println(text);
		driver.switchTo().window(y.get(0));
		driver.close();
	}
}
//frame,alert,activelement,window(already opened),window(newly opened)