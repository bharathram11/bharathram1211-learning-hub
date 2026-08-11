package javaExcercises;

import java.util.Arrays;
import java.util.List;

public class Program75
{
	public static void main(String[] args)
	{
		List<Integer> number=Arrays.asList(2,3,4,5,6,7,8,9);
	    int sum=number.parallelStream().reduce(0,(ans,i)-> ans+i,Integer::sum);
		System.out.println(sum);
		int evensum=number.parallelStream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i,Integer::sum);
		System.out.println(evensum);
		int oddsum=number.parallelStream().filter(x->x%2!=0).reduce(0,(ans,i)-> ans+i,Integer::sum);
		System.out.println(oddsum);
		
	}
}
