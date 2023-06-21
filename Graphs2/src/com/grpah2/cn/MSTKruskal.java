package com.grpah2.cn;

import java.util.Arrays;
import java.util.Scanner;

//Minimum acyclic connected Graph
//minimum no of edges to still keep it connected
//this concept comes in weighted graph - in this you have to keep the minimum weight and keep it connected
//so here we use KRUSKAL ALGORITHM for building MST.
//Steps
/*
 * Choose edges with minimum weight
 * we have to add in such a way that there should be no cycle present,if cycle present because of an edges, skip
 * will make use of union find algorithm - in which we will update the parent, because of which parent gets updated 
 * if same parent don't consider
 */
class Edge implements Comparable<Edge>
{

	int source;
	int destination;
	int weight;
	
	@Override
	public int compareTo(Edge o){
		return this.weight-o.weight;
	}

}
public class MSTKruskal {

	public static int parentcall(int[] parent,int vertex){
        if(vertex==parent[vertex])
            return  vertex;
        return parentcall(parent,parent[vertex]);
    }
	
	public static void kruskals(Edge input[],int vertices){
	//sorting the array in ascending order
		Arrays.sort(input);
		int count=0;
		int k=0;
		Edge output[]=new Edge[vertices-1];
		int parents[]=new int[vertices];
		//here we maintain a parent array
		for(int j=0;j<vertices;j++) {
			parents[j]=j;
		}
		//here we are checking that whether the graph node parents are same or not.if same then cycle will be formed which we dont want
		while(count!=vertices-1) {
			Edge currentEdge=input[k];
			int sourceparent=parentcall(parents, currentEdge.source);
			int destinationparent=parentcall(parents, currentEdge.destination);
			if(sourceparent!=destinationparent) {
				output[count]=currentEdge;
				count++;
				parents[sourceparent]=destinationparent;
			}
			k++;
		}
		for(int i=0;i<vertices-1;i++) {
				if(output[i].source<=output[i].destination) {
					System.out.println(output[i].source+" "+output[i].destination+" "+output[i].weight);
				}
				else {
					 System.out.println(output[i].destination+" "+output[i].source+" "+output[i].weight);
				}
		}
		
	}
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int v=s.nextInt();
			int E=s.nextInt();
			Edge input[]=new Edge[E];
			for(int i=0;i<input.length;i++) {
				input[i]=new Edge();
				input[i].source=s.nextInt();
				input[i].destination=s.nextInt();
				input[i].weight=s.nextInt();
			}
			kruskals(input, v);
			s.close();
	}
}
