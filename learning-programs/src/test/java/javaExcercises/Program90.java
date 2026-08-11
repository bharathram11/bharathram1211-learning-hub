package javaExcercises;

import java.util.Arrays;
import java.util.List;

public class Program90
{
	public static void main(String[] args)
	{
		//array input
		String playersArray[]={"Virat","Sachin","Rohit","Bumrah","Rahul"};
	    // converting array into Collection with asList() method
	    List<String> playersList=Arrays.asList(playersArray);
	    //print converted elements in collection
	    System.out.println("Converted elements: "+playersList);
	}
}














