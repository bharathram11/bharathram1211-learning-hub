package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMouse {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Robot robot = new Robot();
		robot.mouseMove(300, 500); // Move the cursor to (x=300, y=500)
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Left click
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

}
