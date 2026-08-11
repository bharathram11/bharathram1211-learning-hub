package javaExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program67ParallelStream
{
	public static void main(String[] args)
	{
		long start=System.currentTimeMillis();
		System.out.println(start);
		List<Integer>x=Arrays.asList(2,3,4,5,6,8,10);

        List<Integer> y=x.parallelStream().map(a->(int)Math.pow(a,2)).collect(Collectors.toList());
        System.out.println(y);
        long end=System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start); // in millisec
	}
}
