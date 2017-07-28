package threads;

public class Synchronize implements Runnable
{
	int number;
	
	
	public Synchronize(int number)
	{
		this.number = number;
		
	}

	public void run()
	{
		int i=0;
		while(i<10)
		{
			System.out.println(number);
			i++;
			if(Thread.currentThread().getName().equals("Thread1")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
