
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropdownlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='colors']")));
		
		ArrayList originallist=new ArrayList();
		ArrayList duplicate=new ArrayList();
		List<WebElement> all=dropdown.getOptions();
		for(WebElement option:all)
		{
			originallist.add(option.getText());;
			duplicate.add(option.getText());
		}
		System.out.println("printing before sort"+originallist);
		System.out.println("print before sort"+duplicate);
		
		Collections.sort(duplicate);
		System.out.println("printing after sort"+originallist);
		System.out.println("print after sort"+duplicate);
		
		if(originallist.equals(duplicate))
		{
			System.out.println("list is sorted");
		}
		else
		{
			System.out.println("list is not sorted");
		}
		driver.quit();
		
	}

}
