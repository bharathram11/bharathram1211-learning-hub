package javabasics;

public class Titanichelper {

	public static void main(String[] args) {
		
		
		//for outer horizantal line
		for(int i=1;i<=56;i++)
		{
			System.out.print("-");
		}
		System.out.println(" ");
		
		//to print \ & / outer loop
		for (int a = 1; a <= 8; a++)
		{
            for (int b = 1; b < a; b++) 
            {
                System.out.printf("0");
            }
            System.out.printf("\\");

            if (a == 4)
            {
                System.out.print("           David                               "); // Adjust spacing around "David"
            } 
            else
            {
                for (int c = 1; c <= (55 - (2 * a)); c++) 
                {
                    System.out.print("#");
                }
            }
            System.out.print("/");

            for (int d = 1; d < a; d++)
            {
                System.out.print("0");
            }
            System.out.println();
        }
		int e=48;
		for(e=1;e<=7;e++)
		{
			System.out.printf(" ");
		}
			for(e=8;e<=48;e++)
			{
				System.out.printf("-");
			}
	}
}
