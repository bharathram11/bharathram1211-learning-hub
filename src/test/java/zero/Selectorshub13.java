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

public class Selectorshub13 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveToLocation(300, 400).perform();
		Thread.sleep(4000);
		driver.switchTo().frame("pact");
		
		WebElement host=driver.findElement(By.id("snacktime"));
		SearchContext root=host.getShadowRoot();
		WebElement targetel=root.findElement(By.linkText("Testers Food"));
		try
		{
			targetel.click();
		}
		catch(Exception ex)
		{
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", targetel);

		}
		Set<String>x=driver.getWindowHandles();
		List<String>y=new ArrayList<String>(x);
		driver.switchTo().window(y.get(1));
		Thread.sleep(4000);
		driver.findElement(By.linkText("About us")).click();
		x=driver.getWindowHandles();
		y=new ArrayList<String>(x);
		driver.switchTo().window(y.get(2));
		String name=driver.findElement(By.tagName("figcaption")).getText();
		System.out.println(name);
		driver.close();
		driver.switchTo().window(y.get(1));
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(y.get(0));
		
		
	}
}
