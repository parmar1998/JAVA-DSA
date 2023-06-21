package com.cn.DynamicProgramming;

/*
 * Longest Common Subsequence
 * Input 1 --> "AFFTAB"  Input 2 --> "GXTXAYB"
 * Output --> "GTAB"
 */

/*
 * Memoization ensures that a method doesn't run for the same inputs more than once by keeping a record of
 *  the results for the given inputs (usually in a hash map).
 * o avoid the duplicate work caused by the branching, we can wrap the method in a 
 * class that stores an instance variable, memo, that maps inputs to outputs. Then we simply
 * check memo to see if we can avoid computing the answer for any given input, and 
 * save the results of any calculations to memo. 
 */
public class LongestCommonSubsequence {
	
	public static int lcs(String s,String t) {
		int dp[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;	
			}
		}
		return lcshelper(s,0,t,0,dp);
	}
	private static int lcshelper(String s, int i, String t, int j, int[][] dp) {
		if(i==s.length()||j==t.length()) {
			return 0;	
		}
		if(s.charAt(i)==t.charAt(j)) {
			if(dp[i+1][j+1]==-1) {
				dp[i+1][j+1]=lcshelper(s, i+1, t, j+1, dp);
			}
			dp[i][j]=1+dp[i+1][j+1];
		}
		else {
			if(dp[i][j+1]==-1) {
				dp[i][j+1]=lcshelper(s, i, t, j+1, dp);
			}
			int ans1=dp[i][j+1];
			if(dp[i+1][j]==-1) {
				dp[i+1][j]=lcshelper(s, i+1, t, j, dp);
			}
			int ans2=dp[i+1][j];
			dp[i][j]=Math.max(ans1, ans2);
		}
		return dp[i][j];
	}
	//iterative approach
	public static int LCSiterative(String s,String t) {
		int m=s.length();
		int n=t.length();
		int dp[][]=new int[m+1][n+1];
		for(int i=m-1;i>=0;i--) {
			int ans;
			for(int j=n-1;j>=0;j--) 
			{
				if(s.charAt(i)==t.charAt(j)) {
					ans=1+dp[i+1][j+1];	
				}
				else {
					int ans3=dp[i][j+1];
					int ans2=dp[i+1][j];
					ans=Math.max(ans3, ans2);
				}
				dp[i][j]=ans;
			}
		}
		return dp[0][0];
	}
	
//	KnapSack - We are given N items where each item has some weight and profit associated with it. 
//	We are also given a bag with capacity W, [i.e., the bag can hold at most W weight in it]. 
//	The target is to put the items into the bag such that the sum of profits associated with them
//	is the maximum possible. Note: The constraint here is we can either put an item completely into
//	the bag or cannot put it at all [It is not possible to put a part of an item into the bag].
	/*
	 * N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1}
	 * Explanation: There are two items which have weight less than or equal to 4. If we select the item with weight 4, the possible profit is 1. And if we select the item with weight 1,
	 *  the possible profit is 3. So the maximum possible profit is 3. Note that we cannot put both the items with weight 4 and 1 together as the capacity of the bag is 4.
	 *
	 * weight[] = {1, 1, 1}, W = 2, profit[] = {10, 20, 30}
	 *
	 */
	public static int KnapSackIterative(int wt[],int val[],int n,int W) {
		int dp[][]=new int[n+1][W+1];
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=W;j++) {
				if(wt[i]<W) {
					int ans1=dp[i+1][j];
					int ans2=dp[i+1][j-wt[i]+val[i]];
					dp[i][j]=Math.max(ans1, ans2);
				}
				else {
					dp[i][j]=dp[i+1][j];
				}
			}
		}
		return dp[0][W];
	}
	
	
	//Using Recursion
	public static int knapSackRecursion(int w,int val[],int wt[],int i) {
		if(i==val.length) {
			return 0;
		}
		int ans;
		if(wt[i]<=w) {
			int ans1=val[i]+knapSackRecursion(w-wt[i],val,wt,i+1);
			int ans2=knapSackRecursion(w, val, wt, i+1);
			ans=Math.max(ans1, ans2);
		}
		else {
			ans=knapSackRecursion(w, val, wt, i+1);
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		int val[]={10, 20, 30};
		int wt[]={1,1,1};
		int x=knapSackRecursion(2,val, wt, 0);
		int y=KnapSackIterative(wt, val, val.length-1, 2);
		System.out.println(y);
	}
	
}
