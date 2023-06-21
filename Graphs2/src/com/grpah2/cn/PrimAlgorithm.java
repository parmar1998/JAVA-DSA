package com.grpah2.cn;

import java.util.Scanner;

public class PrimAlgorithm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int graph[][]=new int[n][n];
		int v1,v2,cost;
		int weight[]=new int[n];
		while(e>0) {
			v1=sc.nextInt();
			v2=sc.nextInt();
			cost=sc.nextInt();
			graph[v1][v2]=cost;
			graph[v2][v1]=cost;
			e--;
		}
		
		int parent[]=new int[n];
		
		for(int i=0;i<n;i++) {
			weight[i]=Integer.MAX_VALUE;
		}
		
		boolean visited[]=new boolean[n];
		parent[0]=-1;
		weight[0]=0;
		int source=0;
		
		
		for(int i=1;i<n;i++) {
			source=findMinVertex(weight,visited);
			visited[source]=true;
			
			for(int j=0;j<n;j++) {
				if(graph[source][j]>0 && visited[j]==false && weight[j]>graph[source][j]) {
					weight[j]=graph[source][j];
					parent[j]=source;
					
				}
			}
		}
		 for(int i = 1;i<n;i++)
	        {
	            if(i< parent[i])
	                System.out.println(i+" "+parent[i]+" "+weight[i]);
	            else
	                System.out.println(parent[i]+" "+i+" "+weight[i]);
	                
	        }
	}

	private static int findMinVertex(int[] weight, boolean[] visited) {
		int v,min_edge,n;
		n=weight.length;
		v=0;
		min_edge=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(visited[i]==false&&min_edge>weight[i]) {
				v=i;
				min_edge=weight[i];
			}
		}
		return v;
	}

}
