package javabasics;
import java.util.Scanner;
public class Example9
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		//Display sum of harmonic series(1/1 + 1/2 + 1/3 +....+ 1/n)
		double sum=0.0; //rule-1: sum is 0.0
		for(int i=1;i<=n;i++)      //int i=0.5
		{
			sum=sum+(double)1/i; //rule-2: type casting for division   SUM=0.0+1.0=1.0+0.5=1.5+0.3=1.8   
		}
		System.out.println(sum);
	}
}





