import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int binarynum=sc.nextInt();   
		//8421  //1101
		int temp=binarynum;
		int decvalue=0;
		int placevalue=0;
		while(temp!=0)
		{
			int lastdigit=temp%10;  //1   0   1  1
			decvalue=(int) (decvalue+(lastdigit*Math.pow(2, placevalue)));  //1   1+(0*2^1) 1+(2^2)   5+2^3=5+8=13
			placevalue++;   //1, 2,3
			temp=temp/10;    
		}
		System.out.println(decvalue);
	}
}
