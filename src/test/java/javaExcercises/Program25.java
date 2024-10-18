package javaExcercises;

public class Program25
{
	public static void main(String[] args)
	{
		long startingtime=System.currentTimeMillis();
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--) //decrease "*"      ****    ***   **   *
			{
				System.out.print("*");
			}
			for(int k=1;k<(2*i);k++) //increase spaces    0   000   00000    0000000     000000000
			{
				System.out.print("0");
			}
			for(int l=4;l>=i;l--) //decrease "*"     ****   ***  **     *
			{
				System.out.print("*");
			}
			System.out.println();
		} 
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) //increase "*       *        **      ***    ****
			{
				System.out.print("*");
			}
			for(int k=1; k<=(9-(2*i));k++) //      0000000    00000   000    0
			{
				System.out.print("0");
			}
			for(int l=1;l<=i;l++) //increase "*"     *        **        ***    ****
			{
				System.out.print("*");      
			}
			System.out.println();
		} 
		long endtime=System.currentTimeMillis();
		System.out.println("Time taken: "+(endtime-startingtime)+"ms");
	}
}
