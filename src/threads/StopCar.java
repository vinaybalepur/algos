package threads;

public class StopCar extends Thread
{
	String s = "";
	public StopCar(String car)
	{
		s= "Stopping " + car; 
	}
	
	public void run()
	{
		int i=0;
		while(i<10) {
			System.out.println(s);
			i++;
		}
	}
}
