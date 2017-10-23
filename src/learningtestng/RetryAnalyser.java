package learningtestng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryAnalyser implements IAnnotationTransformer
{

	
	public void transform(ITestAnnotation testannotation, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer a = testannotation.getRetryAnalyzer();
		
		if(a == null)
		{
			testannotation.setRetryAnalyzer(learningtestng.RetryFailedTests.class);
		}
		
	}

}
