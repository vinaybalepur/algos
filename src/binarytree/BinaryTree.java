package binarytree;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree 
{

	/**
	 * Binary tree allows us to insert data and do a very quick search. 
	 * The first node of BT is called root.
	 * Initially root is  empty, hence we set the new node as root.
	 * After this left side of the parent should have lesser value than it and right side should have more value than it.
	 * Initially before  inserting any value the current node is set as root and another node variable parent is created.
	 * There is a infinite loop running, which checks if the current node is null or node. If the current node is null and
	 * if the value to be inserted is lesser than parent node, then the value is inserted to the right else the value is 
	 * inserted to the left.
	 * Every time root is the starting  point for insertion. The while loop will keep changing the parent, until the current node becomes null.
	 * In the below sequence, first 10 is inserted as the root. Since 5 is less than 10, it is inserted on the left side of 10.
	 * Post this for the  subsequent insertion 5 becomes parent. Since 4 is lesser than  5, it is inserted on the left side of 5.
	 * Post this 4 is the parent and since 2 is leser than 4, it is inserted below 4.
	 * The while loop starts running and reaches 5, making 5 as the parent. Since 7 is greater than 5, the value is inserted as the right child of 5
	 * Since 50 is greater than the root value 10, it is inserted on the right child of 10.
	 * Similarly 60 is greater than the child 50 and hence it is inserted on the right side of 50
	 *                                                       10
	 *                                                    5     50
	 *                                                  4   7      60
	 *                                                2      
	 */
	
	
	private Node root = null;
	
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.addNode(10, "vinay");
		bt.addNode(5, "Harshu");
		bt.addNode(4, "four");
		bt.addNode(2, "hithesh");
		bt.addNode(7, "sagar");
		bt.addNode(50, "hello");
		bt.addNode(60, "bye");
		
//		bt.preOrderTraversal();
//		bt.traverseInOrder();
		bt.levelOrderTraversal();
		
	}
	
	public void addNode(int key, String value)
	{
		Node current = root;
		Node parent;
		Node newNode = new Node(key, value);
		if(root == null)
		{
			root = newNode;
		}else
		{
			while(true)
			{
				parent = current;
				if(key < current.key)
				{
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}else
				{
					current = current.rightChild;
					if(current == null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public  void preOrderTraversal()
	{
		
		if(root == null)
		{
			return;
		}
		
		Stack<Node> s = new Stack<Node>();
		while(true)
		{
			while(root !=null)
			{
				System.out.println("The key is " + root.key + ". The value is " + root.value);
				s.push(root);
				root = root.leftChild;
			}
			
			if(s.isEmpty())
			{
				return;
			}
		
			root = s.pop();
			System.out.println("The popped key is " + root.key);
			root = root.rightChild;
		}
				
	}	
	
	public void traverseInOrder()
	{
		
		
		if(root == null)
		{
			return;
		}
		Stack<Node> s = new Stack<Node>();
		while(true)
		{
			while(root != null)
			{
				s.add(root);
				root = root.leftChild;
			}
			
			if(s.isEmpty())
			{
				return;
			}
			
			root = s.pop();
			System.out.println("The key is " + root.key);
			root = root.rightChild;
		}
	}
	
	public void levelOrderTraversal()
	{
		Queue<Node> q = new PriorityQueue<Node>();
		Node temp;
		if(root == null)
		{
			return;
		}
		q.add(root);
		while(!q.isEmpty())
		{
			temp = q.remove();
			System.out.println(temp.key);
			
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
	}
	
}

	






