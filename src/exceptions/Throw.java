package exceptions;

public class Throw 
{
	
	public static void main(String[] args) {
//		throwArthemticException();
//		throwRunTimeException();
//		throwException();
		try
		{
			throwSomeExcption();
		}catch (RuntimeException r)
		{
			System.out.println("Caught exception");
		}
		
		int i = 10;
		Integer a = new Integer(i);
		System.out.println("i= " + i);
		System.out.println("a= " + a);
		Double d = new Double(i);
		System.out.println("d=" + d);
		
		long d1 = 1;
		Integer in = new Integer((int) d1);
		System.out.println( in);
	}
	
	static void throwArthemticException()
	{
		try
		{
			System.out.println(1/0);
		}catch(ArithmeticException a) {
			throw new ArithmeticException("Throwing run time exception");
		}
	}
	
	static void throwRunTimeException()
	{
		try
		{
			System.out.println(1/0);
		}catch(RuntimeException r)
		{
			throw new RuntimeException("Throwing run time exception");
		}
	}
	
	static void throwException()
	{
		try {
			System.out.println(1/0);
		}catch(Exception e)
		{
			try {
				throw new Exception("Throwing exception");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	static void throwSomeExcption() throws RuntimeException
	{
		
		System.out.println(1/0);
		
	}

}
