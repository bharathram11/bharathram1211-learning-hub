

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindNOOfBooks {

	public static void main(String[] args) throws Exception {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booksbykilo.in/new-books");
		
//			List<WebElement>first=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
//			System.out.println(first.size());
			//by using java script
			//JavascriptExecutor js= (JavascriptExecutor)driver;
			Actions act=new Actions(driver);
//			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//			List<WebElement>second=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
//			System.out.println(second.size());
			//logic
			int previouscount=0;
			int currentcount=0;
			while(true)
			{
				List<WebElement>third=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
				currentcount=third.size();
				if(currentcount==previouscount)
				{
					break;
				}
				previouscount=currentcount;
				//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				act.sendKeys(Keys.END).perform();
				Thread.sleep(3000);

			}
			System.out.println("total no of books:"+currentcount);
	driver.quit();		
	}

}
