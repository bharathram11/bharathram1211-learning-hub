package javaExcercises;

public class Program46
{
	public static void main(String[] args)
	{
		//Upper triangle
		for(int i=1;i<=5;i++) // 1 to 5
		{
			//for spaces
			for(int j=4;j>=i;j--) //4 to 1
			{
				System.out.print(" ");              //0000A  000ABA  00ABCBA 0ABCDCBA  ABCDEDCBA
			}
			//for left triangle
			char c1='A';
			for(int k=1;k<=i;k++) //1 to i
			{
				System.out.print(c1);
				c1=(char) (c1+1); //increase ASCII value
			}
			//for right triangle
			char c2='A';
			for(int m=i-1;m>=1;m--) //i-1 to 1
			{
				System.out.print((char)(c2+m-1));
			}
			System.out.println();
		}
		//Bottom triangle
		for(int i=4;i>=1;i--) // 4 to 1
		{
			//for spaces
			for(int j=4;j>=i;j--) //4 to 1
			{
				System.out.print(" ");                 //0ABCDCBA  00ABCBA  000ABA    0000A
			}
			//for left triangle
			char c1='A';
			for(int k=1;k<=i;k++) //1 to i
			{
				System.out.print(c1);
				c1=(char) (c1+1);
			}
			//for right triangle
			char c2='A';
			for(int m=i-1;m>=1;m--) //i-1 to 1
			{
				System.out.print((char)(c2+m-1));
			}
			System.out.println();
		}
	}
}
/*
 * # Upper triangle
for i in range(1, 6):  # 1 to 5
    # For spaces
    for j in range(4, i - 1, -1):  # 4 to 1
        print(" ", end="")
    
    # For left triangle
    c1 = 'A'
    for k in range(1, i + 1):  # 1 to i
        print(c1, end="")
        c1 = chr(ord(c1) + 1)  # Increase ASCII value
    
    # For right triangle
    c2 = 'A'
    for m in range(i - 1, 0, -1):  # i-1 to 1
        print(chr(ord(c2) + m - 1), end="")
    
    print()  # New line after each row

# Bottom triangle
for i in range(4, 0, -1):  # 4 to 1
    # For spaces
    for j in range(4, i - 1, -1):  # 4 to 1
        print(" ", end="")
    
    # For left triangle
    c1 = 'A'
    for k in range(1, i + 1):  # 1 to i
        print(c1, end="")
        c1 = chr(ord(c1) + 1)  # Increase ASCII value
    
    # For right triangle
    c2 = 'A'
    for m in range(i - 1, 0, -1):  # i-1 to 1
        print(chr(ord(c2) + m - 1), end="")
    
    print()  # New line after each row
*/
