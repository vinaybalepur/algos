package threads;

public class Analysis implements Runnable, ThreadStopper
{
	private boolean stop= false;
	
	public void stopThread() 
	{
		stop = true;
		
	}

	
	public void run()
	{
		while(!stop)
		{
			System.out.println("Analysing");
		}
		
	}
}


interface ThreadStopper
{
	public void stopThread();
}

class WatchDog 
{
	
	public  WatchDog(Runnable r, ThreadStopper ts, int ms)
	{
		Thread t = new Thread(r);
		t.start();
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ts.stopThread();
	}

}