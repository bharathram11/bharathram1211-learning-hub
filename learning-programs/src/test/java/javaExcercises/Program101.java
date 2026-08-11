package javaExcercises;

public class Program101 extends Thread
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new Work4());
		Thread t2=new Thread(new Work5());
		Thread t3=new Thread(new Work6());
		t1.start();
		t2.start();
		t3.start();
	}
}







