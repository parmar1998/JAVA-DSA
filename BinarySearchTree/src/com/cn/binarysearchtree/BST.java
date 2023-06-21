package com.cn.binarysearchtree;

/*
*. Binary Search Tree is a node-based binary tree data structure which has the following properties
2. The left subtree of a node contains only nodes with keys lesser than the node’s key.
3. The right subtree of a node contains only nodes with keys greater than the node’s key.
4. The left and right subtree each must also be a binary search tree.
*/
public class BST {

	BinaryTreeNode<Integer> root;
	private int size;
	
	//checking whether node is present
	public boolean isPresent(int x) {
		return ispresentHelperBoolean(root,x);
	}
	private boolean ispresentHelperBoolean(BinaryTreeNode<Integer> node, int x) {
		if(node==null) {
			return false;
		}
		if(node.data==x) {
			return true;
		}
		if(x<node.data) {
			return ispresentHelperBoolean(node.left, x);
		}
		else {
			return ispresentHelperBoolean(node.right, x);
		}
		
	}
	
	//printing the BST
	public void printTreeHelper(BinaryTreeNode<Integer> node) {
		if(node==null) {
			return ;
		}
		
		System.out.print(node.data);
		
		if(node.left!=null) {
			System.out.print("L : "+node.left.data+", ");
		}
		
		if(node.right!=null) {
			System.out.print("R"+node.right.data);
		}
		
		System.out.println();
		printTreeHelper(node.left);
		printTreeHelper(node.right);
		
	}
	public void print() {
		printTreeHelper(root);
	}

	//Inserting the node
	public void insert(int data) {
		root=insertHelper(root,data);
	}
	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int key) {
		if(node==null) {
			node=new BinaryTreeNode<Integer>(key);
			return node;
		}
		else if(key<node.data) {
			node.left=insertHelper(node.left, key);
		}
		else if(key<node.data) {
			node.right=insertHelper(node.right, key);
		}
		return node;
	}

	//Minimum of BST
	public static int minvalue(BinaryTreeNode<Integer> root) {
		int minvalue=root.data;
		while(root.left!=null) {
			minvalue=root.left.data;
			root=root.left;
		}
		return minvalue;
	}

	//remove from BST
	public void remove(int data) {
		removeHelperTest(root,data);
	}
	private static BinaryTreeNode<Integer> removeHelperTest(BinaryTreeNode<Integer> root,int key){
		if(root==null) {
			return null;
		}
		if(key<root.data) {
			root.left=removeHelperTest(root.left, key);
		}
		else if(key>root.data) {
			root.right=removeHelperTest(root.left, key);
		}
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=minvalue(root.right);
			root.right=removeHelperTest(root.right, root.data);
		}
		return root;
	}
	


}
