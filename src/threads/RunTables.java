package threads;


public class RunTables implements Runnable
{
	CreateTables ct;
	int n;
	
	public RunTables(CreateTables ct, int n)
	{
		this.ct = ct;
		this.n = n;
	}
	
	public void run()
	{
		ct.printTables(n);
		
	}
}

class CreateTables
{
	
	public synchronized void  printTables(int n)
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
