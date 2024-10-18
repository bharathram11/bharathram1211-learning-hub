package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test142
{
	public static void main(String[] args) throws Exception
	{
		//open browser(operation)
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site(operation)
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate an element
		WebElement e=driver.findElement(By.xpath("(//div[@class='ui ignored info message'])[1]"));
		//1. Get text of an element including text of all child elements using getText()
		String x=e.getText();
		System.out.println(x);
		//2. Get text of an element excluding text of all child elements using getText()
		List<WebElement> childs=e.findElements(By.xpath("descendant::*"));
		String y=e.getText();
		for(WebElement child:childs) 
		{
            y=y.replaceFirst(child.getText(),"");
        }
		System.out.println(y);
		//3. Get text of specific child(1st child) element using getText()
		String z=childs.get(0).getText(); //1st child
		System.out.println(z);
		//4. Get all child elements text one after other using getText()
		for(WebElement child:childs) 
		{
			System.out.println(child.getText());
        }
		//5. Get text in specific line of element(3rd line) using JavaScript
		String w=(String) driver.executeScript(
			      "return(arguments[0].childNodes[2].textContent);",e);
		System.out.println(w);
		//close site
		driver.quit();
	}
}
