package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test41AnotherLogic
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.amazon.in");
		Thread.sleep(5000);
		//1. get all images in page source
		List<WebElement> allimages=driver.findElements(By.xpath("//img")); //"img" for images in HTML
		System.out.println(allimages.size());
		//2. Segregate only visible images in page
		List<WebElement> vimages=new ArrayList<WebElement>();
		for(WebElement image:allimages)
		{
			if(image.isDisplayed())
			{
				vimages.add(image);
			}
		}
		System.out.println(vimages.size());
		//3. Highlight those visible images
		for(WebElement vimage:vimages)
		{
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].style.border='2px green solid';", vimage);
		}
	}
}
