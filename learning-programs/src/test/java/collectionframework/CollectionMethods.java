package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> col=new ArrayList<String>();
		Collection<String> newq=new ArrayList<String>();
		
		//col.add(Object o)
		col.add("hi");
		col.add("hello");
		col.add("xyz");
		col.add("abcd");
		col.add("ilo");
		col.add("klo");
		System.out.println("after adding "+col);//[hi, hello, xyz, abcd, ilo, klo]
		//collection addAll
		newq.addAll(col);
		System.out.println("after adding to empty collection"+newq);//[hi, hello, xyz, abcd, ilo, klo]
		//remove
		col.remove("hi");
		System.out.println("after removing hi"+col);//[hello, xyz, abcd, ilo, klo]
		//removeAll
		newq.removeAll(col);
		System.out.println("after removing all elements in col"+newq);//[hi]
		col.retainAll(newq);
		System.out.println("expect the value in col"+col);//[]
		//clear
		col.clear();
		newq.clear();
		System.out.println("after clearing all"+col);
		System.out.println("after clearing all"+newq);
		System.out.println("check whether its empty "+col.isEmpty());
		System.out.println("check whether its empty "+newq.isEmpty());
		System.out.println(col.size());
		System.out.println(col.contains("hi"));
		System.out.println(col.contains(newq));
		System.out.println(col.toArray());
	}
}
/*
Methods Covered:
add(E e): Adding elements to the collection. ✅
addAll(Collection<? extends E> c): Adding all elements from another collection. ✅
remove(Object o): Removing a specific element. ✅
removeAll(Collection<?> c): Removing all elements from another collection. ✅
retainAll(Collection<?> c): Retaining only elements present in another collection. ✅
clear(): Removing all elements from the collection. ✅
isEmpty(): Checking if the collection is empty. ✅
size(): Getting the size of the collection. ✅
contains(Object o): Checking if an element exists in the collection. ✅
toArray(): Converting the collection to an array. ✅*/