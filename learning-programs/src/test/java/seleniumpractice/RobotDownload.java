package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotDownload {
    public static void main(String[] args) throws Exception {
        // Set up ChromeOptions to trigger Save As dialog
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--no-sandbox");
        //options.addArguments("--disable-extensions");
        //options.addArguments("--start-maximized");
       // options.addArguments("savefile");

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Locate and click the "Download Files" link
        driver.findElement(By.xpath("//a[normalize-space()='Download Files']")).click();

        // Input some text into the textarea
        driver.findElement(By.xpath("//textarea[@id='inputText']")).sendKeys("hi brothers");

        // Click on the "Generate File" button
        driver.findElement(By.xpath("//button[@id='generateTxt']")).click();

        // Simulate keyboard actions to interact with the Save As popup
        Robot rb = new Robot();

        // Use TAB to navigate (simulate 3 TAB presses)
        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyRelease(KeyEvent.VK_TAB);

        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyRelease(KeyEvent.VK_TAB);

        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyRelease(KeyEvent.VK_TAB);

        // Press ENTER to confirm the download
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Successfully closed the popup window and started file download.");

        // Now, verify if the file is downloaded
        verifyFileDownload("info.txt");

        // Close the browser
        //driver.quit();
    }

    // Method to verify if the file is downloaded
    public static void verifyFileDownload(String fileName) {
        String downloadDirectory = System.getProperty("user.home") + "/Downloads"; // default download path
        File file = new File(downloadDirectory + "/" + fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File downloaded successfully: " + file.getAbsolutePath());
        } else {
            System.out.println("File not downloaded.");
        }
    }
}
