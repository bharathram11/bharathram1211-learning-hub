package javaExcercises;

import java.util.Arrays;
import java.util.List;

public class Program71
{
	public static void main(String[] args)
	{
		List<String> names=Arrays.asList("abdul","kalam","steave","sisters");
		long l1=names.stream().count();
        System.out.println(l1);
        long l2=names.stream().limit(3).count();
        System.out.println(l2);
        long l3=names.stream().filter(s -> s.length()==5).count();
        System.out.println(l3);
        
       /* int count=0;
        for(String x:names)
        {
        	if(x.length()==5)
        	{
        		count++;
        	}
        }
        System.out.println(count);*/
	}
}
