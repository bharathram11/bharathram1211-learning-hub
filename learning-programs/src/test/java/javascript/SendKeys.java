package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) {
		//sending data to element without using sendkeys
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement namebox=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;  //we cant create obj bcaz its an interface
		js.executeScript("arguments[0].setAttribute('value','Roman')",namebox);
	}

}
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("document.getElementById('yourTextBoxID').value='yourValue';");
