package javaExcercises;

public class Program19
{
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--) //rows
		{
			for(int j=1;j<=i;j++) //columns     // 5,4,3,2,1
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*for i in range(5,1,-1):
    for j in range(1,i):
        print("*",end="")
    print()*/