package javaExcercises;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program92
{
	public static void main(String[] args)
	{
		//Way-1
	    SimpleDateFormat f=new SimpleDateFormat("dd/MMM/yyyy hh-mm-ss"); 
	    Date dt1=new Date();  
	    String strDate=f.format(dt1);  
	    System.out.println(strDate);
	}
}














