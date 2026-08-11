package javaExcercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program79withregexp
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence in desired pattern like \"AA!45aaa\"");
		String x=sc.nextLine();
		sc.close(); 
		//7 characters to 10 characters, but in it at least 1 digit, 1 uppercase letter, 1 lowercase letter and one special character.
	    Pattern r=Pattern.compile("^(?=(.*[a-z]){1,})(?=(.*[A-Z]){1,})(?=(.*[0-9]){1,})(?=(.*[!@#$%\\^&*()\\-__+\\.]){1,}).{7,10}$"); 
	    Matcher m=r.matcher(x);
	    int flag=0;
	    while(m.find()) 
	    {
	    	System.out.println(x+" is matching the rules"); 
	    	flag=1;
	    }
	    if(flag==0)
	    {
	    	System.out.println(x+" is not matching the rules");
	    }
	    //use https://rubular.com/ for manual verification
	    // ^(?!(.*__))(?!(.*_$))(?!(^_.*))(?=(.*_){1,})[a-zA-Z0-9_]{7,10}$
	    // ^([a-zA-Z0-9_\-\.]+)[@]([a-zA-Z0-9_\-\.]+)[\.]([a-zA-Z]{2,5})$ 
	}
}





