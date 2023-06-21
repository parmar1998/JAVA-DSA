package com.cn.backtracking;

public class Nqueens {

	//placing N chess queens on an N x N chess board,so that no two queens attack each other
	
	public static void solveNqueens(int board[][],int row,int n) {
		if(row==n) {
			printSolution(board,n);
			return;
		}
		for(int i=0;i<n;i++) {
			if(isSafe(board,row,i,n)) {
				board[row][i]=1;
				solveNqueens(board, row+1, n);
				board[row][i]=0;
			}
		}
	}
	private static void printSolution(int[][] board, int n) {
		solveNqueens(board, 0, n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}	
	}
	public static boolean isSafe(int board[][],int row,int col,int n) {
		int i,j;
		
		for( i=0;i<row;i++) 
		{
			if(board[i][col]==1)
				return false;
		}
		//check upper diagonal on left side
		for(i=row,j=col;i>=0&&j>=0;i--,j--) 
			if(board[i][j]==1) 
				return false;
			
		//check upper right diagonal
		for(i=row,j=col;i>=0&&j<n;i--,j++) 
			if(board[i][j]==1)
				return false;
			
			return true;
		}
	public static void placeNqueens(int n){
		int board[][]=new int[n][n];
		printSolution(board, n);
	}
	public static void main(String[] args) {
		placeNqueens(4);
	}
}
