

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementss {

    public static void main(String[] args) throws Exception {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));

       // Take a screenshot of the WebElement
        /*File screenshot = desktop.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("target\\screen11.png");
        FileUtils.copyFile(screenshot, destinationFile);*/
		
		//way-2
		File sourcefile=desktop.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("target\\screen2121.png");	
		sourcefile.renameTo(targetFile);
    }
} 