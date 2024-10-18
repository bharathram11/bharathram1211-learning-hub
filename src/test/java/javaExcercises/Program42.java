package javaExcercises;

public class Program42 
{
	public static void main(String[] args)
	{
		String x="my name is kalam";
		//get index of last occurrence of "a"
		int index1=x.lastIndexOf('a');
		System.out.println(index1); //14
		int index2=x.lastIndexOf('a',10);
		System.out.println(index2); //4
		//get index of 1st occurrence of "am"
		int index3=x.lastIndexOf("am");
		System.out.println(index3); //14
		int index4=x.lastIndexOf("am",10);
		System.out.println(index4); //4
	}
}
