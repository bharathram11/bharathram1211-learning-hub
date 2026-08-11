

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicateoptionsinlistbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	    WebElement alllist=driver.findElement(By.xpath("//select[@id='colors']"));
		
		Select listbox=new Select(alllist);
		Set<String>unique=new HashSet<String>();
		List<String>all=new ArrayList<String>();
		
		for(WebElement one:listbox.getOptions())
		{
			String optiontext=one.getText();
			all.add(optiontext);
			unique.add(optiontext);
		}
		System.out.println(all);
		System.out.println(unique);
	}

}
