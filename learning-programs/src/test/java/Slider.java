

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		//min slider
		/*WebElement min=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		System.out.println("minslider"+min.getLocation());  //-1,3
		act.dragAndDropBy(min, 40,3).perform();
		System.out.println("minslider after moving"+min.getLocation());//38,3*/
		//max slider
		WebElement max=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		System.out.println("maxslider"+max.getLocation());//38,3
		act.dragAndDropBy(max, -14,3).perform();
		System.out.println("after moving to back"+max.getLocation());
		;

	}

}
