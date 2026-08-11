package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListdemo3 {
public static void main(String[] args) {
	String arr[]= {"dog","cat","rat","zebra"};
	for(String ar:arr)
	{
		System.out.println(ar+" ");
	}
	ArrayList al=new ArrayList(Arrays.asList(arr));
	System.out.println(al);
}
}
