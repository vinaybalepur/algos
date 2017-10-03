package allAlgos;

import java.util.ArrayList;

public class RunBinaryHeap {

}

class BinaryHeap<T extends Comparable<T>>
{
	
	private ArrayList<T> heap;
	public BinaryHeap()
	{
		heap = new ArrayList<T>();
	}
	
	public void insert(T value)
	{
		heap.add(value);
	}
	
	private void shiftDown(T value)
	{
		if(heap.size()==1)
		{
			return;
		}
		
		int n = heap.size()-1;
		while(n>0)
		{
			int parentIndex = (n-1)/2;
			T parentValue = heap.get(parentIndex);
			if(parentValue.compareTo(value) == 1)
			{
				T temp = heap.get(parentIndex);
				heap.set(parentIndex, value);
			}
		}
	}

	
}
