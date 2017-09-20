package heap;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyHeap<T extends Comparable<T>> 
{

	private ArrayList<T> items;
	
	/* Create a empty array list to hold values*/
	public MyHeap()
	{
		items = new ArrayList<>();
	} 
	
	/* Insert the value and call shift up method. This method shifts the inserted value to the correct position*/
	public void insert(T v)
	{
		items.add(v);
		shiftup();
	} 
	
	/* 
	 * Shift up shifts the value up from the last node to it's final location. Every time a value is added, then the shift up comes into picture
	 * and starts shifts the value up the  chain until  value reaches its place. 
	 * Parent index of any child index is calculated using (k-1)/2, where k is the index position of the child.
	 * If the parent value is lesser than the current inserted value, then the current value is swapped with the parent value.
	 */
	private void shiftup()
	{
		int k = items.size()-1;
		while(k>0)
		{
			int parentIndex = (k-1)/2;
			T item = items.get(k);
			T parentValue = items.get(parentIndex);
			
			if(item.compareTo(parentValue) > 0)
			{
				items.set(parentIndex, items.get(k));
				items.set(k, parentValue);
				k = parentIndex;
			}else
			{
				break;
			}
		}
	}
	
	/**
	 * This is used to delete the root value. Always remember, deletion happens from the root. Once the root value is deleted, we push the
	 * right most leaf value to root.
	 * Once value is pushed to root, then depending on if it is lesser than the child node value, it is shifted down.
	 * @return
	 */
	public T delete()
	{
		if(items.size() == 0)
		{
			throw new NoSuchElementException();
		}
		
		if(items.size() == 1)
		{
			return items.remove(0);
		}
		
		T hold = items.get(0);
		items.set(0, items.remove(items.size()-1));
		shiftDown();
		return hold;
		
	}
	
	/**
	 * This shifts down the value based on a simple comparison. If the root value is lesser than the child values, then first the child values
	 * are compared. Which ever child value is higher, that value is swapped with root value and the pointer k is pushed to that index.
	 */
	private void shiftDown()
	{
		int k = 0; // pointer
		int leftChildIndex = (2*k) +1; // left child
		int rightChildIndex = leftChildIndex+ 1; // right child
		int highestNoIndex = 0; // used to get the index of the child value based on if it is higher. So in index 2 if value is 10 and index 3
		                           // value is 20, then highestNoIndex will be 3.   
		T valueInRightNode; // Value of the rightChildNode
		T valueInLeftNode;  // Value of leftChildNode
		int lastNode = items.size()-1; // Last node of the list
		
		/** Have a loop and run this until rightChildIndex is less than lastNode. Once right child index becomes more
		 * then it means there are no more child nodes.
		 */
		while(rightChildIndex<lastNode)
		{
			
			
			valueInLeftNode = items.get(leftChildIndex);
			
			valueInRightNode = items.get(rightChildIndex);
			
			/**
			 * This does the comparison to get the index of the highest child Value
			 */
			highestNoIndex = rightChildIndex;
			if(valueInLeftNode.compareTo(valueInRightNode)>0)
			{
				highestNoIndex = leftChildIndex;
			}
			
			/** Simple swap to swap values based on the higher data*/
			if(items.get(highestNoIndex).compareTo(items.get(k))>0)
			{
				T temp = items.get(k);
				items.set(k, items.get(highestNoIndex));
				items.set(highestNoIndex, temp);
				k = highestNoIndex;
			}else
			{
				break;
			}
			
			leftChildIndex = (2*k) + 1;
			rightChildIndex = leftChildIndex+1;
		}
	}
	 
	
	
	public String  toString()
	{
		return items.toString();
	}
}
