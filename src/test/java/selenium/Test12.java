package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test12 {

	public static void main(String[] args) throws Exception {
		
		//3 way of code to  open a firefox driver
		FirefoxDriver driver1=new FirefoxDriver();
		WebDriver driver2 =new FirefoxDriver();
		RemoteWebDriver driver3=new FirefoxDriver();
		driver1.close();
		driver2.close();
		driver3.close();
		
	}
}
