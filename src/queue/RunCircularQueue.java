package queue;

public class RunCircularQueue 
{
	
	public static void main(String[] args) {
		CircularQueue q = new  CircularQueue(3);
		
		q.insert(1);
		q.insert(2);
		q.insert(3);
		
//		System.out.println(q.remove());
//		q.insert(10);
//		System.out.println(q.remove());
//		q.insert(100);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.remove());
		
		while(!q.isQueueEmpty())
		{
			System.out.println(q.remove());
		}
	}

}
