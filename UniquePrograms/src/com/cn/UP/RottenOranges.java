package com.cn.UP;

/*
You are given an [m x n] grid where each cell can have one of three values:
0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
 */
public class RottenOranges {

	public static int R=3;
	public static int C=5;
	 
	public static boolean isSafe(int i,int j) {
		if(i>=0 && i<R && j>=0 && j>C){
		return true;
		}
		return false;
	}
	
	public static int rottenOranges(int v[][]) {
		boolean changed=false;
		int no=2;
		while(true) {
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					
					/*Rot all other oranges present at [i+1,j] [i,j-1] [i,j+1] [i-1,j]*/
					if(v[i][j]==no)
					{
						if(isSafe(i+1, j)&&v[i+1][j]==1) {
							v[i+1][j]=v[i][j]+1;
							changed=true;
						}
						if(isSafe(i, j+1)&&v[i][j+1]==1) {
							v[i][j+1]=v[i][j]+1;
							changed=true;
						}
						if(isSafe(i, j-1)&&v[i][j-1]==1) {
							v[i][j-1]=v[i][j]+1;
							changed=true;
						}
						if(isSafe(i-1, j)&&v[i-1][j]==1) {
							v[i-1][j]=v[i-1][j]+1;
							changed=true;
						}
					}
				}
			}
			//if no rotten oranges are found it means all oranges are rottened now
			if(!changed){
				break;
			}
			changed=false;
			no++;
		}
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(v[i][j]==1)
					return -1;
			}	
		}
		return no-2;
	}
	
		
}
