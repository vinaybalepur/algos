package customexception;

public class TestTheException 
{
	
	public static void main(String[] args) {
		checkAge(10);
	}
	
	public static void checkAge(int age)
	{
		if(age<18)
		{
			try {
				throw new InvalidAgeException("Age is less");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
