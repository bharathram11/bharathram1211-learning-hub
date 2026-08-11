package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		//clicking by using click method in javascript
		 // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //JAVASCRIPT CLICK
/*       WebElement e=driver.findElement(By.xpath("//input[@id='male']"));
//        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",e);*/
        
        //for sendkeys
         /*WebElement e=driver.findElement(By.xpath("//input[@id='name']"));
         JavascriptExecutor js= (JavascriptExecutor)driver;
         js.executeScript("arguments[0].setAttribute('value','name')",e);*/
        
        WebElement ele=driver.findElement(By.xpath("//td[normalize-space()='System']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,1500)", " ");
        //js.executeScript("arguments[0].scrollIntoView()", ele);
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       // Thread.sleep(3000);
        //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        js.executeScript("document.body.style.zoom='50%' ");

	}

}
