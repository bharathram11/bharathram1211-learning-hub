package javaExcercises;

public class Program23
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) //rows
		{
			//for spaces
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");         //0000    000   00  0
			}
			for(int j=1;j<(2*i);j++) //columns                 
			{
				System.out.print("*");         //  *   ***   *****   *******    *********
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) //rows    
		{
			//for spaces
			for(int k=4;k>=i;k--)            //0   00  000   0000
			{
				System.out.print(" ");
			}
			for(int j=1;j<(2*i);j++) //columns   /   *******  *****  ***   *
				{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
symbol = input("Enter the symbol: ")
rows = int(input('Enter the number of rows: '))

# Upper part of the diamond
for i in range(1, rows + 1):
    for j in range(rows, i, -1):  # Print leading spaces
        print(" ", end="")
    for k in range(1, 2 * i):  # Print symbols
        print(f"{symbol}", end="")
    print()

# Lower part of the diamond
for i in range(rows - 1, 0, -1):  # Decrease i to print the lower part
    for j in range(rows, i, -1):  # Print leading spaces
        print(" ", end="")
    for k in range(1, 2 * i):  # Print symbols
        print(f"{symbol}", end="")
    print()
*/