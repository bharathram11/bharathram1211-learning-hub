package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example37
{
	public static void main(String[] args) 
	{
		//1. variable (declared and created using Primitive data types like int, char, float ...etc)
		int x=10;
		System.out.println(x); //value will be displayed
		//2. object (declared and created using User defined data type(classes or interfaces or Enums)
		WebDriver driver=new ChromeDriver();
		System.out.println(driver); //Address of corresponding memory location will be displayed
		driver.close();
		//3. variable or object (declared and created using Derived data type like String and Arrays)
		//Way-1:
		String s1="abdul kalam"; //declared as variable
		System.out.println(s1.length()); //used as object
		//way-2:
		String s2=new String("Steve Jobs"); //Created as object
		System.out.println(s2); //Used as variable
	}
}
