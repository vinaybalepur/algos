package learningtestng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(learningtestng.RetryAnalyser.class)
public class RetryTests 
{
	
	@Test()
	public void test1()
	{
		Assert.assertEquals(1, 2);
	}

}
