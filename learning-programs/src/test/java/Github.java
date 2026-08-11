import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Github {
    public static void main(String[] args) throws Exception {
        // Set Chrome options for headless mode
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // Headless mode
//        options.addArguments("--disable-gpu"); // Disable GPU acceleration
//        options.addArguments("--window-size=1920x1080"); // Window size for headless mode
        
        // Initialize WebDriver with Chrome options
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://mystore.com/");

        // Set up WebDriverWait for element visibility and clicks
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); 
       // driver.findElement(By.xpath("//*[contains(text(),'NO, THANK YOU')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'NO, THANK YOU')]"))).click();
       
            // Wait for the dropdown to be clickable and click on it
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='signIn-label']")));
            dropdown.click();

            
            // Fill in the registration form
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xss@gmail.com");
            driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("v9vJKjUr!V7cauY");
            driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
            Thread.sleep(3000);
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//button[@class='action switch']")).click();
            driver.findElement(By.xpath("//li[@class='link authorization-link']")).click();
           // driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Asa@31bbbb");

        
    }
}
