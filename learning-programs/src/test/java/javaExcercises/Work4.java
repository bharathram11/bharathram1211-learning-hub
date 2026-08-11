package javaExcercises;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Work4 implements Runnable
{
	public void run() //method name should be run()
	{
		System.out.println("thread2 is running..."); 
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
}









