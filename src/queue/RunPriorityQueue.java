package queue;

public class RunPriorityQueue 
{
	
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(5);
		pq.insert(3);
		pq.insert(5);
		pq.insert(1);
		pq.insert(4);
		pq.insert(2);
		
		while(!pq.isQueueFull())
		{
			System.out.println(pq.remove());
		}
	}

}
