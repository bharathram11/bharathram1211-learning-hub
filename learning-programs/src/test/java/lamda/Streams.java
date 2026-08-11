package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		
//		List<Integer> numbers=new ArrayList<Integer>();
//		numbers.add(10);
//		numbers.add(11);
//		numbers.add(16);
//		numbers.add(19);
//		numbers.add(20);
		
		List<Integer>number=Arrays.asList(10,11,16,19,20);
//		for(Integer num:number){
//			if(num%2==0)
//			{
//				even.add(num);
//			}
//		}
		
//		List<Integer>even=number.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(even);
		
		//number.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
//		number.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}
}
