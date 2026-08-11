package javaExcercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.WebDriver;

public class Program44
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.google.co.in");
		WebElement e=driver.findElement(By.name("q"));
		//way-1(Type casting)
		String x=(String) ((ChromiumDriver) driver).executeScript("return(arguments[0].textContent);",e);
		//way-2(toString() method in "Object" class)
		String y=((ChromiumDriver) driver).executeScript("return(arguments[0].textContent);",e).toString();
		//way-3(using "valueOf()" method in String class)
		Object o1=((ChromiumDriver) driver).executeScript("return(arguments[0].textContent);",e);
		String z="";
		x=z.valueOf(o1);
	}
}








