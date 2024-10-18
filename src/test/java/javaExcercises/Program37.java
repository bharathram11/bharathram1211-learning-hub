package javaExcercises;

public class Program37
{
	public static void main(String[] args)
	{
		String x="abdul kalam";
		char c1=x.charAt(0); //a
		System.out.println(c1);
		char c2=x.charAt(8); //l
		System.out.println(c2);
		char c3=x.charAt(100); //"StringIndexOutOfBoundsException" will come
		System.out.println(c3);
	}

}
