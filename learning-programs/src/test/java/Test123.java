

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test123 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the string");
    	String s1=sc.nextLine();
    	String words[]=s1.split(" ");
    	List<String>palindromes=new ArrayList<>();
    	for(String word:words)
    	{
    		String rev="";
    		for(int i=word.length()-1;i>=1;i--)
    		{
    			rev=rev+word.charAt(i);
    		}
    		if(rev.equalsIgnoreCase(s1))
    		{
    			palindromes.add(rev);
    		}
    	}
    	System.out.println(palindromes.size());
    	for(String palin:palindromes)
    	{
    		System.out.println(palin);
    	}
    	
    	
    	
    }
}

