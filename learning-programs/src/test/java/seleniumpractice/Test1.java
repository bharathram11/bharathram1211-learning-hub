package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("#name")).sendKeys("hello");  //1.#value #means id
		driver.findElement(By.cssSelector("input[placeholder*=EMail]")).sendKeys("bharaty433@gmail.com");//part of the attribute
		driver.findElement(By.cssSelector("input#phone[class='form-control']")).sendKeys("0987654"); //tagname#idvalue[attribute=value]
		driver.findElement(By.cssSelector("label[for='textarea']+textarea")).sendKeys("gshdahd,sasahsga,bss256tswsgsska"); //following
		driver.findElement(By.cssSelector(".form-check-input")).click(); //.classvalue
		driver.findElement(By.cssSelector("input[type='checkbox']:first-of-type")).click();//it will select first checkbox
		driver.findElement(By.cssSelector("input[value='wednesday']")).click();
		driver.findElement(By.cssSelector("input[value^='fri']")).click();//tagname[attribute^='starting value']
		WebElement e=driver.findElement(By.cssSelector("#country"));
		Select s=new Select(e);
		s.selectByValue("germany");
		WebElement e1=driver.findElement(By.cssSelector("#colors"));
		Select s1=new Select(e1);
		s1.selectByValue("green");
		driver.findElement(By.cssSelector("button[name='start'],button[class='start']")).click();

		
	}

}
