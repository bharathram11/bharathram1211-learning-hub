

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

public class Selectorshub12 {

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
		driver.findElement(By.xpath("//a[text()='Reviews']")).click();
		
		List<WebElement>lists=driver.findElements(By.xpath("(//div[contains(@class,'elementor-element')]//span[text()='Install'])|(//div[contains(@class,'elementor-element')]//span[text()='Explore'])|(//div[contains(@class,'elementor-element')]//span[text()='Learn more'])"));
		System.out.println(lists.size());
		Thread.sleep(4000);
		driver.close();
		Thread.sleep(4000);
		driver.switchTo().window(y.get(0));
		
		
	}
}
