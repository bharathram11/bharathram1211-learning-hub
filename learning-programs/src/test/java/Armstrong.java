import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		//armstrong=153  ==1^3+5^3+3^3=153   =1+125+27 =153   1634=1^4+6^4+3^4+4^4=1634
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int count=0;
		int temp1=num;
		while(temp1!=0)
		{
			temp1=temp1/10;
			count++;
		}
		System.out.println("count is:"+count);
		int temp2=num;
		int value=0;
		while(temp2!=0)
		{
			int d=temp2%10;
			value=value+(int)Math.pow(d,count);  //2^3=8.0  2^4=16.0   5^3+4^3+1^3    1+4+5==5+4+1   5^3=125  3^5
			temp2=temp2/10;	
		}
		if(value==num)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}
}
