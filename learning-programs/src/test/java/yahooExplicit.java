

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.BrowserWindowUtility;
import utilities.WebSiteUtility;

import org.openqa.selenium.WebDriver;

public class yahooExplicit {

	public static void main(String[] args) throws Exception 
	{
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=WebSiteUtility.openBrowser("chrome");
		
		//driver.manage().window().maximize();
		BrowserWindowUtility.browserMaximize(driver);
		
		FluentWait<WebDriver> wait=WebSiteUtility.defineExplicitWait(driver, 40, 1000);
	
		//driver.get("http://www.yahoomail.com");
		WebSiteUtility.launchSite(driver, "http://www.yahoomail.com");
		
		//driver.findElement(By.linkText("Sign in")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();
				
		
		//driver.findElement(By.id("login-username")).sendKeys("testsedt12@yahoo.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username"))).sendKeys("testsedt12@yahoo.com");
		
		//driver.findElement(By.id("login-signin")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-signin"))).click();
	
		//driver.findElement(By.id("login-passwd")).sendKeys("Sdet@1211,12");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd"))).sendKeys("Sdet@1211,12");;

		
		//driver.findElement(By.id("login-signin")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-signin"))).click();

		
		//driver.findElement(By.linkText("Compose")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Compose"))).click();

	
		
		//driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("bharathsdet@fastmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@role='combobox'])[2]"))).sendKeys("bharathsdet@fastmail.com");

		
		//driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("test-mail");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Subject']"))).sendKeys("test-mail");

		
		//driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("hi\nhow are you\n have a great day");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Message body']"))).sendKeys("hi\nhow are you\n have a great day");

	
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\automaion\\Core Java notes part-1.pdf");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test-id='icon-btn-attach']"))).sendKeys("C:\\Users\\bhara\\OneDrive\\Desktop\\kittu ressume (1) 1.pdf");
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Send']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Send']"))).click();

		
		
		//get text like(message sent) 
        String tet=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='presentation']/following-sibling::div[1]/span"))).getText();
	    System.out.println(tet);
		String text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='presentation']/following-sibling::div[1]/span"))).getText();
		System.out.println(text);
	   
	 //Take new window/Tab and switch to it
	  // driver.switchTo().newWindow(WindowType.WINDOW);
	  BrowserWindowUtility.getNewWindoworTab(driver,"window");
	  //BrowserWindowUtility.switchToDesiredBrowser(driver,Window);
	   
      //Set<String> s=driver.getWindowHandles(); 
	  //List<String> a=new ArrayList<String>(s); 
	   List<String> s= BrowserWindowUtility.getAllBrowserWindowHandlesList(driver);

		
		//driver.switchTo().window(a.get(1));
		BrowserWindowUtility.switchToDesiredBrowser(driver, s.get(1));
		
	  // driver.get("http://www.fastmail.com");
	   WebSiteUtility.launchSite(driver, "http://www.fastmail.com");
	  
	   //driver.findElement(By.linkText("Log in")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in"))).click();

	  
	  // driver.findElement(By.xpath("//input[@id='v20-input']")).sendKeys("bharathsdet@fastmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='v23-input']"))).sendKeys("bharathsdet@fastmail.com",Keys.ENTER);

	   
	   //driver.findElement(By.name("current-password")).sendKeys("Bharath@411");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("current-password"))).sendKeys("Bharath@411");;

	  
	   //driver.findElement(By.xpath("//span[text()='Log in']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log in']"))).click();

	  
	
	 // String p= driver.findElement(By.xpath("(//ul[contains(@class,'Mailbox')]/li//span/span)[1]")).getAttribute("title");
	  String p=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[contains(@class,'Mailbox')]/li//span/span)[1]"))).getAttribute("title");

	  if(p.equals("testsedt12@yahoo.com"))
	  {
		  System.out.println("From address is matched");
	  }
	  else
	  {
		  System.out.println("From address not matched");
	  }
	  
	  
	
	  //String k=driver.findElement(By.xpath("(//div[@role='gridcell' and contains(@class,'v-MailboxItem-subject ')]/span[2])[1]")).getAttribute("title");
	  String k=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='gridcell' and contains(@class,'v-MailboxItem-subject ')]/span[2])[1]"))).getAttribute("title");

	  if(k.equals("test-mail"))
	  {
		  System.out.println("Subject is matched");
	  }
	  else
	  {
		  System.out.println("Subject is not matched");
	  }
	 // driver.findElement(By.xpath("//button[contains(@title,'Open main menu')]")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@title,'Open main menu')]"))).click();
	 
	 // driver.findElement(By.xpath("//a[@title='Shortcut: L']")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Shortcut: L']"))).click();

	  
	 //driver.close();
	  WebSiteUtility.closeCurrentTab(driver);
	  
	  
	 // driver.switchTo().window(s.get(0));
	  BrowserWindowUtility.switchToDesiredBrowser(driver,s.get(0));
	 
	 // driver.findElement(By.id("ybarAccountMenuOpener")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("ybarAccountMenuOpener"))).click();
	
	 // driver.findElement(By.id("profile-signout-link")).click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("profile-signout-link"))).click();
	 
		//driver.close(); //close yahoo mail
		WebSiteUtility.closeSite(driver);
		 
	  

	  
	  
	}

}
