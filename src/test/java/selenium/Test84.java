package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;

public class Test84 {

	public static void main(String[] args) throws Exception 
	{
		//Open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch yahoo site
		driver.get("http://www.yahoomail.com");
		Thread.sleep(5000);
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
		driver.findElement(By.linkText("Compose")).click();
		Thread.sleep(5000);
		//fill fields
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("bharathsdet@fastmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("test-mail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("hi\nhow are you\n have a great day");
		Thread.sleep(3000);
		//attach file(file upload)
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\test76totest86.zip");
		Thread.sleep(4000);
		//send mail
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(5000);
//		
		//get text like(message sent) 
	   String text=driver.findElement(By.xpath("//div[@role='presentation']/following-sibling::div[1]")).getText();
	   System.out.println(text);
	   //
//	   List<WebElement>x=driver.findElements(By.xpath("(//div[@role='presentation']/following-sibling::div)[1]"));
//		 for(WebElement element:x)
//		 {C:\Users\bhara\OneDrive\Pictures\Screenshots
//			 String a=element.findElement(By.xpath("span")).getText();
//			 String b=element.findElement(By.xpath("a/span[1]")).getText();
//			 System.out.println(a+b);
//		 }
	   
	 //Take new window/Tab and switch to it
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   Set<String> s=driver.getWindowHandles(); 
		List<String> a=new ArrayList<String>(s); 
		driver.switchTo().window(a.get(1));
		//Launch fast mail site
	   driver.get("http://www.fastmail.com");
	   Thread.sleep(5000);
	   driver.findElement(By.linkText("Log in")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[@id='v20-input']")).sendKeys("bharathsdet@fastmail.com");
	   Thread.sleep(3000);
	   driver.findElement(By.name("current-password")).sendKeys("Bharath@411");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[text()='Log in']")).click();
	   Thread.sleep(4000);
	 //Test latest mail "From address" in mailbox
	  String p= driver.findElement(By.xpath("(//ul[contains(@class,'Mailbox')]/li//span/span)[1]")).getAttribute("title");
	  if(p.equals("testsedt12@yahoo.com"))
	  {
		  System.out.println("From address is matched");
	  }
	  else
	  {
		  System.out.println("From address not matched");
	  }
	  
	  
	//Test "subject" of latest mail in mailbox
	  String k=driver.findElement(By.xpath("(//div[@role='gridcell' and contains(@class,'v-MailboxItem-subject ')]/span[2])[1]")).getAttribute("title");
	  if(k.equals("test-mail"))
	  {
		  System.out.println("Subject is matched");
	  }
	  else
	  {
		  System.out.println("Subject is not matched");
	  }
	//Logout in fast mail
	  driver.findElement(By.xpath("//button[contains(@title,'Open main menu')]")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//a[@title='Shortcut: L']")).click();
	  Thread.sleep(4000);
	  driver.close();
	  
	//Logout in yahoo mail
	  driver.switchTo().window(a.get(0)); //back to yahoo mail
	  driver.findElement(By.id("ybarAccountMenuOpener")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.id("profile-signout-link")).click();
	  Thread.sleep(5000);
		driver.close(); //close yahoo mail
		 Thread.sleep(5000);
		  driver.quit();
	  

	  
	  
	}

}
