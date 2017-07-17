package exceptions;

public class ReturnStatementWithException 
{
	
	public static void main(String[] args) {
//		String s = getStringWithoutFinally();
//		System.out.println(s);
//		String s1 = getStringWithFinally();
//		System.out.println( s1);
		
		String s2 = getString();
		System.out.println( s2);
	}
	
	/** 
	 * In the following scenario getStringWithoutFinally is having multiple catch blocks. Since the code throws
	 * null pointer exception only NullPointerException Block is executed.
	 * 
	 * ******** 
	 * 
	 * There is a return statement inside try block, 
	 * Each catch block also has a return statement.
	 * If we have a return statement out side try catch, it will lead to unreachable code error. 
	 * If any of the catch block does not have a return statement, then mandatory to provide one outside all the try catch blocks. 
	 * In the following scenario comment out the return inside any of the catch and also comment out the return outside the
	 * try catch, we will get a compile time error. 
	 * Uncomment the return statement outside the try catch, then the error will go away. 
	 * 
	 * ******************
	 * 
	 * @return
	 */
	static String getStringWithoutFinally()
	{
		String s= null;
		
		try {
			return s.concat(null); // Since try is returning value we cannot have return outside try catch
		}catch(NullPointerException n)
		{
			return "Inside catch";
		}catch(Throwable t)
		{
			return "Inside throwable";
		}
//		return "outside";
	}
	
	
	/** 
	 * The following method has multiple try catch with finally. Here try block is returning a value.
	 * ******* 
	 * It is not mandatory to have a return statement inside finally, if all the catch have a return statement.
	 * If any of the catch does not have a return statement, then mandatory to have a return statement inside
	 * finally or outside all try catch blocks.
	 * It is okay to have return statement inside finally block, and return statement inside all the other catch blocks. 
	 * Only finally return statement will be executed with or without exception. i.e only finally return will get executed
	 * and try block return will not be executed. 
	 * In the following scenario give proper values instead of null to s and concat s. Still only "Inside finally" will be returned. 
	 * In the following scenario, "Inside finally" will be printed, even though there is an exception thrown.
	 * If any of the catch does not have a return statement, then mandatory to have return statement inside finally
	 * or outside all the try catch block.
	 * ***********
	 * @return
	 */
	@SuppressWarnings("finally")
	static String getStringWithFinally()
	{
		String s= null;
		
		try 
		{
			return s.concat(null);
			
		}catch(NullPointerException n)
		{
			return "Inside catch";
		}catch(Throwable t)
		{
			return "Inside throwable";
		}finally
		{
			return "Inside finally";
		}
//		return "outside";
	}
	
	/**
	 * In the following scenario there is no return statement inside catch.
	 * **********
	 * 
	 * This is a straight forward scenario, where there  is no return statement inside try block.
	 * There may or may not be a return statement inside all the catch block.
	 * Mandatory to have a return statement outside all the try catch block. Other wise compile time error.
	 * Comment out "outside" return statement and there will be a compile time error.
	 * If there is a finally block, then we cannot have a return statement outside all try catch.
	 * Since finally will get executed with or without exception, we cannot  have return outside  finally block.
	 * 
	 * ***********
	 * @return
	 */
	static String getString()
	{
		String s = null;
		try
		{
			s.concat(null);
		}catch(NullPointerException n)
		{
			return "Inside catch";
		}catch(Throwable t)
		{
			return "Inside throwable";
		}
//		finally
//		{
//			return "Inside finally";
//		}
		return "outside";
		
	}

}
