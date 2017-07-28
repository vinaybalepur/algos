package threads;

public class RunSynchronize
{
	public static void main(String[] args) {
		
		Runnable r = new Synchronize(5);
		Runnable r1 = new Synchronize(10);
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r1);
		t1.setName("Thread1");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
