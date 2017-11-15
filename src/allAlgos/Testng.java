package allAlgos;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng 
{
	@Parameters("browser")
	@Test(enabled = false, timeOut = 30000, expectedExceptions = {NumberFormatException.class, ArithmeticException.class})
	public void test(@Optional("chrome") String p)
	{
		
	}
	
	@Test(enabled = false, threadPoolSize = 5, invocationCount=20)
	public void test1()
	{
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(enabled = false ,groups = {"smoke, regression"})
	public void tes2()
	{
		
	}
	
	@Test(dependsOnMethods = {"test4"})
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@Test()
	public void test4()
	{
		System.out.println("Test4");
	}
	
	@Test(dependsOnGroups = {"smokeer"})
	public void test5()
	{
		System.out.println("Test5");
	}

}
