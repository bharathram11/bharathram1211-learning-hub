package javaExcercises;

import org.openqa.selenium.chrome.ChromeDriver;

public class Work6 implements Runnable
{
	public void run() //method name should be run()
	{
		System.out.println("thread1 is running..."); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
	}
}









