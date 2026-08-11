package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotScroll {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Robot rb=new Robot();
		for(int i=0;i<100;i++)
		{
		  rb.keyPress(KeyEvent.VK_DOWN);
		  rb.keyRelease(KeyEvent.VK_DOWN);
		  rb.delay(100);
	    }
	}

}
