package queue;

public class RunQueueOfArrays 
{
	
	public static void main(String[] args) {
		
		QueueOfArrays q = new QueueOfArrays(4);
		
		System.out.println("Queue is empty " + q.isQueueEmpty());
		System.out.println("Queue is full " + q.isQueueFull());
		q.remove();
		q.insert(0);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		
//		System.out.println("Queue is full " + q.isQueueFull());
//		
//		System.out.println(q.remove());
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		q.remove();
		
		while(!q.isQueueEmpty())
		{
			System.out.println(q.remove());
		}
		
	}

}
