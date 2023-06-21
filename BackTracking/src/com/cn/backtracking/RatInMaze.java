package com.cn.backtracking;

public class RatInMaze {

	                        //RAT IN MAZE
	/*  rat in a maze problem,rat will have a start point (0,0) to (n,n)
	{1, 0, 0, 0}
	{1, 1, 0, 0}
	{0, 1, 0, 0}
	{0, 1, 1, 1}*/
	public static boolean ratInMaze(int maze[][]) {
	int n=maze.length;
	int path[][]=new int[n][n];
	return SolveMaze(maze,0,0,path);
	}
	public static boolean SolveMaze(int maze[][],int i,int j,int path[][]) {
int n=maze.length;

if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1) {
return false;
}
//Include the cell in current path
path[i][j]=1;

if(i==n-1&&j==n-1) {
return true;
}
//TOP
if(SolveMaze(maze,i-1,j,path)) {
return true;
}
//RIGHT
if(SolveMaze(maze,i,j+1,path)) {
return true;
}
//down
if(SolveMaze(maze,i+1,j,path)) {
return true;
}
//left
if(SolveMaze(maze,i,j-1,path)) {
return true;
}
return false;	
}
	
	public static void main(String[] args) {
		
	}
}
