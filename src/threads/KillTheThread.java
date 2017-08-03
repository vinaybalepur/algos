package threads;

public class KillTheThread 
{
	
	public static void main(String[] args) 
	{
		Analysis a = new Analysis();
		WatchDog w = new WatchDog(a, a, 1000);
		
	}

}
