package javaExcercises;

import java.util.Scanner;

public class Program14
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();
		sc.close();
		//binary to decimal
		//way-1
		String s=n+""; //convert binary number as String as per syntax
		int d=Integer.parseInt(s,2); 
		System.out.println(n+" decial value is "+d); 
		//Way-2
		int decvalue=0; 
	    int placevalue=0; 
	    int temp=n; 
	    while(temp!=0) 
	    { 
	        int lastbit=temp%10; //get last digit
	        temp=temp/10; //cut that digit from binary number
	        //decvalue=(int) (decvalue+lastbit*Math.pow(2,placevalue));
	        decvalue=(int) (decvalue+lastbit*power(2,placevalue)); 
	        placevalue++;
	    } 
	    System.out.println(n+" decial value is "+decvalue);
	}
	
	public static long power(int base, int exp)
	{
		long output=1;
		for(int i=1;i<=exp;i++)
		{
			output=output*base;
		}
		return(output);
	}
}

/*
 * x = int(input("Enter the number of terms: ")) 
temp=x
decvalue=0
placevalue=0
while(temp!=0):
    lastdigit=temp%10
    decvalue =decvalue+lastdigit*2**placevalue
    placevalue +=1
    temp=temp//10
print(decvalue)

 */

