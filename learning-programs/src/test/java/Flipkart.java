

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product type to search");
		String pro=sc.nextLine();
		sc.close();
		//open browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//Close login banner if exist
		try
		{
			driver.findElement(By.xpath("//span[@role='button']")).click();
		}
		catch(Exception ex)
		{
			System.out.println("No banner exists");
		}
		//Search for a product
		driver.findElement(By.name("q")).sendKeys(pro, Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@data-tkid,'SEARCH')])[1]")).click();
		Thread.sleep(3000);
		Set<String>x=driver.getWindowHandles();
		List<String>y=new ArrayList<String>(x);
		driver.switchTo().window(y.get(1));
		driver.findElement(By.xpath("(//ul[@class='row']//button)[1]")).click();
		String xx=driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
		System.out.println(xx);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Place Order']/parent::button[@class='QqFHMw zA2EfJ _7Pd1Fp']")).click();	
	}
}
