package javaExcercises;

public class Program40
{
	public static void main(String[] args)
	{
		String x="my name is kalam";
		String y=x.substring(3,6); 
		//returns a substring begins at the specified "beginIndex" and extends to the character 
		//at index (endIndex-1).Thus the length of the substring is (endIndex-beginIndex). 
		System.out.println(y);
		String z=x.substring(3,60);  //"StringIndexOutOfBoundsException" will come
		System.out.println(z);
		
	}
}
