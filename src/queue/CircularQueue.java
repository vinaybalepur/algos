package queue;

/** This is for understanding circular queue. In circular queue, if we perform remove operation b4 completely filling
 * up the queue, there will be vacant spaces in the front. We can fill up the vacant spaces with newer values.
 * 
 * @author vinay
 *
 */

public class CircularQueue 
{
	int queue[];
	int rear = -1;
	int front = -1;
	public CircularQueue(int size)
	{
		queue = new int[size];
	}
	
	/** This is crucial function. Here we check first if queue is full. If it is not full, then we can add more values.
	 * Here full means there are no more empty spaces in the front to set new values, if the rear of the queue is filled up. 
	 * if queue is empty then we set rear and front as 0 and add a value to the array. This ensures value is added to
	 * the 0th index of the array. If the queue already has a value, then we increment the rear and then add a value
	 * to the queue. This will always ensure @ any given point of time, the queue is either full, or if it has empty
	 * space we can add new value to the empty space. The formula used to calculate rear value is (rear+1)%queuelenght. This 
	 * will give the next index value where new data can be set. If all the indexs are set with value this formula returns 0
	 * which means we can start adding values from 0th position provided it is free/empty.
	 */
	public void insert(int value)
	{
		if(isQueueFull())
		{
			System.out.println("Queue is full");
			
		}else if(isQueueEmpty())
		{
			rear = 0;
			front = 0;
		}else
		{
			rear = (rear+1)%queue.length;
		}
		queue[rear] = value;
	}
	
	/**
	 * This method returns the value from the queue. If both rear and front are in the same position it means
	 * only one value is present in the queue. After reading this value, we need to set the queue as empty
	 * that is front and rear variable set to -1. If not then read the value from the current position and increment
	 * the position of the front variable by using the formula front = (front + 1)%queueLength. This formula
	 * returns the position of the front as 0 once we reach the end of the queue. And if the rear is not set at 0
	 * we can continue to read values, until front and rear variable value becomes the same.
	 * @return
	 */
	public int remove()
	{
		int val = 0;
		
		if(isQueueEmpty())
		{
			
			System.out.println("The queue is empty");
			
		}else if(rear == front)
		{
			
			val = queue[front];
			rear = -1;
			front = -1;
			
		}else
		{
			val = queue[front];
			front = (front+1)%queue.length;
		}
		
		return val;
	}
	
	/**
	 * Queue is considered full only if the rear variable has reached a value equal to front variable. In a situation
	 * where we constantly remove elements from the queue front value changes by the number equalent to the itmes removed from
	 * the queue. In this case queue will never be full and there will always be empty cells where new data can be
	 * inserted. If (rear+1)%queueLenght becomes equal to front variable value, it means no more free cells to set new value. So
	 * we conclude queue to be full.
	 * @return
	 */
	public boolean isQueueFull()
	{
		
		if((rear+1)%queue.length == front)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isQueueEmpty()
	{
		if(rear== -1 && front == -1)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
