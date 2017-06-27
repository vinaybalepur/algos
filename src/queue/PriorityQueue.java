package queue;

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
