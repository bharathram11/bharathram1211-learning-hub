package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
        WebDriver driver=new ChromeDriver();
        //Launch site
        driver.get("http://www.w3schools.com"); 
        Thread.sleep(5000);
        //click on a button to get new tab
        driver.findElement(By.linkText("Try it Yourself")).click();
        Thread.sleep(5000);
        //get window handle values of all browser windows/tabs
        Set<String> x=driver.getWindowHandles();
        System.out.println(x);
	}
}
