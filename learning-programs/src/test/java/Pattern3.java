import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many rows");
		String rows=sc.nextLine();
		int row=Integer.parseInt(rows);
		System.out.println("enter the symbol");
		char c=sc.nextLine().charAt(0);
		for(int i=1;i<=row;i++)         //i=1, 2,             3      4    5
		{
			for(int j=row;j>i;j--)     //j=5432   543      54     5    0
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)       // k=1     1,2          1,2,3    1234    12345
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
