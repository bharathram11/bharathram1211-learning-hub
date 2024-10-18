package javaExcercises;

public class Program22
{
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--) //rows
		{
			//for spaces
			for(int k=4;k>=i;k--)
			{
				System.out.print("0");          //   0                                    00   000   0000
			}
			for(int j=1;j<(2*i);j++) //columns      
			{
				System.out.print("*");         // **********          ********         *****   ***   *
			}
			System.out.println();
		}
	}
}
