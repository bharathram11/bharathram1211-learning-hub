

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		WebElement cli=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.contextClick(cli).perform();
		Thread.sleep(3000);
	   driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
	   Thread.sleep(3000);
	   driver.switchTo().alert().accept();
		
	}

}
