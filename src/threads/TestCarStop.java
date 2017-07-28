package threads;

public class TestCarStop 
{
	
	public static void main(String[] args) 
	{
		
		StopCar s1 = new StopCar("Mercedes");
		StopCar s2 = new StopCar("BMW");
		
		s1.start();
		s2.start();
		
	}

}
