package com.greatlearning.Main;


	class Node
	{
	int data;
	Node left,right;
	Node(int item)
	{
	data = item;
	left = right = null;
	}
	}
	public class driver {
		static void findSkew(Node root)
		{
			if(root != null)
			{
				findSkew(root.left);
				System.out.println(root.data);
				findSkew(root.right);
			}
		}
		
		
		public static void main(String args[])
		{
			Node node  = new Node(50);

			node.left = new Node(30);
			node.right = new Node(60);
			node.left.left = new Node(10);
			node.right.left =  new Node(55);
			findSkew(node);
			
			
			
			}
	}


