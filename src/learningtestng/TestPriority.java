package learningtestng;

import org.testng.annotations.Test;

public class TestPriority 
{
	
	@Test(priority = 200)
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority = 100)
	public void test2()
	{
		System.out.println("Test2");
	}

}
