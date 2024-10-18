package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test39
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		//collect all images
//		List<WebElement> images=driver.findElements(By.xpath("//img")); 
//		//Goto each image in that list
		int vc=0, hc=0;
//		for(WebElement image:images)
//		{
//			if(image.isDisplayed())
//			{
//				vc++; //increase by 1
//			}
//			else
//			{
//				hc++;
//			}
//		}
//		System.out.println("Total images count is "+images.size());
//		System.out.println("Visible images count is "+vc);
//		System.out.println("hidden images count is "+hc);
//		//close site
//		driver.quit();
	
	
	List<WebElement>x=driver.findElements(By.xpath("//img"));
	for(WebElement e:x)
	{
		if(e.isDisplayed())
		{
			vc++;
			System.out.println(vc+")."+e.getAttribute("src"));
		}
		else
		{
			hc++;
		}
	}
	System.out.println();
	System.out.println(vc);
	System.out.println(hc);
	}
	
}
