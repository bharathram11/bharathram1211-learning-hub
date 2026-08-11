import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		//prime number:number is divisble by itself and one
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int i=sc.nextInt();
		//11%1=0 && 11%11=0    11%5=1   
		//6%1==0 && 6%6==0 6%2==0 6%3==0
		//2,num-1   //2-4
		int flag=0;
		for(int x=2;x<i;x++)    //7  //2,3,4,5,6
		{
			if(i%x==0)   //7%2!=0,  7%3!=0  7%4!=0   7%5!=0   7%6!=0 
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(i+"number is prime number");
		}
		else
		{
			System.out.println(i+"number is not a prime");
		}
	}
}
