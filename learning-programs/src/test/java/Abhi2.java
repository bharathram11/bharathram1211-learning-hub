import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abhi2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/bus_search/Hyderabad/3/Chennai/6/25-12-2024/O");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        List<WebElement>data=driver.findElements(By.xpath("//div[@class='container header-container fixed']//span/following-sibling::span"));
//        for(WebElement da:data)
//        {
//        	System.out.println(da.getText());
//        }
        WebElement e=driver.findElement(By.xpath("//div[@class='slider-thumb slider-thumb-0 active']"));
        driver.findElement(By.xpath("//div[contains(@class,'scrollable-container')]//span[text()='Sort & Filters']")).click();
        Actions act=new Actions(driver);
        act.dragAndDropBy(e, 50, 0).perform();
	}

}
