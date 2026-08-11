package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement ele=driver.findElement(By.xpath("//input[@id='name']"));
        WebElement ele1=driver.findElement(By.xpath("//button[@name='start']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", ele1);
        js.executeScript("arguments[0].setAttribute('value','heelllo')", ele);
        js.executeScript("arguments[0].style.border='6px green solid'", ele);
        //js.executeScript("document.body.style.zoom='67%'");
        //js.executeScript("window.scrollBy(0,2000)", " "); 
      js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//h2[normalize-space()='Labels And Links']")));
      Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//top
	}
}
