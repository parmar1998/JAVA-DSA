
public class Solution {

	//find largest row_sum and column_sum
	public static void findLargest(int mat[][]){
		//Your code goes here
        int largestofrows=Integer.MIN_VALUE;
        int largestofcolumns=Integer.MIN_VALUE;
        for(int i=0;i< mat[0].length;i++)
        {
                   int sum=0;
                   for(int j=0;j<mat.length;j++)
                   {
                       sum=sum+mat[i][j];
                   }
                     if(largestofrows<sum)
                   {
                    largestofrows=sum;
                   }
        }
        for(int i=0;i< mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[0].length;j++)
            {
                sum=sum+mat[j][i];
            }
            if(largestofcolumns<sum)
            {
                largestofcolumns=sum;
            }
        }
       if(largestofcolumns>largestofrows)
           System.out.print(largestofcolumns);
       else
           System.out.print(largestofrows);
	}

	//find array and diagonal Boundary
	public static void totalSum(int mat[][]) {
		int requiredsum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				
				//for Diagonal
				if(i==j||(i+j)==mat.length-1) {
					requiredsum+=mat[i][j];
				}
				//for boundary
				else if(i==0||j==0||i==mat.length-1||j==mat.length-1) {
					requiredsum+=mat[i][j];
				}
			}	
		}
		System.out.println(requiredsum);
	}

	//Matrix Multiplication
	public static void multiplication(int A[][],int B[][]) {
		int m=A.length;
		int n=A[0].length;
		
		int p=B.length;
		int q=B[0].length;
		
		if(n!=p) {
			System.out.println("Matrix can't be multiplied");
		}
		int C[][]=new int[m][q];
		for(int i=0;i<m;i++) {
			for(int j=0;j<q;j++) {
				for(int k=0;k<n;k++) {
					C[i][j]=A[i][k]*B[k][j];
				}
				System.out.print(C[i][j]+" ");
			}	
			System.out.println();
		}
		
	}

	//Printing array in spiral
	/*
	 Input:  {{1, 2, 3, 4},{5,6, 7,8},  {9,10,11,12},{13,14,15,16 }}
	 Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
	 */
	public static void spiralOrder(int mat[][]) {
		if(mat==null||mat.length==0) {
			return;
		}
		int top=0,bottom=mat.length-1;
		int left=0,right=mat[0].length-1;
		
		while(true) {
			if(left>right) {
				break;
			}
			
			//print top row
			for(int i=left;i<=right;i++) {
				System.out.print(mat[top][i]+" ");
			}
			top++;
			if(top>bottom) {
				break;
			}
			
			//print bottom row
			for(int i=right;i>=left;i--) {
				System.out.print(mat[bottom][i]+" ");
			}
			bottom--;
			if(top>bottom) {
				break;
			}
			
			//print left column
			for(int i=bottom;i>=top;i--) {
				System.out.print(mat[i][left]+" ");
			}
			left++;
		}
	}

	
	public static void main(String[] args) {
		int arr1[][]= {{2,3,2},{3,2,1},{1,2,3}};
		int arr2[][]= {{7,8,5},{2,3,3},{5,4,8}};
		spiralOrder(arr2);
		
	}
}
