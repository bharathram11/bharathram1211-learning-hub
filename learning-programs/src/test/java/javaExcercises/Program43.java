package javaExcercises;

public class Program43
{
	public static void main(String[] args)
	{
		String x="Product value is RS:4567.78/- in india";
		String y=x.substring(8); //get data from 8th position to end
		System.out.println(y); 
		String z=x.substring(8,20); //get data from 8th position to 19th position
		System.out.println(z); 
		String w=x.substring(x.indexOf(':')+1, x.indexOf('/'));
		System.out.println(w); 
	}
}
