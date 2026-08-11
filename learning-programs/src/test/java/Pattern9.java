
public class Pattern9 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)                     //i=1        i=2      i=3   4    5
		{
			for(int j=5;j>=i;j--)                   //j=5432   j=543     54   5     0
			{
				System.out.print("*");
			}
			for(int k=1;k<=2*i-1;k++)           
			{
				System.out.print(" ");      
			}
			for(int m=5;m>=i;m--)
			{
				System.out.print("*");   //0   1   
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)                     //i=1        i=2      i=3   4    5
		{
			for(int j=5;j>=i;j--)                   //j=5432   j=543     54   5     0
			{
				System.out.print("*");
			}
			for(int k=1;k<=2*i-1;k++)           
			{
				System.out.print(" ");      
			}
			for(int m=5;m>=i;m--)
			{
				System.out.print("*");   //0   1   
			}
			System.out.println();
		}
	}
}

