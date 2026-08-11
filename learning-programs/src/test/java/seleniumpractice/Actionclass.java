package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.switchTo().frame(0);
		WebElement a=driver.findElement(By.xpath("(//div[@id='slider-range']/span)[1]"));
		WebElement b=driver.findElement(By.xpath("(//div[@id='slider-range']/span)[2]"));
		Actions act=new Actions(driver);
		System.out.println("initial:"+a.getLocation());
		act.dragAndDropBy(a, 50, 0).perform();//+_1
		System.out.println("after :"+a.getLocation());
		System.out.println("initial:"+b.getLocation());
		act.dragAndDropBy(b, 100, 0).perform();//+_1
		System.out.println("after :"+b.getLocation());
	}
}
//act.moveToElement(a).click().keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.CONTROL).sendKeys("C").perform();