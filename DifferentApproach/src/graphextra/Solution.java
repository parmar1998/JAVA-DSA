package graphextra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.io.IOException;
import java.util.Scanner;


public class Solution {

 public static void printHelper(int edges[][], int sv,boolean visited[]){ //here sv is the vertex passed to the print function
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        visited[sv]=true;
        while(q.size()!=0){
            int firstelem = q.poll(); //here both poll and remove can be used, both remove and return the first element of the queue
            System.out.print(firstelem+" ");
            for(int i=0; i<edges.length; i++){
                if(edges[firstelem][i]==1 && !visited[i]){ //check for all neighbours of firstElement if they have an edge and are not visited put them in the queue
                    q.add(i);
                    visited[i]=true;
                }       
            }
        }   
    } 
public static void print(int edges[][]){
        boolean visited[] = new boolean[edges.length]; //here edges.length is the number of vertices
        //here we loop through all the vertices if they are not visitied call the print helper function on it, to solve the problem of unconnected graphs
        for(int i=0; i< edges.length; i++){
            if(!visited[i]){
                printHelper(edges, i, visited);   
            }
        }
    }	
public static boolean hasPath(int edges[][],int v1,int v2,boolean visited[]) {
	if(v1>edges.length||v2>edges.length) 
		return false;
	if(edges[v1][v2]==1)
		return true;
	Queue<Integer> q=new LinkedList<Integer>();
	q.add(v1);
	visited[v1]=true;
	while(!q.isEmpty()) {
		int n=q.remove();
		for(int i=0;i<edges.length;i++) {
			if(edges[n][i]==1&&!visited[i]) {
				q.add(i);
				visited[i]=true;
			}
		}
	}
	if(visited[v2]==true) {
		return true;
	}
	else {
		return false;
	}
}
public static ArrayList<Integer> getpathBFS(int edges[][],int s,int e){
	Queue<Integer> q=new LinkedList<>();
	HashMap<Integer, Integer> h=new HashMap<>();
	boolean visited[]=new boolean[edges.length];
	visited[s]=true;
	q.add(s);
	h.put(s, -1);
	boolean pathfound=false;
	
	while(!q.isEmpty()) {
		int currentvertex=q.poll();
		for(int i=0;i<edges.length;i++) {
			if(edges[currentvertex][i]==1&&!visited[i]) {
				q.add(i);
				visited[i]=true;
				h.put(i,currentvertex);
				if(i==e) {
					pathfound=true;
					break;
				}
			}
		}
	}
	if(pathfound) {
		ArrayList<Integer> path=new ArrayList<Integer>();
		int currentvertex=e;
		while(currentvertex!=-1) {
			path.add(e);
			int parent=h.get(currentvertex);
			currentvertex=parent;
		}
		return path;
		}
	else {
		return null;
	}
	
}
public static void main(String[] args) throws NumberFormatException, IOException {
        
         Scanner s = new Scanner(System.in);
        int V = s.nextInt(); //here V stands for vertices
        int E = s.nextInt(); //here E stands for edges
        int edges[][] = new int[V][V]; //creates an adjaceny matrix for all vertices
        //taking input, loop from 0 to e-1, that is e times and get the starting and ending vertex
        for(int i =0; i< E; i++){
            int fv = s.nextInt(); //this takes first vertex of the edge
            int sv = s.nextInt(); //this takes second vertex of the edge
            edges[fv][sv] = 1;   
            edges[sv][fv] =1;
        }
        int start=s.nextInt();
    	int end=s.nextInt();
    	ArrayList<Integer> arr=getpathBFS(edges, start, end);
    	for(int i=0;i<arr.size();i++) {
    		System.out.print(arr.get(i)+" ");
    	}
        
      
	}

}