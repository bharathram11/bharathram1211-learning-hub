package javabasics;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
				Set<String> mySet=new HashSet<>();
				mySet.add("apple");
				mySet.add("banana");
				mySet.add("apple");
				mySet.add("orange");
				mySet.add("apple");
				// Won't be added, as it's a duplicate
				System.out.println(mySet);
				System.out.println(mySet.contains("banana")); // Output: true
				System.out.println(mySet.contains("gauva")); // Output: false
				System.out.println(mySet.contains("apple")); // Output: true


	}

}
