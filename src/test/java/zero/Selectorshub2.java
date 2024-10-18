package zero;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectorshub2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveToLocation(300, 400).perform();
		//Thread.sleep(3000);
		Thread.sleep(10000);
		
		WebElement shadowHostElement=driver.findElement(By.id("userName"));
		SearchContext shadowRootElement=shadowHostElement.getShadowRoot();
		WebElement targetElement=shadowRootElement.findElement(By.linkText("Click to practice iframe inside shadow dom scenario"));
		try
		{
			targetElement.click();
		}
		catch(Exception ex)
		{
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", targetElement);
		}
		Thread.sleep(5000);
		Actions act1=new Actions(driver);
		act.moveToLocation(300, 400).perform();
		WebElement shadowHostElement1=driver.findElement(By.id("userName"));
		SearchContext shadowRootElement1=shadowHostElement1.getShadowRoot();
		shadowRootElement1.findElement(By.id("kils")).sendKeys("ghhhhh");
//		try
//		{
//			targetElement1.sendKeys("ghhhhh");
//		}
//		catch(Exception ex)
//		{
//			((JavascriptExecutor)driver).executeScript("arguments[0].click();", targetElement);
//		}
		
		
		
	
//This element is in iframe - This element is inside Shadow DOM and for such elements XPath won't support.
	
	}
}