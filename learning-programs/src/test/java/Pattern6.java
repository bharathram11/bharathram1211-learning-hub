
public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)                     //i=1        i=2      i=3   4    5
		{
			for(int j=5;j>i;j--)                   //j=5432   j=543     54   5     0
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)           //k=1  (2*2-1)=3        5    7    9
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)                     //i=1        i=2      i=3   4    5
		{
			for(int j=5;j>i;j--)                   //j=5432   j=543     54   5     0
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)           //k=1  (2*2-1)=3        5    7    9
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
