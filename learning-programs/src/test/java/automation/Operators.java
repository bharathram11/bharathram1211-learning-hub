package automation;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name:");
		String name=sc.nextLine();
//		float f=sc.nextFloat();
//		byte b=sc.nextByte();
//		long l=sc.nextLong();
//		short s=sc.nextShort();
//		boolean t=sc.nextBoolean();
//		char c=sc.nextLine().charAt(0);	
		System.out.println("a value is "+a+name);
	}
}
