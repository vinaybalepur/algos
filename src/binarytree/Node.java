package binarytree;

public class Node implements Comparable<Node>
{
	
	public int key;
	public String value;
	
	public Node leftChild;
	public Node rightChild;
	
	public Node(int key, String value)
	{
		this.key = key;
		this.value = value;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
