

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindAbookInascrollingpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booksbykilo.in/new-books");
		
		/*using actions class file
		Actions act=new Actions(driver);
		WebElement book=driver.findElement(By.xpath("//img[@title='The Wisdom of Morrie by Morrie Schwartz']")).get;
		act.scrollToElement(book).perform();*/
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement book=driver.findElement(By.xpath("//img[@title='The Wisdom of Morrie by Morrie Schwartz']"));
		//js.executeScript("arguments[0].scrollIntoview();",book);
		boolean found=false;
		while(!found)
		{
			List<WebElement>third=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
			for(WebElement book:third)
			{
				if(book.getText().equals("The Wisdom of Morrie\r\n"
						+ "Morrie Schwartz"))
				{
					System.out.println("Book found");
					found=true;
					break;
				}
				
			}
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}

	}

}
