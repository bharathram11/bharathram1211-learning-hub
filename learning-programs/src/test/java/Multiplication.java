import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+"="+num*i);   //5X1=5  5X2=10
		}

	}

}
