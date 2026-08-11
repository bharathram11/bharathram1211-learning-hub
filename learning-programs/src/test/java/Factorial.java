import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int f=1;
//		for(int i=num;i>=1;i--)  //i=6,  6,5,4,3,2,1
//		{
//			f=f*i;    //f=1*6  6*5=30   30*4=120   120*3=360  360*2=720  720*1=720
//		}
//		System.out.println("factorial of "+num+" is "+f);
		
		for(int i=1;i<=num;i++)  //1  1,2,3,4,5,6  
		{
			f=f*i;  //1*1=1   1*2=2 2*3 =6  6*4=24  24*5=120 120*6 =720
		}
		System.out.println(f);
	}
	

}
