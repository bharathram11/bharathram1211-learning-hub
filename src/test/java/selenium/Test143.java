package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test143 
{
	public static void main(String[] args) throws Exception
	{
		//open browser(operation)
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site(operation)
		driver.get("https://www.worldometers.info/world-population/");
		Thread.sleep(5000);
		//Locate parent element
		WebElement parent=driver.findElement(By.xpath("//span[@rel='current_population']"));
		//1.Get text of a parent element including text of all child dynamic elements using getText()
		String x=parent.getText();
		System.out.println(x);
		//2. locate parent, but get text of specific dynamic child element(8th line) using JavaScript
		String y=(String) driver.executeScript(
				      "return(arguments[0].childNodes[arguments[1]].textContent);",parent, 7);
		System.out.println(y);
		//3. Get all dynamic child elements text one after other using JavaScript
		for(int i=0;i<8;i++)
		{
			String z=(String) driver.executeScript(
				      "return(arguments[0].childNodes["+i+"].textContent);",parent);
			System.out.println(z);
		}
		//close site
		driver.quit();
	}
}
