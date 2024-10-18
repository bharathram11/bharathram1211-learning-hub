package zero;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class YahooImplicit {

	public static void main(String[] args) throws Exception 
	{
		//Open chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch yahoo site
		driver.get("http://www.yahoomail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.linkText("Sign in")).click();
		
		//Do login
		WebElement e=driver.findElement(By.id("login-username"));
		
		e.sendKeys("testsedt12@yahoo.com");
		
		driver.findElement(By.id("login-signin")).click();
		
		driver.findElement(By.id("login-passwd")).sendKeys("Sdet@1211,12");
		
		driver.findElement(By.id("login-signin")).click();
		
		driver.findElement(By.linkText("Compose")).click();
		
		//fill fields
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("bharathsdet@fastmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("test-mail");
		
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("hi\nhow are you\n have a great day");
		
		//attach file(file upload)
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\bhara\\Downloads\\selenium2pdf.pdf");
		
		//send mail
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		
		//get text like(message sent) 
	Thread.sleep(5000);
//		List<WebElement>x=driver.findElements(By.xpath("(//div[@role='presentation']/following-sibling::div)[1]"));
//		 for(WebElement element:x)
//		 {
//			 String a=element.findElement(By.xpath("span")).getText();
//			// String b=element.findElement(By.xpath("a/span")).getText();
//			 System.out.println(a);
//		 }
	   String text=driver.findElement(By.xpath("//div[@role='presentation']/following-sibling::div[1]")).getText();
	   System.out.println(text);
	   
	 //Take new window/Tab and switch to it
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   Set<String> s=driver.getWindowHandles(); 
		List<String> a=new ArrayList<String>(s); 
		driver.switchTo().window(a.get(1));
		//Launch fast mail site
	   driver.get("http://www.fastmail.com");
	  
	   driver.findElement(By.linkText("Log in")).click();
	  
	   driver.findElement(By.xpath("//input[@id='v20-input']")).sendKeys("bharathsdet@fastmail.com");
	   
	   driver.findElement(By.name("current-password")).sendKeys("Bharath@411");
	  
	   driver.findElement(By.xpath("//span[text()='Log in']")).click();
	   
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
	  String k=driver.findElement(By.xpath("(//div[@role='gridcell']/span[text()='test-mail'])[1]")).getAttribute("title");
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
	  
	  driver.findElement(By.xpath("//a[@title='Shortcut: L']")).click();
	  
	  driver.close();
	  
	//Logout in yahoo mail
	  driver.switchTo().window(a.get(0)); //back to yahoo mail
	  driver.findElement(By.id("ybarAccountMenuOpener")).click();
	 
	  driver.findElement(By.id("profile-signout-link")).click();
	 
		driver.close(); //close yahoo mail
		
		  driver.quit();
	  

	  
	  
	}

}
