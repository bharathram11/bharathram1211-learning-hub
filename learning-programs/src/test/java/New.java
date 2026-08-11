

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class New {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement referenceElement = driver.findElement(By.xpath("//input[@id='pass']")); // Reference element
        WebElement belowElement = driver.findElement(RelativeLocator.with(By.tagName("input")).above(referenceElement));
        belowElement.sendKeys("ashwin");
	}
}
