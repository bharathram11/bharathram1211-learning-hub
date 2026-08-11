import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		//15678
		int temp=num;
		int count=0;
		while(temp!=0) 
		{
			temp=temp/10; //15678/10=1567  1567/10=156  156/10=15, 15/10=1 1/10=0
			count++;       //1,2,3,4,5
		}
		System.out.println("count is "+count);
	}
}
