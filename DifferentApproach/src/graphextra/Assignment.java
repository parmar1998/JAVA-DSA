package graphextra;

import java.util.Scanner;

public class Assignment {
	
	private static void DFS(int[][]edges, int v1, boolean[] visited, int n){
	        visited[v1]=true;
	        
	        for(int i=0; i<n; i++){
	            if(visited[i] == false && edges[v1][i] == 1){
	                DFS(edges, i, visited, n);
	            }
	        }
	    }
	public static int numConnected(int[][] edges, int n) {
	    boolean visited[]=new boolean[n];
	    int count=0;
	    for(int i=0;i<n;i++) {
	    	if(visited[i]==false) {
	    		DFS(edges,i,visited,n);
	    		count++;
	    	}
	    }
	    return count;
	}
		

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int vertex=s.nextInt();
		int edges=s.nextInt();
		int adjmatrix[][]=new int[vertex][vertex];
		for(int i=0;i<edges;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			adjmatrix[v1][v2]=1;
			adjmatrix[v2][v1]=1;
		}
		int x=numConnected(adjmatrix, vertex);
		System.out.print(x);
		s.close();
	}
}
