import java.util.Scanner;

public class DigitReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be reverse");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			int lastdigit=temp%10;
			rev=rev*10+lastdigit;   //345  0*10+5   5*10+4  54*10+3 =543   0*10+5=5  5*10+4=54    54*10+3=543
			temp=temp/10;
		}
		System.out.println("reverse num is :"+rev);
		if(rev==num)  //reversed number == original number
		{
			System.out.println(num+" palindrome number");//151=151
		}
		else
		{
			System.out.println(num+" not a palindrome number");
		}
	}
}
