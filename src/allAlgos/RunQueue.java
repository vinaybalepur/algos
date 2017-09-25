package allAlgos;

public class RunQueue 
{
	public static void main(String[] args) {
		Queue q = new Queue(3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isQueueEmpty());
		System.out.println(q.isQueueFull());
	}
}


class Queue{
	private int front;
	private int rear;
	private Integer data[];
	private int size;
	
	public Queue(int size)
	{
		if(size == 0)
		{
			throw new RuntimeException();
		}
		
		front =-1;
		rear = -1;
		data = new Integer[size];
		this.size = size;
	}
	
	public void enqueue(int value)
	{
		if(isQueueFull()) {
			throw new RuntimeException("Queue is full");
		}else if(isQueueEmpty())
		{
			rear =0;
			front =0;
			data[front] = value;
			front = front+1;
		}else {
			data[front] = value;
			front = front+1;
			front = (front+1)%size;
		}
	}
	
	public int dequeue()
	{
		int position =  (rear+1)%size;
		if(isQueueEmpty())
		{
			throw new RuntimeException("Queue is empty cannot dequeue");
		}else if( position == front)
		{
			int x = data[rear];
			rear = -1;
			front = -1;
			return x;
		}else
		{
			int x = data[rear];
			rear = rear+1;
			return x;
		}
	}
	
	public boolean isQueueFull()
	{
		if((front+1)%size == rear)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isQueueEmpty()
	{
		if(front == -1 && rear ==-1)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
