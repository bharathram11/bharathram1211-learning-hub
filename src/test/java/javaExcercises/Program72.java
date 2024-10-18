package javaExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program72
{
	public static void main(String[] args)
	{
		List<Integer> numbers=Arrays.asList(2,3,2,5);
		/*Set<Integer> s=numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(s); //Set does not support duplicate values
		List<Integer> l=numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(l);*/
        
		Set<Integer> y=new HashSet<Integer>();
		List<Integer>z=new ArrayList<Integer>();
        for(Integer s:numbers)
        {
        	int a=s*s;
        	y.add(a);
        	z.add(a);
        }
        System.out.println(y);
        System.out.println(z);
	}
}









