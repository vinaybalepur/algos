package threads;

public class RunYield 
{
	
	public static void main(String[] args) {
		Runnable r1 = new Yield(5);
		Runnable r2 = new Yield(10);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}

}
