package com.greatlearning.LongestPath.Driver;

import java.util.ArrayList;

public class LongestPath {
	static class Node
	{
		Node leftNode;
		Node rightNode;
		int nodeData;
	};
	static Node newNode(int nodeData) {
		Node temp = new Node();
		temp.nodeData=nodeData;
		temp.leftNode=null;
		temp.rightNode=null;
		return temp;
	}
	
	public static ArrayList<Integer> findLongestPath(Node root)
	{
		if(root== null)
		{
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}
		//recursive call on rightNodeList 
		ArrayList<Integer> rightNodeList =findLongestPath(root.rightNode);
		ArrayList<Integer> leftNodeList =findLongestPath(root.leftNode);
		//Compare size of array list
		//insert current node
		if(rightNodeList.size() < leftNodeList.size())
		{
			leftNodeList.add(root.nodeData);
		}
		else
		{
			rightNodeList.add(root.nodeData);
		}
		return (leftNodeList.size()>rightNodeList.size() ? leftNodeList : rightNodeList);
		
}
	public static void main(String args[])
	{
		Node root = newNode(100);
		root.leftNode=newNode(20);
		root.rightNode=newNode(130);
		root.leftNode.leftNode=newNode(10);
		root.leftNode.rightNode=newNode(50);
		root.rightNode.leftNode=newNode(110);
		root.rightNode.rightNode=newNode(140);
		root.leftNode.leftNode.leftNode=newNode(5);
		
		ArrayList<Integer> output = findLongestPath(root);
		int size = output.size();
		
		System.out.print(output.get(size-1));
		for(int i=size-2;i>=0;i--)
		{
			System.out.print("->"+output.get(i));
		}
		
	}
}


