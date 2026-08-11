

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// AShot imports
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullSs {

    public static void main(String[] args) throws Exception {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the desired webpage
        driver.get("https://demo.opencart.com");

        // Use AShot to take a full-page screenshot
        Screenshot fullScreenshot = new AShot().takeScreenshot(driver);
        // Save the full-page screenshot to the target/screenshots folder
        ImageIO.write(fullScreenshot.getImage(), "PNG", new File("target\fullpage_screenshot.png"));

        // Close the browser
        driver.quit();
    }
}
