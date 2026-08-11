package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void main(String[] args) throws Exception {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
//        js.executeScript("arguments[0].click()", e);
//        js.executeScript("arguments[o].setAttribute('value','hari')", ele);
//        js.executeScript("window.scrollBy(0,1500)"," ");
//        js.executeScript("window.scrollIntoView();", ele);
//        js.executeAsyncScript("window.scrollBy(0,document.body,scrollHeight)");
        js.executeScript("document.body.style.zoom='50%'");
        
    }
}
