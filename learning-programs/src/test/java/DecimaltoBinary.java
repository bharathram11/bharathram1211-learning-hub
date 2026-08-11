import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int decimal=sc.nextInt();   
		//13  ==1101
		String binary="";
		int temp=decimal;
		while(temp!=0)
		{
			int remainder=temp%2;   //13%2=1   6%2=0   3%2=1   1%2=1
			binary=remainder+binary;     //1+""    0+1=01     1+01=101    1+101=1101
			temp=temp/2;//13/2=6   6/2=3    3/2=1	
		}
		System.out.println(binary);
	}
}
