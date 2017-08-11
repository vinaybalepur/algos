package threads;

public class RunStaticSynchrnoizedBlock 
{
	public static void main(String[] args) 
	{
		StaticTable sta = new StaticTable();
		StaticSynchrnoizedBlock st = new StaticSynchrnoizedBlock(10,sta);
		StaticSynchrnoizedBlock st1 = new StaticSynchrnoizedBlock(2,sta);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st1);
		
		t1.start();
		t2.start();
	}
}


class StaticSynchrnoizedBlock implements Runnable
{
	int n;
	StaticTable st;
	public StaticSynchrnoizedBlock(int n, StaticTable st)
	{
		this.n = n;
		this.st = st;
	}
	
	public void run()
	{
		StaticTable.printTables(n);
		st.printThreadName();
	}
	

}


class StaticTable{
	
	public synchronized static  void  printTables(int n)
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
	
	public synchronized void printThreadName()
	{
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
