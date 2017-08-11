package threads;

public class SynchronizedBlock implements Runnable
{
	int n;
	Tables t;
	public SynchronizedBlock(int n, Tables t)
	{
		this.n = n;
		this.t = t;
	}
	
	public void run()
	{
		t.printTables(n);
	}
	

}


class Tables
{
	
	
	public  void  printTables(int n)
	{
		synchronized (this) {
			
		
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
}
