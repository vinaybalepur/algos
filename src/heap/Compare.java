package heap;

public class Compare implements Comparable<Integer>{

	
	public static void main(String[] args)
	{
		Compare c = new Compare();
		System.out.println( c.compareTo(3));
		System.out.println(c.compareTo(40));
		System.out.println( c.compareTo(5));
	}

	
	public int compareTo(Integer o) 
	{
		return (o.compareTo(5));
	}
}
