package javaExcercises;

import java.util.Scanner;

public class Program26
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        // Create a two-dimensional array to hold the matrix
        int[][] matrix = new int[rows][cols];
        // Populate the matrix with user input
        System.out.println("Enter the elements of the matrix:");
        for (int i=0; i<rows; i++) {                         //012
            for (int j=0; j < cols; j++) {                   //012
                System.out.printf("Element [%d][%d]: ",i,j); //[0][0]
                matrix[i][j]=scanner.nextInt();             //[0,0][0,1][0,2];[1,0][1,1][1,2];[2,0][2,1][2,2]
            }
        }
        // Close the scanner
        scanner.close();
        // Print the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*rows=int(input("enter the rows"))
cols=int(input("enter the cols"))
matrix =[]
for i in range(rows):
    row =[]
    for j in range(cols):
        element=int(input(f"Element[{i}][{j}]:"))
        row.append(element)
    matrix.append(row)
        
print("The matrix is:")
for i in range(rows):
    for j in range(cols):
        print(matrix[i][j], end=" ")
    print() 

*/
