package threads;

public class Yield implements Runnable
{

	int number;
	public Yield(int number)
	{
		this.number = number;
	}
	
	public void run() {
		int i=0;
		while(i<10)
		{
			System.out.println(number);
			i++;
			System.out.println("Current thread before yeilding " + Thread.currentThread().getName());
//		    Thread.yield();
		    System.out.println("Current thread after yeilding " + Thread.currentThread().getName());
			
		}
		
	}

}
