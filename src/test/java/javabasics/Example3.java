package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();//in array index starts from 0
		myList.add("apple");//0
		myList.add("banana");//1
		myList.add("cherry");//2
		myList.add("apple"); //3  //no error, it allows duplicates
		System.out.println(myList.get(1)); // banana
		System.out.println(myList.get(0)); // apple
		System.out.println(myList.get(3)); // apple
		System.out.println(myList.get(2)); // cherry
		//System.out.println(myList.get(4)); // raises "IndexOutOfBoundsException" because no 5th value

	}
}

