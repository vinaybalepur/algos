package queue;

/**
 * In queues, the concept is first in first out. What ever is added @ the beginning of the queue should be the first value to be removed.
 * 
 * @author vinay
 *
 */
public class QueueOfArrays 
{
	
	
	
	private int queue[];
	private int rearPosition = -1;
	private int frontPosition = -1;
	
	public QueueOfArrays(int queueSize)
	{
		queue = new int[queueSize];
		
	}
	
	
	/**
	 * A queue is considered empty only if both rear and front position variables are set as -1. This is a invalid index and hence we can
	 * conclude the queue is empty
	 * @return
	 */
	public boolean isQueueEmpty()
	{
		if(rearPosition == -1 & frontPosition == -1)
		{
			return true;
		}else {
			return false;
		}
	}
	
	/** This is used to insert value into the queue. If the queue is empty then we set the index of both rear and
	 * front postion as 0 and add a value to 0th index. If the queue has a value then we increment the rear position
	 * variable and set a value in the next index.
	 * @param i
	 */
	public void insert(int i)
	{
		if(isQueueEmpty())
		{
			rearPosition = 0;
			frontPosition = 0;
		}else if(!isQueueFull())
		{
			rearPosition++;
		}
		
		queue[rearPosition] = i;
	}
	
	/**
	 * This is used to remove a value from the queue. If the queue is empty then we cannot remove any value. 
	 * If both front and rear position variable are the same, then there is  only one value in the queue and
	 * we remove the value and  set the queue as empty. In all other scenarios the value from the queue is  
	 * removed one @ a time and front position is incremented by one.
	 * @return
	 */
	public int remove()
	{
		int removedItem = 0;
		if(isQueueEmpty())
		{
			System.out.println("Queue is empty");
		}else if(rearPosition == frontPosition)
		{
			removedItem = queue[frontPosition];
			rearPosition = -1;
			frontPosition = -1;
		}else
		{
			removedItem = queue[frontPosition++];
		}
		
		return removedItem;
	}
	
	public boolean isQueueFull()
	{
		if(rearPosition == queue.length)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
}
