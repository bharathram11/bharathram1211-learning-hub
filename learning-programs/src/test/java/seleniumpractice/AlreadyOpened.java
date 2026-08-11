package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlreadyOpened {
	public static void main(String[] args) {
		// Set ChromeOptions to use the remote debugging port
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");


        // Attach WebDriver to the existing browser instance
        WebDriver driver = new ChromeDriver(options);

        // Perform any action with the existing browser
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        // Close the driver (optional)
        driver.quit();
	}

}
