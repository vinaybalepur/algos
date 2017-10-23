package binarytree;

import java.util.Stack;

public class CreateTreeFromSortedList
{

	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6,7};
		
		CreateBinaryTree bst = new CreateBinaryTree();
		TreeNode root = bst.sortedArrayToBST(i, 0, i.length-1);
		preOrderTraversal(root);
		
	}
	
	public static void preOrderTraversal(TreeNode root)
	{
		
		if(root == null)
		{
			return;
		}
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(true)
		{
			while(root !=null)
			{
				System.out.println("The value is " + root.data);
				s.push(root);
				root = root.leftChild;
			}
			
			if(s.isEmpty())
			{
				return;
			}
		
			root = s.pop();
			root = root.rightChild;
		}
				
	}	
}


class CreateBinaryTree
{
	TreeNode root;
	
	TreeNode sortedArrayToBST(int ar[], int start, int end)
	{
		if(start>end)
		{
			return null;
		}
		
		int mid = (start+end)/2;
		
		TreeNode node = new TreeNode(ar[mid]);
		
		node.leftChild = sortedArrayToBST(ar, start, mid-1);
		
		node.rightChild = sortedArrayToBST(ar, mid+1, end);
		
		return node;
	}
}
class TreeNode implements Comparable<TreeNode>
{
	int data;
	TreeNode leftChild, rightChild;
	
	TreeNode(int n)
	{
		this.data =n;
		leftChild = rightChild = null;
	}

	@Override
	public int compareTo(TreeNode o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}