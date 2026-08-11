

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement destiny=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(source, destiny).perform();

	}

}

//Actions is a class will be used to perform mouse actions
//Action is an interface, will be used to store created actions
// mouse actions by using action class methods 1.mouse hover-->moveToElement,rightclick-->contextClick,doubleClick, dragAndDrop