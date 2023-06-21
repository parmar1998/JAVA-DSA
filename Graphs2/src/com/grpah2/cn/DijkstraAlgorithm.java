package com.grpah2.cn;

import java.util.Scanner;

public class DijkstraAlgorithm {
	
	public static void dijkstra(int[][] matrix) {
		boolean visited[]=new boolean[matrix.length];
		int distance[]=new int[matrix.length];
		distance[0]=0;
		
		for(int i=1;i<distance.length;i++) {
			distance[i]=Integer.MAX_VALUE;
		}
		
		for(int i=0;i<matrix.length;i++) {
			int min_distanceVertex=findMindistance(distance,visited);
			visited[min_distanceVertex]=true;
			for(int j=0;j<matrix.length;j++) {
				if(matrix[min_distanceVertex][j]!=0&&!visited[j]) 
				{
					if(distance[j]>distance[min_distanceVertex]+matrix[min_distanceVertex][j]) 
					{
						distance[j]=distance[min_distanceVertex]+matrix[min_distanceVertex][j];
					}
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			System.out.println(i+ " "+distance[i]);
		}
	}
	public  static int findMindistance(int[] distance, boolean[] visited){
		int min_vertex=-1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i]&&(min_vertex==-1||distance[i]<distance[min_vertex])) {
				min_vertex=i;
			}
		}
		return min_vertex;
	}
	public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);
		int V=s.nextInt();
		int E=s.nextInt();
		int [][] matrix=new int[V][V];
		for(int i=0;i<E;i++) {
			int start_vertex=s.nextInt();
			int end_vertex=s.nextInt();
			int weight=s.nextInt();
			matrix[start_vertex][end_vertex]=weight;
			matrix[end_vertex][start_vertex]=weight;
		}
		dijkstra(matrix);
		s.close();
	}

	

}
