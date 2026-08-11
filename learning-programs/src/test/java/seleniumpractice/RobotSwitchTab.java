package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotSwitchTab {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Robot rb=new Robot();
		//without closing one tab newly opened it will again switch back to eclipse
		  rb.keyPress(KeyEvent.VK_ALT);
		  rb.keyPress(KeyEvent.VK_TAB);
		  rb.keyRelease(KeyEvent.VK_TAB);
		  rb.keyRelease(KeyEvent.VK_ALT);
		  rb.delay(100);
	    
	}
}
