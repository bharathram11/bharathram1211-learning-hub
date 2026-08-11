package javaExcercises;

public class Program33
{
	public static void main(String[] args)
	{
		//Only for "String" class(because "String" is immutable)
		String x1=new String("abdul kalam");
		String x2=new String("abdul kalam");
		//Common memory refereed by both x1 and x2 due to value is same 
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());
		String y1=new String("Steve Jobs");
		String y2=new String("steve jobs");
		//"String" is immutable but different memory reference for both y1 and y2 
		//due to different values
		System.out.println(y1.hashCode());
		System.out.println(y2.hashCode());
		//Other class(not immutable) objects(Except "String" class)
		//Different memory for both s1 and s2, so hash codes are different
		StringBuilder s1=new StringBuilder("kalam");
		StringBuilder s2=new StringBuilder("kalam");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
