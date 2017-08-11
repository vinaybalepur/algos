package threads;

public class SynchronizedMain 
{
	
	public static void main(String[] args) 
	{
		Tables t = new Tables();
		
		SynchronizedBlock sb = new SynchronizedBlock(5,t);
		SynchronizedBlock sb1 = new SynchronizedBlock(4,t);
		
		Thread t1 = new Thread(sb);
		Thread t2 = new  Thread(sb1);
		
		t1.start();
		t2.start();
	}

}
