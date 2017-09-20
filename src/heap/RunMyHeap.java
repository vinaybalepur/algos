package heap;

public class RunMyHeap implements Comparable<Integer>
{
	
	public static void main(String[] args) {
		MyHeap<Integer> heap = new MyHeap<Integer>();
		heap.insert(1);
		heap.insert(2);
		heap.insert(3);
		heap.insert(4);
		heap.insert(5);
		heap.insert(6);
//		heap.insert(7); 
		System.out.println(heap.toString());
		System.out.println(heap.delete());
		System.out.println( heap.toString());
		System.out.println(heap.delete());
		System.out.println( heap.toString());
		System.out.println(heap.delete());
		System.out.println( heap.toString());
		heap.insert(6);
		System.out.println(heap.toString());
//		System.out.println(new RunMyHeap().compareTo(20));
	}

	@Override
	public  int compareTo(Integer i) 
	{
		return i.compareTo(5);
		
	}

}
