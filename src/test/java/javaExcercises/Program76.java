package javaExcercises;

import java.util.Arrays;
import java.util.List;

public class Program76
{
	//Constructor methods
	public Program76() //without arguments
	{
		System.out.println("object has created");
	}

	public Program76(int x) //with arguments
	{
		System.out.println(x);
	}
	//Operational methods
	public void method1(int x) //non-static method
	{
		System.out.println(x);
	}
	
	public static void method2(int x) //static method
	{
		System.out.println(x);
	}
	//Runner method
	public static void main(String[] args) 
	{
		//call non-static method using "." operator
		Program76 obj1=new Program76();
		obj1.method1(105);
		//call non-static method using "::" operator
		List<Integer> l1=Arrays.asList(2,5,7,9);
		l1.forEach(obj1::method1);
		
		//call static method using "." operator
		Program76.method2(105);
		//call static method using "::" operator
		l1.forEach(Program76::method2);
		
		//call constructor method 
		Program76 obj2=new Program76(1902);
		//call constructor method using :: operator
		l1.forEach(Program76::new);	
		
	}
}




