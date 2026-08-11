

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		//add elements
		
		l.add(100);
		l.add("hi");
		l.add("bharath");
		l.add('A');
		l.add(45.6);
		l.add(true);
		System.out.println(l.size()); //6
		
		//remove
		l.remove(2);
		System.out.println(l);//[100, hi, A, 45.6, true]

		//adding element in the middle of elements
		l.add(3, "java");
		System.out.println(l); //[100, hi, A, java, 45.6, true]
		
		//retriving the values
		System.out.println(l.get(3)); //java
		
		//replace value
		l.set(2, "ariga");
		System.out.println(l);//[100, hi, ariga, java, 45.6, true]
		
	//contains 
	System.out.println(l.contains("java"));//true
	//isempty 
	System.out.println(l.isEmpty());//false
	
	//to read the data from linked list
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	for(Object a:l)
	{
		System.out.println(a);
	}
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	LinkedList dup=new LinkedList();
    dup.addAll(l);
    System.out.println(dup);//[11, ram, ravi, A, 87654]
    dup.removeAll(l);
    System.out.println(dup);//[]
    //for sorting we need to use collections class sort method
    Collections.sort(l);  //for same data type
    Collections.sort(l,Collections.reverseOrder());//for reverse order
    Collections.shuffle(l);
    LinkedList w=new LinkedList();
    l.add("dog");
    l.add("cat");
    l.add("tiger");
    System.out.println(w);
    l.addFirst("cow");
    l.addLast("lion");
    System.out.println(w);
    System.out.println(w.getFirst());
    System.out.println(w.getLast());
    w.removeFirst();
    w.removeLast();
    System.out.println("after removing"+w);
	}

}
