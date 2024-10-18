package selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test81FirstPage
{
	public static void main(String[] args) throws Exception
	{
		//Open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site using base URL
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000); 
		//Close banner if exists
		try
		{
			driver.findElement(By.xpath("//span[@role='button']")).click();
			Thread.sleep(5000); 
		}
		catch(Exception ex)
		{
			System.out.println("No banner this time");
		}
		//click on "beauty" link
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Beauty')]")).click();
		Thread.sleep(5000); 
		//click on first "VIEW ALL" link
		driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
		Thread.sleep(5000);
		//click on "Key Cover" product link
		driver.findElement(By.xpath("//img[@alt='suzuki Car Key Cover']")).click();
		Thread.sleep(5000);
		//collect all models in 1st page
		List<WebElement> all=driver.findElements(By.xpath(
					                          "//div[contains(@data-tkid,'SEARCH')]/a[1]"));
		Map<String, Integer> products=new HashMap<String, Integer>();
		for(int i=0;i<all.size();i++)
		{
			//((JavascriptExecutor)driver).executeScript("arguments[0].click();",all.get(i));
			all.get(i).click();
			Thread.sleep(5000);
			//switch to newly opened window/tab(2nd tab)
			Set<String> s=driver.getWindowHandles();
			List<String> l=new ArrayList<String>(s);
			driver.switchTo().window(l.get(1));
			//get product image "src" path and amount
			String x=driver.findElement(By.xpath("(//img[@loading='eager'])[1]"))
						                                                     .getAttribute("src");
			String y=driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
			y=y.substring(1); //take text from 2nd position to avoid "$" symbol
			y=y.replace(",",""); //remove "," in value
			products.put(x,Integer.parseInt(y));
			//close that newly opened browser window/tab
			driver.close();
			//back to previous page
			driver.switchTo().window(l.get(0));
			Thread.sleep(2000);
		}
		//Find keys of max value in hash map
        int maxValue=Integer.MIN_VALUE;
        // First, find the maximum value in the map
        for(Integer value:products.values()) 
        {
            if(value>maxValue) 
            {
                maxValue=value;
            }
        }
        System.out.println(maxValue);
        // Next, collect all keys that have the maximum value
        List<String> maxPriceProducts=new ArrayList<>();
        for(Map.Entry<String,Integer> entry : products.entrySet()) 
        {
            if (entry.getValue().equals(maxValue)) 
            {
            	maxPriceProducts.add(entry.getKey());
            }
        }
        System.out.println(maxPriceProducts);
		//close site
		driver.quit();
	}
}
