package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,3000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));//to check whether its moved exactly 3000 or not

		//scroll down page till element is visible
		//WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Footer Links']"));
		//js.executeScript("arguments[0].scrollIntoView();",ele);
		//System.out.println(js.executeScript("return window.pageYOffset;"));  pageXOffset
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scrollWidth for horizontal scroll bar
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(3000);
		//go back to initial position
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
