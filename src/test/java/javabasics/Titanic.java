package javabasics;

public class Titanic {

    public static void main(String[] args) {
        
        // Print the top part of the Titanic structure (_ and | |)
        System.out.println("                                                 _");
        System.out.println("                                                | |");
        System.out.println("                                                | |");
        
        // Print the horizontal line of the ship
        for (int i = 1; i <= 55; i++) 
        {
            System.out.printf("-"); 
        }
        System.out.println(" "); // Move to the next line
        
        
        // Loop to print \ & / sides of the ship
        for (int a = 1; a <= 6; a++)
        {
            //loop to print space before printing \
            for (int b = 1; b < a; b++)
            {
                System.out.printf("0");
            }
            System.out.printf("\\");
            
            // Special case for row 4: Print "David" in the middle of the slanting sides
            if (a == 4)
            {
           
                System.out.print("           Rakesh                              ");
            } 
            else 
            {
            	//loop to print space after printing \
                for (int c = 1; c <= (55 - (2 * a)); c++)
                {
                    System.out.print("0");
                }
            }
            System.out.print("/");

            //loops to print space after /
            for (int d = 1; d < a; d++)
            {
                System.out.print("0");
            }

            // Move to the next line after each row of the ship's body
            System.out.println();
        }

        // Print the base of the ship
        int e = 53;
        for (e = 1; e <= 6; e++) {
            System.out.printf("0");
        }
        for (e = 10; e <= 52; e++) {
            System.out.printf("-");
        }
    }
}
