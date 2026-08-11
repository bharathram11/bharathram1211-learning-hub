

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("welcome");
		hs.add('A');
		hs.add(43.98);
		System.out.println(hs);//inserton order not preserved[A, 100, welcome, 43.98]

		
		hs.remove('A');
		System.out.println(hs); //[100, welcome, 43.98]
		System.out.println(hs.contains(43.98));
		System.out.println(hs.isEmpty());
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//use addAll to add all elememts in duplicate list
		//use removeAll
		//set1 and set2 are two hash set  for union set1.addAll(set2)
		//for intesection set1.retainALL(set2);for diff set1.removeAll(set2) and print set1
	}

}
