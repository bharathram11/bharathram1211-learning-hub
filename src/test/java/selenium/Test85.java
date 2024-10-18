package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test85 
{

	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fastmail.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='v20-input']")).sendKeys("bharathsdet@fastmail.com");
		driver.findElement(By.name("current-password")).sendKeys("Bharath@411");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[@title='Shortcut: c']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.className("v-EmailInput-input")).sendKeys("testsedt12@yahoo.com");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[contains(@class,'v-TextInput-input')])[3]")).sendKeys("Selenium");
		 Thread.sleep(3000);
		 
		// driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\bhara\\Pictures\\Screenshots\\Screenshot 2024-08-12 092900.png");

		 driver.findElement(By.xpath("//span[text()='Attach']")).click();
		 Thread.sleep(1000);
	     driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\automaion\\Selenium notes part-1.pdf");
		Thread.sleep(10000);
		 driver.findElement(By.xpath("//div[@aria-multiline='true']/div")).sendKeys("Hi\nhow are you?");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@title='Shortcut: Ctrl-Enter']")).click();
		 Thread.sleep(4000);
		 
		 List<WebElement>x=driver.findElements(By.xpath("//div[@class='v-NotificationContainer']//p"));
		 for(WebElement element:x)
		 {
			 String a=element.findElement(By.xpath("child::span")).getText();
			 String b=element.findElement(By.xpath("child::button")).getText();
			 System.out.println(a+b);
		 }
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);
		   Set<String> s=driver.getWindowHandles(); 
			List<String> a=new ArrayList<String>(s); 
			driver.switchTo().window(a.get(1));
			
			driver.get("http://www.yahoomail.com");
			driver.findElement(By.linkText("Sign in")).click();
			Thread.sleep(5000);
			//Do login
			driver.findElement(By.id("login-username")).sendKeys("testsedt12@yahoo.com");
			driver.findElement(By.id("login-signin")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("login-passwd")).sendKeys("Sdet@1211,12");
			Thread.sleep(5000);
			driver.findElement(By.id("login-signin")).click();
			Thread.sleep(7000);
			
			String p= driver.findElement(By.xpath("(//ul[contains(@aria-label,'Message list.')]/li[3])//span[@data-test-id='senders_list']")).getAttribute("title");
			  if(p.equals("bharathsdet@fastmail.com"))
			  {
				  System.out.println("Address is matched");
			  }
			  else
			  {
				  System.out.println("Address not matched");
			  }
			  Thread.sleep(4000);
			  String k=driver.findElement(By.xpath("//span[@data-test-id='message-subject']")).getAttribute("title");
			  if(k.equals("Selenium"))
			  {
				  System.out.println("Subject is matched");
			  }
			  else
			  {
				  System.out.println("Subject is not matched");
			  }
			  driver.findElement(By.id("ybarAccountMenuOpener")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.id("profile-signout-link")).click();
			  Thread.sleep(5000);
			  driver.close(); //close yahoo mail
			  driver.switchTo().window(a.get(0));
			//Logout in fast mail
			  driver.findElement(By.xpath("//button[contains(@title,'Open main menu')]")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("//a[@title='Shortcut: L']")).click();
			  Thread.sleep(4000);
			  driver.close();
			  Thread.sleep(5000);
			  driver.quit();
	}

}
