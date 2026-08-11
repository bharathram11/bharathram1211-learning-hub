package javaExcercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;

public class Program95
{
	public static void main(String[] args)
	{
		//HashMap: Allows one null key and multiple null values, overwrites existing values for the same key.
		HashMap<Integer,String> x=new HashMap<Integer,String>();			
		x.put(10,"abc");  //insert a pair(Key,value)
		x.put(null,"pqr"); //accepted(Key is NULL)
		x.put(11, null); //accepted(Value is NULL)
		x.put(11, null); //duplicate pairs accepted(Overwriting)
		x.put(null, "xyz");  // Overwrite the pair (null, "pqr") with (null, "xyz")
		
		//Hashtable: Does not allow null keys or values, and overwrites existing values for the same key.
		Hashtable<Integer,String> y=new Hashtable<Integer,String>();
		y.put(10,"abc"); //insert a pair(Key,value)
		y.put(null,"pqr"); //rejected(Key is NULL)
		y.put(11, null); //rejected(Value is NULL)
		y.put(11, "pqr");
		y.put(11, "pqr"); //duplicate pairs accepted(Overwriting)

		//TreeMap: Does not allow null keys but accepts null values, overwrites values for duplicate keys.
		TreeMap<Integer,String> z=new TreeMap<Integer,String>();
		z.put(10,"abc"); //insert a pair(Key,value)
		z.put(10,"abc"); //duplicate values are accepted(Overwriting)
		z.put(null,"pqr"); //rejected(Key is NULL)
		z.put(11, null); //accepted(Value is NULL)
		
		//HashSet: Allows only one null element and does not accept duplicate values, rejecting duplicates.
		//"HashSet" is competitor to "ArrayList"
		HashSet<String> w=new HashSet<String>();
		w.add(null); //accepted
		w.add(null); //rejected(One NULL only)
		w.add("Kalam");
		w.add("Kalam");//rejected, cannot allow duplicates
	}
}
