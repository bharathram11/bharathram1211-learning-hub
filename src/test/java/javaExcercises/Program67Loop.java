package javaExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program67Loop
{
	public static void main(String[] args)
	{
		long start=System.currentTimeMillis();
		System.out.println(start);
		//1. take an Integer list with values
		List<Integer> x=Arrays.asList(2,3,4,5,6,8,10);
		//2. Take an empty list
		List<Integer> y=new ArrayList<Integer>();
		//Calculate square for each value in 1st list and add that value to 2nd list
		for(Integer n:x)
		{
			y.add((int) Math.pow(n, 2));
		}
        System.out.println(y);
        long end=System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start); // in millisec
	}
}
