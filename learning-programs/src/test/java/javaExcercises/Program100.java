package javaExcercises;

public class Program100 extends Thread
{
	public static void main(String[] args)
	{
		Work1 obj1=new Work1();
		Work2 obj2=new Work2();
		Work3 obj3=new Work3();
		obj1.start();
		obj2.start();
		obj3.start();
	}
}







