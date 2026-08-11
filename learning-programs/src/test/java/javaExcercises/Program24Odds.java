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
/*
 
# Upper part of the diamond
for i in range(1, 6):
    for j in range(6, i, -1):  # Print leading spaces
        print(" ", end="")
    for k in range(1, i):  # Print symbols
        print(f"{2*k-1}", end="")
    for l in range(i-1,1,-1):
        print(f"{2*l-3}",end="")
    print()

# Lower part of the diamond
for i in range(4, 0, -1):  # Decrease i to print the lower part
    for j in range(6, i, -1):  # Print leading spaces
        print(" ", end="")
    for k in range(1, i):  # Print symbols
        print(f"{2*k-1}", end="")
    for l in range(i-1,1,-1):
        print(f"{2*l-3}",end="")
    print()
*/
