import java.util.Scanner;

public class Digitssum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		//12345=1+2+3+4+5=15  54321
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int remain=temp%10;   //12345%10=5   ,1234%10=4  ,123%10=3  ,12%10=2   1%10=1
			sum=sum+remain;       //sum=0+5        sum=5+4   sum=9+3  sum=12+2   14+1
			temp=temp/10;     //12345/10=1234   1234/10=123   123/10=12   12/10=1  1/10=0
		}
		System.out.println(sum);	
	}
}