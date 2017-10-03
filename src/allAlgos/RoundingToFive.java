package allAlgos;

public class RoundingToFive 
{

	public static void main(String[] args) {
		System.out.println(roundToFive(90));
		test(2,6);
	}

	/** This rounds to the closet number 
	 * If the number has to be rounded to 5, then get the reminder of the given number when divided by 5.
	 * If the reminder is less than 3, then don't round it, else round it to the next closet number which
	 * can be divided by 5.
	 * Ex: 81. The reminder is 1. Since it is less than 3 we will not round it to 85.
	 * Ex: 83. The reminder is  3. Rounding it to 5, logic is n - reminder + 5.
	 * @param n
	 * @return
	 */
	static int roundToFive(int n)
	{
		int reminder = n%5;
		System.out.println( reminder);
		if(reminder >=3)
		{
			return (n-reminder) + 5;
		}
		return n;
	}
	
	static void test(int n, int i)
	{
		System.out.println((n+1)%i );
		System.out.println((double)(n+1) / i);
		
		
	}
}