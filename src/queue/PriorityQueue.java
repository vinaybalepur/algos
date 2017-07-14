package queue;

/*
 * Priority queue is same as queue, with one major difference. For the values entered, there will be a priority
 * assigned. The highest priority will be moved to the  top and lowest will be at the bottom of the queue. So 
 * when inserting values into the queue, sort the  values based on priority. Sorting will be ascending where
 * the lowest number will be at the top and highest number will be at the bottom. Since there is ordering required,
 * insertion of value takes more time. Reading and deleting will not take extra time since the queue is index based.
 */

public class PriorityQueue 
{
	int front =0;
	int queue[];
	int min = 0;
	
	public PriorityQueue(int size)
	{
		queue = new int[size];
	}
	
	public void insert(int i)
	{
		int temp;
		if(front == 0)
		{
			queue[0]= i;
			
		}else
		{
			for(int j=front-1;j>=0;j--)
			{
				if(queue[j]>i)
				{
					temp = queue[j];
					queue[j] = i;
					queue[j+1] = temp;
				}else
				{
					queue[j+1] = i;
					break;
				}
				
			}	
		}
		front++;
	}
	
	public int remove()
	{
		
		return queue[min++];
	}
	
	public boolean isQueueFull()
	{
		if(min == queue.length)
		{
			return true;
		}else
		{
			return false;
		}
	}

}
