package Fulltest1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	//JUMPING NUMBERS
	public static void showJumpingNos(int x) {
		System.out.print(0+" ");
		for(int i=1;i<=9&&i<=x;i++){
			bfsHelper(x,i);
		}
	}
	private static void bfsHelper(int x,int num){
		Queue<Integer> q=new LinkedList<>();
		q.add(num);
		while(!q.isEmpty())
		{
			num=q.remove();
			if(num<=x)
			{
				System.out.print(num+" ");
				
				int last_digit =num%10;
				if (last_digit == 0) {
	                    q.add((num*10)+(last_digit+1));
	                }
					 else if (last_digit == 9) {
	                    q.add((num*10)+(last_digit-1));
	                }
					 else {
	                     q.add((num*10)+(last_digit+1));
						  q.add((num*10)+(last_digit-1));
	                }
			}
		}
	}
	
	//Backspace problem
	public static String backspace(String S){ 
	        Stack<Character> q = new Stack<Character>();

	        for (int i = 0; i < S.length(); ++i) {
	          if (S.charAt(i) != '#')
	            q.push(S.charAt(i));
	          else if (!q.isEmpty())
	            q.pop();
	        }

	        // build final string
	        String ans = "";

	        while (!q.isEmpty()) {
	          ans += q.pop();
	        }

	        // return final string
	        String answer = "";
	        for (int j = ans.length() - 1; j >= 0; j--) {
	          answer += ans.charAt(j);
	        }
	        return answer;
	        }
	
	//Merge Two BSTs
	public static void inorder(BinaryTreeNode<Integer> node){
		if(node==null)
		return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}	
	public static ArrayList<Integer>  storeInorderUtil(BinaryTreeNode<Integer> node,ArrayList<Integer> list){
		if(node==null)
		return list;
		storeInorderUtil(node.left,list);
		list.add(node.data);
		storeInorderUtil(node.right,list);
		return list;
	}
	public static ArrayList<Integer> merge(ArrayList<Integer> list1,ArrayList<Integer> list2,int m,int n){
		ArrayList<Integer> list3=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<m&&j<n)
		{
			if(list1.get(i)<list2.get(j)){
				list3.add(list1.get(i));
				i++;
			}
			else{
				list3.add(list2.get(j));
				j++;
			}
		}
		while(i<m)
		{
			list3.add(list1.get(i));
			i++;
		}
		while(j<n)
		{
				list3.add(list2.get(j));
				j++;
		}
		return list3;
	}
	public static BinaryTreeNode<Integer> ALtoBST(ArrayList<Integer> list,int start ,int end){
		if(start>end)
		return null;
		int mid=(start+end)/2;
		BinaryTreeNode<Integer> node=new BinaryTreeNode(list.get(mid));
		node.left=ALtoBST(list,start,mid-1);
		node.right=ALtoBST(list,mid+1,end);
		return node;
			}
	public static ArrayList<Integer> storeInorder(BinaryTreeNode<Integer> node){
				ArrayList<Integer> list1=new ArrayList<>();
				ArrayList<Integer> list2=storeInorderUtil(node, list1);
				return list2;
		}
	public static BinaryTreeNode<Integer> mergetrees(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2){
				ArrayList<Integer> list1=storeInorder(root1);
				ArrayList<Integer> list2=storeInorder(root2);
				ArrayList<Integer> list3=merge(list1,list2,list1.size(),list2.size());
				BinaryTreeNode<Integer> node=ALtoBST(list3,0,list3.size()-1);
				return node;
		}	
	public static void printMergeTrees(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2) {
		BinaryTreeNode<Integer> node=Solution.mergetrees(root1, root2);
		inorder(node);		 
		}
	

	
	public static void main(String[] args) {
		//jumping numbers
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
	    Solution.showJumpingNos(x);
	    s.close();
	    
	    //Backspace problem
	    Scanner sc=new Scanner(System.in);
        String n=s.next();
        String xc=Solution.backspace(n);
        System.out.print(xc);
        
        //Merge Two BSTs
        
	}
}
