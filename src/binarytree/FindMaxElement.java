package binarytree;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindMaxElement {

	public static void main(String[] args) 
	{
		int i[] = {2,6,8,0,1,3,9};
		Arrays.sort(i);
		
		CreateBinaryTree tree = new CreateBinaryTree();
		TreeNode root = tree.sortedArrayToBST(i, 0, i.length-1);
		System.out.println(getHighestValueInTree(root));
	}
	
	private static int getHighestValueInTree(TreeNode root)
	{
		Queue<TreeNode> q = new PriorityQueue<TreeNode>();
		TreeNode temp = null;
		int min_value = Integer.MIN_VALUE;		
		q.add(root);
		while(!q.isEmpty())
		{
			temp = q.remove();
			if(temp.data > min_value)
			{
				min_value= temp.data;
			}
			if(temp.leftChild != null)
			{
				q.add(temp.leftChild);
			}
			if(temp.rightChild != null)
			{
				
				q.add(temp.rightChild);
			}
		}
		q = null;
		return min_value;
	}
}
