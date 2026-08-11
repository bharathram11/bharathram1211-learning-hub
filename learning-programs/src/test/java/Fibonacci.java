import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		//fibonacci = adding previous two numbers 0,x=1,y=1,z=2,3,5,8,13....
		Scanner sc=new Scanner(System.in);
		System.out.println("enter upto which number u need");
		int num=sc.nextInt();
		int x=0;
		int y=1;
		System.out.println(x+"\n"+y);
		do
		{
			int z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
		while((x+y)<num);	
	}
}
