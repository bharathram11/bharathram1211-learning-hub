package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabSwitch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement reg=driver.findElement(By.xpath("//a[@href='/html/tryit.asp?filename=tryhtml_default_default']"));
        Actions act=new Actions(driver);
        act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
	}
}
