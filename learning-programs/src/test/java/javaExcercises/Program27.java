package javaExcercises;

public class Program27
{
	public static void main(String[] args)
	{
		//part-1(top horizontal line)
		for(int i=1;i<=40;i++)
		{
			System.out.print("-");//---------------------------------------------
		}
		System.out.println();
		//part-2(left and right edges)
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=40;j++)  // 1,40 
			{
				if(j==1||j==40)
				{
					System.out.print("|");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//part-3(bottom horizontal line)
		for(int i=1;i<=40;i++)
		{
			System.out.print("-");
		}
	}
}
