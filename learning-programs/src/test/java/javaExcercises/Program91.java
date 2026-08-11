package javaExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program91
{
	public static void main(String[] args)
	{
		//Creating arrayList list dynamically
        List<String> l=new ArrayList<String>();
        //Adding elements to the list
        l.add("Sachin");
        l.add("Abdul kalam");
        l.add("Mother Teresa");
        l.add("Nelson Mandela");
        l.add("CVRaman");
        l.add("Ratan Tata");
        // Converting list to an array
        String[] str=l.toArray(new String[0]);
        //print converted elements in array
	    System.out.println("Array input: "+Arrays.toString(str)); 
	}
}














