package threads;

public class RunThreadPriorities 
{
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " -- " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getName() + " -- " + Thread.currentThread().getPriority());
		
		ThreadPriorities tp = new ThreadPriorities();
		Prioritites p1 = new Prioritites(5, tp);
		Prioritites p2 = new Prioritites(4, tp);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		System.out.println("Thread t1 priority is " + t1.getPriority());
		System.out.println("Thread t2 priority is " + t2.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Thread t1 priority is " + t1.getPriority());
		System.out.println("Thread t2 priority is " + t2.getPriority());
		
		t1.start();
		t2.start();
	}

}

class Prioritites implements Runnable
{
	int n;
	ThreadPriorities t;
	
	public Prioritites(int n, ThreadPriorities t)
	{
		this.n = n;
		this.t = t;
	}
	
	public void run()
	{
		System.out.println( "Inside run " + Thread.currentThread().getName());
		t.tables(n);
	}
}


class ThreadPriorities
{
	
	public  void tables(int n)
	{
		for(int i =1;i<5;i++)
		{
			System.out.println(i*n);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}