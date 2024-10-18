package javaExcercises;

public class Program41 
{
	public static void main(String[] args)
	{
		String x="my name is kalam";
		//get index of 1st occurrence of "a"
		int index1=x.indexOf('a');
		System.out.println(index1); //4
		int index2=x.indexOf('a',10);
		System.out.println(index2); //12
		//get index of all occurrences of "a"
		for(int i=0; i<x.length(); i++)
		{
			if(x.charAt(i)=='a')
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//get index of 1st occurrence of "am"
		int index3=x.indexOf("am");
		System.out.println(index3); //4
		int index4=x.indexOf("am",10);
		System.out.println(index4); //14
	}
}



