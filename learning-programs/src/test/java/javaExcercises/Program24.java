package javaExcercises;

public class Program24
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");       //  0000  000  00    0
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(k);         //    1    12   123   1234     12345
			}
			for(int l=i;l>1;l--)
			{
				System.out.print(l-1);      //           1   21      321     4321
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) //rows
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");      //0   00 000 0000
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print(k);       //1234 123  12 1
			}
			for(int l=i;l>1;l--)
			{
				System.out.print(l-1);     //321  21 1
			}
			System.out.println();
		}
	}
}
/*

# Upper part of the diamond
for i in range(1, 6):
    for j in range(6, i, -1):  # Print leading spaces
        print(" ", end="")
    for k in range(1, i):  # Print symbols
        print(f"{k}", end="")
    for l in range(i-1,1,-1):
        print(f"{l-1}",end="")
    print()

# Lower part of the diamond
for i in range(4, 0, -1):  # Decrease i to print the lower part
    for j in range(6, i, -1):  # Print leading spaces
        print(" ", end="")
    for k in range(1, i):  # Print symbols
        print(f"{k}", end="")
    for l in range(i-1,1,-1):
        print(f"{l-1}",end="")
    print()
*/