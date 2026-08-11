package arrays;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
    	
            Scanner sc = new Scanner(System.in);
            // Input dimensions of the matrices
            System.out.println("Enter the number of rows:");
            int row = sc.nextInt();
            System.out.println("Enter the number of columns:");
            int col = sc.nextInt();
            // Declare matrices
            int matrix1[][] = new int[row][col];
            int matrix2[][] = new int[row][col];
            int resultMatrix[][] = new int[row][col];

            // Input elements of the first matrix
            System.out.println("Enter elements of the first matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.printf("Element [%d][%d]: ", i, j);
                    matrix1[i][j] = sc.nextInt();
                }
            }

            // Input elements of the second matrix
            System.out.println("Enter elements of the second matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.printf("Element [%d][%d]: ", i, j);
                    matrix2[i][j] = sc.nextInt();
                }
            }

            // Display the first matrix
            System.out.println("First Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix1[i][j] + "\t");
                }
                System.out.println();
            }

            // Display the second matrix
            System.out.println("Second Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix2[i][j] + "\t");
                }
                System.out.println();
            }

            // Compute the result matrix
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Display the result matrix
            System.out.println("Result Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(resultMatrix[i][j] + "\t");
                }
                System.out.println();
            }
            sc.close();
    }
}
