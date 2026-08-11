package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotpopup {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[normalize-space()='Open a popup window']")).click();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ESCAPE);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
//		rb.keyPress(KeyEvent.VK_ALT);
//		rb.keyPress(KeyEvent.VK_F4);
//		rb.keyRelease(KeyEvent.VK_F4);
//		rb.keyRelease(KeyEvent.VK_ALT);
		System.out.println("successfully closed popup window");
	}

}
