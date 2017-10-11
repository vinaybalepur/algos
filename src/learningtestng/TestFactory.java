package learningtestng;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactory 
{
	
	@Factory
	public Object[] factoryMethod()
	{
		return new Object[] {new MyFactory(), new FactoryWithArgs(1), new FactoryWithArgs(2)};
	}

}


class MyFactory
{
	@Test
	public void test1()
	{
		System.out.println( "Inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Inside Test2");
	}
}

