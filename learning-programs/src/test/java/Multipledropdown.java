

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
		Select simple=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		simple.selectByVisibleText("Option 1");
		Select dob=new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dob.selectByIndex(1);
		Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByValue("IN");
	}

}
