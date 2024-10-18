package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24
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
        //close all browser window/tabs
        driver.quit();
	}
}



