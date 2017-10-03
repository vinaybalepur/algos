package allAlgos;

import java.util.PriorityQueue;

public class Heap {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(9);
		
		int k = 7;
		System.out.println(findSweet(pq, k));			
	}
	
	
	static int findSweet(PriorityQueue pq, int k)
	{
		int counter = 1;
		while(!pq.isEmpty())
		{
			int least = (int) pq.poll();
			if(pq.isEmpty())
			{
				counter =  -1;
				break;
			}
			int secondleast = (int) pq.poll();
			int total = least*1 + secondleast*2;
			if(total>=k)
			{
				break;
			}else
			{
				pq.add(total);
				counter = counter+1;
			}
		}
		return counter;

	}
}
