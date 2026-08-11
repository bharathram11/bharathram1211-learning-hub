

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckbox {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		Thread.sleep(3000);
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@value='blue']")).click();
		
		//select specific checkbox
		List<WebElement>allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(allcheckbox.size());
		/*for(WebElement check:allcheckbox)
		{
			check.click();
		}*/
		
		//select last two checkbox
		/*for(int i=allcheckbox.size()-2;i<allcheckbox.size();i++)
		{
			allcheckbox.get(i).click();
		}*/
		
		for(int i=0;i<=allcheckbox.size();i++)
		{
			if(i<2)
			{
				allcheckbox.get(i).click();
			}
		}

	}

}
