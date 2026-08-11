

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com");
		WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement pc=driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desktop).perform();
		act.moveToElement(pc).click().perform();

	}

}
