

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		System.out.println(rows.size());
		for(WebElement row:rows)
		{
			String x=row.findElement(By.xpath("td[1]")).getText();
			if(x.equalsIgnoreCase("chrome"))
			{
				System.out.println("matched  "+row.findElement(By.xpath("td[contains(text(),'MB')]")).getText());
			}
			else
			{
				System.out.println("not matched");
			}
		}
		driver.quit();
	}

}
