package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotfileupload {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
      
            driver.get("https://omayo.blogspot.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

           driver.findElement(By.xpath("//input[@id='uploadfile']")).click();
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", fileInput);

            Robot robot = new Robot();
            StringSelection fileSelection = new StringSelection("C:\\Users\\bhara\\OneDrive\\Desktop\\sekeniumsyllabusplan.pdf");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);

            // Simulate Ctrl + V to paste file path
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Simulate pressing Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            System.out.println("File uploaded successfully.");
        
        
    }
}
