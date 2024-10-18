package javaExcercises;

import java.util.Arrays;
import java.util.List;

public class Program73
{
	public static void main(String[] args)
	{
        List<Integer> numbers=Arrays.asList(2,3,4,5);
		//numbers.stream().map(x->x*x).forEach(y->System.out.print(y+" "));
		int y=1;
		for(Integer x:numbers)
		{
			y=x*x;
			System.out.print(y+" ");
		}
	}
}
