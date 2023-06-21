package com.CodingNinja.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs {

	//Breadth first traversal 
	public static void BFT_Traversal(int matrix[][]) {
		Queue<Integer> pendingVertices=new LinkedList<Integer>();
		boolean visited[]=new boolean[matrix.length];
		visited[0]=true;//here marked source as visited
		pendingVertices.add(0);
		while(!pendingVertices.isEmpty()) {
			int currentvertex=pendingVertices.poll();
			System.out.print(currentvertex+" ");
			for(int i=0;i<matrix.length;i++) {
				if(matrix[currentvertex][i]==1&&!visited[i]) {
					//i is unvisited neighbor of currentvertex
					
					pendingVertices.add(i);
					visited[i]=true;
				}
			}
		}
		}
	//Depth first traversal
	public static void dftTraversal(int matrix[][],int currentVertex,boolean visited[]) {
		
		visited[currentVertex]=true;
		System.out.print(currentVertex+" ");
		
		for(int i=0;i<matrix.length;i++) {
			if(matrix[currentVertex][i]==1 &&visited[i]==false) {
				//i is neighbor of current vertex
				dftTraversal(matrix,i,visited);
			}
		}
	}
	
	public static void dftTraversal(int matrix[][]) {
		int currentVertex=0;
		boolean[] visited=new boolean[matrix.length];
		for(int i=0;i<matrix.length;i++) {
			if(!visited[i]) {
				dftTraversal(matrix,i,visited);	
				System.out.println();
			}
				
		}
		
	}
	//TAKING INUT FROM ADJACENCY MATRIX
	public static int[][] Takinginput(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int adjMatrix[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			adjMatrix[v1][v2]=1;
			adjMatrix[v2][v1]=1;
		}
		
		System.out.println("ADJACENT MATRIX :- ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
		return adjMatrix;
	}
	
	public static ArrayList<Integer> getpathDFS(int edges[][],boolean visited[],int v1,int v2){
		if(v1==v2) {
			ArrayList<Integer> ans=new ArrayList<>();
			visited[v1]=true;
			ans.add(v1);
			return ans;
		}
		visited[v1]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[v1][i]==1&&!visited[i]) {
				ArrayList<Integer> arr=getpathDFS(edges, visited, i, v2);
				if(arr!=null) {
					arr.add(v1);
					return arr;
				}
			}
		}
		return null;
	}
	
	public static ArrayList<Integer> getPathBFS(int edges[][],boolean visited[],int v1,int v2){
		if(v1==v2) {
			ArrayList<Integer> ans=new ArrayList<>();
			ans.add(v1);
			visited[v1]=true;
			return ans;
		}
		 
		Queue<Integer> q=new LinkedList<Integer>();//queue for all vertices
		HashMap<Integer, Integer> h=new  HashMap<>(); //an integer hashmap to know which the source and destination vertex
		ArrayList<Integer> ans=new ArrayList<>();
		q.add(v1);//adding source to queue
		visited[v1]=true;
		while(!q.isEmpty()) {
			int first=q.remove();
			for(int i=0;i<edges.length;i++) {
					if(edges[first][i]==1&&!visited[i]) 
					{
						visited[i]=true;
						q.add(i);
						h.put(i,first); //here we are connecting the start and destination vertex
						if(i==v2) {
							ans.add(i);//if end vertex matches i put it in arraylist output
								while(!ans.contains(v1)) {
									int b=h.get(i);
									ans.add(b);
									i=b;
								}
								return ans;
						}
					}
			}
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}
}
