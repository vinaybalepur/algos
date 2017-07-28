package threads;

public class TestStartCar 
{
	
	public static void main(String[] args) {
		StartCar s1 = new StartCar("Mercedes");
		StartCar s2 = new StartCar("BMW");
		
		Runnable r = new StartCar("runner");
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		Thread t3 = new Thread(r);
		t1.setName("Thread1");
		t1.start();
		
		t2.start();
		t3.start();
	}

}
