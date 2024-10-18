package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test13 
{
	public static void main(String[] args) 
	{
		//Cross-Browser
		String bn;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		bn=sc.nextLine();
		sc.close();
		//Open any browser
		WebDriver driver; //declare object to an interface
		if(bn.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver(); //define that object using concrete class's class
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Please enter correct browser name");
		}
		
	}
}
