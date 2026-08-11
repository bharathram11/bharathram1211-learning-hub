package seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);

        driver.get("https://www.google.co.in");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
