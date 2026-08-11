

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectorshub14 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Actions act=new Actions(driver);
		act.moveToLocation(300, 400).perform();
		Thread.sleep(4000);
		
		//driver.findElement(By.id("userName")).getShadowRoot().findElement(By.id("kils")).sendKeys("dfgg");
		WebElement shadowHostElement=driver.findElement(By.id("userName"));
		SearchContext shadowRootElement=shadowHostElement.getShadowRoot();
		WebElement targetElement=shadowRootElement.findElement(By.id("kils"));
		

	}

}
//