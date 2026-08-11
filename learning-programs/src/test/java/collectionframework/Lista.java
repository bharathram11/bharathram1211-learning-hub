package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		List<String>ki=new ArrayList<>();
		li.add(0,"hi");
		li.add(1,"hello");
		li.add(2,"good");
		li.add(3,"ravi");
		li.add(4,"namaste");
		li.add(5,"ji");
		System.out.println("after adding al "+li);//[hi, hello, good, ravi, namaste, ji]
		li.remove(1);
		System.out.println("after removing index 1 value "+li);//[hi, good, ravi, namaste, ji]
		ki.addAll(li);
		System.out.println("after adding all to an empty list "+ki);// [hi, good, ravi, namaste, ji]
		System.out.println("get value at index 0 "+li.get(0));//hi
		li.set(1, "ramu");
		System.out.println("after setting value "+li);//[hi, ramu, ravi, namaste, ji]
		System.out.println(li.indexOf("ji"));
		System.out.println(ki.lastIndexOf("ji"));
		List<String> subList = li.subList(1, 3);
		System.out.println("Sublist from index 1 to 3: " + subList);
		

	}

}
