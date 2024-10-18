package javaExcercises;

public class Program24Odds
{
	public static void main(String[] args)
	{
		//upper triangle
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)               
			{
				System.out.print(" ");    //0000   //000   //00  //0     
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(2*k-1);   //1    13      135    1357    13579
			}
			for(int l=i;l >1;l--)
			{
				System.out.print(2*l-3);    //     1    31     531   7531 
			}
			System.out.println();
		}
		//Lower triangle
		for(int i=4;i>=1;i--) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");    //0 //00 000 0000
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(2*k-1);   //1357  135  13 1
			}
			for(int l=i;l>1;l--)  //432 
			{
				System.out.print(2*l-3);   //531    31  1    
			}
			System.out.println();
		}
	}
}
