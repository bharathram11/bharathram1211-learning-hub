package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test76
{
	public static void main(String[] args) throws Exception
	{
		//open "chrome" browser 
		WebDriver driver=new ChromeDriver();
		//Launch site using URL
		driver.get(
		 "https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
		Thread.sleep(5000);
		//switch to frame and click on a button to get a web alert
		driver.switchTo().frame("iframewrapper"); 
		driver.findElement(By.xpath("//input[@value='Click me']")).click();
		Thread.sleep(5000);
		//switch to alert
		Alert al=driver.switchTo().alert();
		String x=al.getText(); //get visible text in that alert
		System.out.println(x);
		al.accept(); //close alert(Here, "driver" will back to frame by default)
		Thread.sleep(5000);
		//back to page from frame
		driver.switchTo().defaultContent(); 
		//close site
		//driver.close();
	}
}



















