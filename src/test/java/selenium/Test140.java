package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test140
{
	public static void main(String[] args) throws Exception
	{
		//open browser(operation)
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site(operation)
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_value");
		Thread.sleep(5000);
		//4. Get text of visible element with no text, but has "value" attribute in source code
		driver.switchTo().frame("iframeResult");
		String x=driver.findElement(By.name("fname")).getText();
		System.out.println(x); //empty value 
		String y=driver.findElement(By.name("fname")).getAttribute("value");
		System.out.println(y); //get value of "value" attribute
		//close site
		driver.quit();
	}
}
