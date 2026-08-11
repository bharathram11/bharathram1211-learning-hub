

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Diubleclick {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		WebElement desktop=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
//		act.doubleClick(desktop).perform();
		Action myaction=act.doubleClick(desktop).build();
		myaction.perform();
	}

}
