package com.cn.DynamicProgramming;

public class MinCostPath {

/*	
    minimum cost path using
		[1 2 3]
		[2 3 4]
		[2 5 4]
*/
	public static int min(int x,int y,int z) {
		if(x<y)
			return (x<z)?x:z;
		else
			return (y<z)?y:z;
	}
	public static int minCostpath(int input[][]) {
		return minCostpath(input,input.length-1,input[0].length-1);
	}
	private static int minCostpath(int[][] input, int m, int n) {
	if(n<0||m<0) {
		return Integer.MAX_VALUE;
	}
	else if(m==0&&n==0)
		return input[m][n];
	else
		return input[m][n]+min(minCostpath(input,m-1,n-1),minCostpath(input,m-1,n),minCostpath(input,m,n-1));
	
}
	
	public static int mincostPathUsingDP(int cost[][],int m,int n){
		 int i, j;
	        int tc[][] = new int[m + 1][n + 1];
	 
	        tc[0][0] = cost[0][0];
	 
	        /* Initialize first column of total cost(tc) array
	         */
	        for (i = 1; i <= m; i++)
	            tc[i][0] = tc[i - 1][0] + cost[i][0];
	 
	        /* Initialize first row of tc array */
	        for (j = 1; j <= n; j++)
	            tc[0][j] = tc[0][j - 1] + cost[0][j];
	 
	        /* Construct rest of the tc array */
	        for (i = 1; i <= m; i++)
	            for (j = 1; j <= n; j++)
	                tc[i][j] = min(tc[i - 1][j - 1],tc[i - 1][j], tc[i][j - 1])+ cost[i][j];
	 
	        return tc[m][n];
	}
	
	
	public static void main(String[] args) {
		 int cost[][]
		            = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		 System.out.println(minCostpath(cost,2,2));
		
	}
}
