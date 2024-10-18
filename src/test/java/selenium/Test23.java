package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
        WebDriver driver=new ChromeDriver();
        //Launch site
        driver.navigate().to("http://www.w3schools.com"); 
        Thread.sleep(5000);
        //click on a button to get new tab
        driver.findElement(By.linkText("Try it Yourself")).click();
        Thread.sleep(5000);
        //get window handle values of all browser windows/tabs
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1)); //switch to 2nd tab
        //close 2nd browser window/tab because "driver" object switched to 2nd tab
        driver.close();
        //switch back to 1st tab
       // driver.switchTo().window(l.get(0));
	}
}



