package javaExcercises;

import java.util.Calendar;

public class Program93
{
	public static void main(String[] args)
	{
		//Way-2
	    Calendar c=Calendar.getInstance();  
	    System.out.println("The current date and time is : "+c.getTime()); 
	    System.out.println("At present Calendar's Year: "+c.get(Calendar.YEAR)); 
	    System.out.println("At present Calendar's month: "+(c.get(Calendar.MONTH)+1)); 
	    System.out.println("At present Calendar's Day: "+c.get(Calendar.DATE)); 
	    
	    
	}
}














