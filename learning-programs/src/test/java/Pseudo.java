

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pseudo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		List<WebElement>all=driver.findElements(By.xpath("//form[@id='form-register']//label"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0]", args)
		for(WebElement allone:all)
		{
			System.out.println(allone.getText());
		String script="return window.getComputedStyle(arguments[0],'::Before').getPropertyValue('content');";
			String content=js.executeScript(script, allone).toString();
			System.out.println(content);
		}

	}

}
