package threads;

public class RunDeamonThreads 
{
	public static void main(String[] args) {
		DeamonThreads t1 = new DeamonThreads();
		DeamonThreads t2 = new DeamonThreads();
		DeamonThreads t3 = new DeamonThreads();
		t1.setName("Deamon thread");
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class DeamonThreads extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Deamon thread " + Thread.currentThread().getName());
		}else
		{
			System.out.println("Regular thread "  + Thread.currentThread().getName());
		}
	}
}
