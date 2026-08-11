import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> elementss=driver.findElements(By.xpath("//img"));//  //*     //img   //a
		System.out.println(elementss.size());
		int vc=0;int hc=0;
		for(WebElement img:elementss)
			{
			if(img.isDisplayed())
			{
				vc++;
				//((JavascriptExecutor)driver).executeScript("arguments[0].style.border='4px green solid';",img);
			}
			else
			{
				hc++;
			}
			}
		System.out.println("visible:"+vc);
		System.out.println("hidden:"+hc);;

	}

}
