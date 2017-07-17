package exceptions;

public class MultiExecption 
{
	
	/**
	 * We can have multiple try catch blocks. We should follow  Exception class hierarchy to ensure there are
	 * no compile time errors. Throwable <---------- Exception <---------- RuntimeException <---------- Any 
	 * class which implements RuntimeException class. In the following scenario code never reaches Exception or 
	 * Throwable block, since RuntimeException block catches the null pointer exception.
	 * 
	 *   ***********   <b>Follow exception hierarchy with multi catch</b>. **************************
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		try {
			exceptions();
		} catch (Throwable e) {
			System.out.println("-------- Inside throwable----------");
		}
	}
	
	@SuppressWarnings("null")
	static void exceptions() throws Throwable
	{
		String s = null;
		
		try
		{
//			System.out.println(10/0);
			System.out.println(s.charAt(0));
			
		}catch (ArithmeticException e) 
		{
			System.out.println("Inside arthmetic exception");
			
		}catch(RuntimeException r)
		{
			System.out.println("Inside Runtime exception");
		}
		catch(Exception e)
		{
			System.out.println("Inside exception");
			
		}catch(Throwable t)
		{
			System.out.println("Inside throwable");
		}
	}

}
