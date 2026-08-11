

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	    WebElement alllist=driver.findElement(By.xpath("//select[@id='colors']"));
	    Select sel=new Select(alllist);
	    		for(WebElement a:sel.getOptions())
	    		{
	    			if(a.getText().equals("Blue"))
	    			{
	    				a.click();
	    				break;
	    			}
	    		}
	
		
		
		
	}
}
		

