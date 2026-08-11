package javaExcercises;

import org.openqa.selenium.edge.EdgeDriver;

public class Work5 implements Runnable
{
	public void run() //method name should be run()
	{
		System.out.println("thread3 is running..."); 
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.google.co.in");
	}
}












