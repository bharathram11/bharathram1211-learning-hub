package javaExcercises;

import java.util.Arrays;
import java.util.List;

public class Program74
{
	public static void main(String[] args)
	{
		List<Integer> numbers=Arrays.asList(2,3,4,5,6,7,8,9);
		/*int sum=numbers.stream().reduce(0,(ans,i)->ans+i);  //2,5,9,14,20,27,35,44   //ans=ans+i
		System.out.println(sum);
		int evensum=numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);  //20 
		System.out.println(evensum);
		int oddsum=numbers.stream().filter(x->x%2!=0).reduce(0,(ans,i)-> ans+i);  //24
		System.out.println(oddsum);*/
		
		int sum=0;
		for(Integer i:numbers)
		{
			sum=sum+i;    //sum=0+2, sum=2+3, sum=5+4,sum=9+5,sum=14+6,sum=20+7,sum=27+8,sum=35+9
		}
		System.out.println(sum);
		
		int even=0;
		int odd=0;
		for(Integer i:numbers)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}







