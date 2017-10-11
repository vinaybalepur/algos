package learningtestng;

import org.testng.annotations.Test;

public class TestGroup {

	
	@Test(groups = {"smoke"})
	public void smoke1()
	{
		System.out.println( "Smoke1");
	}
	
	@Test(groups = {"smoke"})
	public void smoke2()
	{
		System.out.println("Smoke2");
	}
	
	@Test(groups = {"regression"})
	public void regression1()
	{
		System.out.println( "Regression1");
	}
	
	@Test(groups = {"regression"})
	public void regression2()
	{
		System.out.println("Regression2");
	}
	
	@Test(groups = {"regression", "smoke"})
	public void mixed()
	{
		System.out.println("mixed");
	}
	
	
	@Test(dependsOnMethods = {"independentTest"})
	public void dependentTest()
	{
		System.out.println("Inside dependent");
		
	}
	
	@Test
	public void independentTest()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
