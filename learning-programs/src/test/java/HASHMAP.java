

import java.util.HashMap;
import java.util.Map;

public class HASHMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m=new HashMap();
		//add key value pair
		m.put(101, "rakesh");
		m.put(102, "purush");
		m.put(103, "linga");
		m.put(104, "siva");
		m.put(105, "siva");
		//m.put(102, "sivaram");override the  previous value
		System.out.println(m);
		System.out.println(m.get(101));
		m.remove(105);
		System.out.println(m);
	System.out.println(m.containsKey(105));//false
	System.out.println(m.containsValue("purush"));//true
	System.out.println(m.isEmpty());//false
	System.out.println(m.keySet());//this will return all keys
	System.out.println(m.values());//this will return all valueds as set
	System.out.println(m.entrySet());//return all the entries a set
	
	//Entry methods
	/*for(Map.Entry entry:m.entrySet())
	{
		System.out.println(entry.getKey()+"       "+entry.getValue());
	}*/
		

	}

}
