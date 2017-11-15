package learningtestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactoryWithArgs
{
	private int i;
	
	public FactoryWithArgs(int i)
	{
		this.i = i;
	}
	
	@Test
	public void test()
	{
		Assert.assertEquals(1, i);
	}
	
	
	
}
