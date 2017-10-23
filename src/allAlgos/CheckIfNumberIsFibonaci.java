package allAlgos;

public class CheckIfNumberIsFibonaci 
{
	
	public static void main(String[] args) {
		
		int n = 6;
		
		System.out.println(isPerfectSquare((5*n*n)+4));
		System.out.println(isPerfectSquare((5*n*n)-4));
		
		
	}
	
	static boolean isPerfectSquare(int n)
	{
		int sqrt = (int)Math.sqrt(n);
		double sqrt1 = Math.sqrt(n);
		if(sqrt == sqrt1)
		{
			return true;
		}
		return false;
	}
	static String test(String a, String b)
	{
		a = a.toLowerCase();
		b = b.toLowerCase();
		String r = a+b;
		return r;
	}

}
