package learningtestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 
{
	
	@Test(enabled=false)
	public void test1()
	{
		Assert.assertEquals(1, 1);
	}
	
	@Test(enabled = false, timeOut=10)
	public void test2()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(1, 1);
	}
	
	/** This is failed because we are expecting the test method to throw arithmetic exception and 
	 * the method does not throw the exception.
	 */
	@Test(enabled = false, expectedExceptions = {ArithmeticException.class})
	public void test3()
	{
		System.out.println(1/1);
	}
	
	@Test(enabled = false, dataProvider = "testData")
	public void test4(Object o1, Object o2)
	{
		System.out.println((int)o1+(int)o2);
	}
	
	@Parameters("browser")
	@Test(enabled = false)
	public void getParams(String p)
	{
		System.out.println(p);
	}
	
	@Parameters("a")
	@Test(enabled = false)
	public void getParams2(@Optional("browser") String p)
	{
		System.out.println(p);
	}
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] o = new Object[2][2];
		o[0][0] = 1;
		o[0][1] = 2;
		o[1][0] = 3;
		o[1][1] = 4;
		return o;
	}
	
	@DataProvider
	public Object[] getOneDimensionalData()
	{
		Object o[] =  {1234};
		return o;
	}

	
	@Test(enabled = false, dataProvider = "getOneDimensionalData")
	public void oneDimension(Object o)
	{
		System.out.println(o);
	}
	
	@Test(invocationCount = 50, threadPoolSize = 50)
	public void testThreadPoolSize()
	{
		System.out.println(Thread.currentThread().getId() + " -- " + System.currentTimeMillis());

	}
}
