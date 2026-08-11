package arrays;

import java.util.Scanner;

public class Delhievery {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		System.out.println("enter the no of cols");
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("enter the elements to matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.printf("Element[%d][%d]",i,j);
				mat[i][j]=sc.nextInt();
			}
			int maxGold=findmax(mat,row,col);
			System.out.println("max gold "+maxGold);
		}
		}
		
		public static int findmax(int[][]mat,int row,int col)
		{
			int maxgold=0;
			for(int r=0;r<row;r++)//currentrow
			{
				maxgold=Math.max(maxgold,collectGold(mat,r,0,row,col));
			}
			return maxgold;
		}

	private static int collectGold(int[][] mat, int r, int c, int row, int col) {
		if(r<0 ||r>=col||c>=row)
		{
		return 0;
	    }
		int right=collectGold(mat,r,c+1,row,col);
		int rightup=collectGold(mat,r-1,c+1,row,col);
		int rightdown=collectGold(mat,r+1,c+1,row,col);
		return mat[r][c]+Math.max(right, Math.max(rightup, rightdown));
	}
	

}
/*
Given a gold mine mat[] of size (n x m). Each field in this mine contains a positive integer which is the amount of gold in tons. Initially, the miner can start from any row in the first column. From a given cell, the miner can move

to the cell diagonally up towards the right 
to the right
to the cell diagonally down towards the right
The task is to find the maximum amount of gold that he can collect until he can no longer move.

Examples: 

Input: mat[][]= [[1, 3, 3],
Anubhav Badak
16:32
Input: mat[][]= [[1, 3, 3],
                            [2, 1, 4],
                            [0, 6, 4]]
Output: 12 
Explanation : Move through cells: (1,0) -> (2,1) -> (1,2)

Input: mat[][] = [[1, 3, 1, 5],
                             [2, 2, 4, 1],
                             [5, 0, 2, 3],
                             [0, 6, 1, 2]]
Output: 16
Explanation : Move through cells: (2,0) -> (1,1) -> (1,2) -> (0,3) or (2,0) -> (3,1) -> (2,2) -> (2,3)*/