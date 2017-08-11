package threads;

public class RunDeadLock 
{

	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		Dead d = new Dead(dl);
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
		
	}
}


class Dead implements Runnable
{
	DeadLock dl;
	
	public Dead(DeadLock dl)
	{
		this.dl = dl;
	}
	
	public void run()
	{
		dl.test1();
		dl.test2();
	}
	
}


class DeadLock
{
	synchronized void test1()
	{
		System.out.println("Inside thread1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized void test2()
	{
		test1();
		System.out.println("Inside thread2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}